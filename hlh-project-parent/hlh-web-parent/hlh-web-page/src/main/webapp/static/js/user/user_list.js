$(document).ready(function() {
    initGrid();
    $("#searchCostList").off().on().click(function(){
        queryUserList();
    });
    //$("#addCost").off().on().click(function(){
    //    showAddDiv();
    //});
    //$("#saveOrUpdateCost").off().on().click(function(){
    //    saveOrUpdateCost();
    //});
    //$("#hideAddDiv").off().on().click(function(){
    //    hideAddDiv();
    //});
    //$("#costAmount").off().on().blur(function(){
    //    syncCostBudget();
    //});

});

function saveOrUpdateCost(){
    var url_ = 'ajaxAddOrUpdateCost';
    var costAmount = $("#costAmount").val();
    var costBudget = $("#costBudget").val();
    var costPhone = $("#costPhone").val();
    var reg = /^(\-)?\d+(\.\d{1,2})?$/;
    if(!costAmount || !reg.test(costAmount)){
        layer.alert("消费金额填写错误！",{icon: 5, skin: 'layer-ext-moon'});
        return false;
    }
    if(costBudget && !reg.test(costBudget)){
        layer.alert("消费预算填写错误！",{icon: 5, skin: 'layer-ext-moon'});
        return false;
    }
    reg = /^(1)\d{10}$/;
    if(costPhone && !reg.test(costPhone)){
        layer.alert("请填写正确的手机号",{icon: 5, skin: 'layer-ext-moon'});
        return false;
    }
    $.ajax({
        url:url_,
        type:'post',
        dataType: "json",
        data:{
            'costType':$("#costTypeAdd").val(),
            costDetail:$("#costDetailAdd").val(),
            status:$("#statusAdd").val(),
            costUserName:$("#costUserName").val(),
            costPhone:costPhone,
            costAmount:costAmount,
            costBudget:costBudget,
            costTimeStr:$("#costTime").val(),
            description:$("#description").val(),
            id:$("#addId").val()
        },
        success:function(data){
            console.info(data);
            layer.alert(data.message);
            if(data.status==true){
                hideAddDiv();
                window.location.href=window.location.href;
            }
        }
    });
}

function showAddDiv(id){

    if(id){
        $('#dialogCost').dialog({
            title: '修改消费记录',
            width: 600,
            height: 400,
            modal: 'true'
        });
        var rowData = $('#costList').jqGrid('getRowData', id);
        $("#addId").val(id);
        $("#costTypeAdd").val(rowData.costType);
        $("#costDetailAdd").val(rowData.costDetail);
        $("#statusAdd").val(rowData.status);
        $("#costTime").val(rowData.costTimeStr);
        $("#costAmount").val(rowData.costAmount);
        $("#costBudget").val(rowData.costBudget);
        $("#costUserName").val(rowData.costUserName);
        $("#costPhone").val(rowData.costPhone);
        $("#description").val(rowData.description);
    }else{
        $('#dialogCost').dialog({
            title: '新建消费记录',
            width: 600,
            height: 400,
            modal: 'true'
        });
        $("#addId").val('');
        $("#costTypeAdd").val('GROUP');
        $("#costDetailAdd").val('FOOD');
        $("#statusAdd").val('VALID');
        $("#startTime").val(getFormatDate(new Date(), 'yyyy-MM-dd'));
        //setDefaultTime();
        $("#costAmount").val('');
        $("#costBudget").val('');
        $("#costUserName").val('');
        $("#costPhone").val('');
        $("#description").val('');
    }
}

function hideAddDiv(){
    $('#dialogCost').dialog("close");
}

function queryUserList(){
    $("#userList").jqGrid('setGridParam', {
        url : "ajaxQueryUserList",
        datatype : "json",
        mtype : "POST",
        postData : getUserListParams()
    }).trigger("reloadGrid");
}

function initGrid() {
    $("#userList").jqGrid({
        url : "ajaxQueryUserList",
        datatype : "json",
        mtype : "POST",
        colNames : ['编号','用户名','用户昵称','真实名字','手机号','详细地址','会员类型enum','会员类型','会员账号状态enum','会员账号状态','描述','创建人', '创建时间',
            '修改人','修改时间', "操作"],
        colModel : [
                {
                    name : 'id',
                    index : 'id',
                    align : 'center',
                    sortable:false
                },{
                    name : 'username',
                    index : 'username',
                    align : 'center',
                    sortable:false
                },{
                    name : 'nickname',
                    index : 'nickname',
                    align : 'center',
                    sortable:false
                }, {
                    name : 'realname',
                    index : 'realname',
                    align : 'center',
                    sortable:false
                },{
                    name : 'phone',
                    index : 'phone',
                    align : 'center',
                    sortable:false
                }, {
                    name : 'address',
                    index : 'address',
                    align : 'center',
                    sortable:false
                },{
                    name : 'userType',
                    index : 'userType',
                    align : 'center',
                    hidden : true,
                    sortable:false
                }, {
                    name : 'userTypeStr',
                    index : 'userTypeStr',
                    align : 'center',
                    sortable : false
                }, {
                    name : 'status',
                    index : 'status',
                    align : 'center',
                    sortable : false,
                    hidden: true
                },{
                    name : 'statusStr',
                    index : 'statusStr',
                    align : 'center',
                    cellattr: addStatusCellAttr,
                    sortable : false
                }, {
                    name : 'description',
                    index : 'description',
                    align : 'center',
                    sortable : false
                },{
                    name : 'createTimeStr',
                    index : 'createTimeStr',
                    align : 'center',
                    sortable:false
                }, {
                    name : 'createBy',
                    index : 'createBy',
                    align : 'center',
                    sortable:false
                }, {
                    name : 'updateTimeStr',
                    index : 'updateTimeStr',
                    align : 'center',
                    sortable:false
                }, {
                    name : 'updateBy',
                    index : 'updateBy',
                    align : 'center',
                    //hidden : true,
                    sortable:false
                }, {
                    name : 'operate',
                    index : 'operate',
                    align : 'center',
                    sortable:false
                }
            ],
        rowNum:10,            //每页显示记录数
        autowidth: true,      //自动匹配宽度
        pager: '#pager',      //表格数据关联的分页条，html元素
        rowList:[10,20,50,200],   //分页选项，可以下拉选择每页显示记录数
        viewrecords: true,    //显示总记录数
        height:'auto',//高度，表格高度。可为数值、百分比或'auto'
        //autoheight: true,     //设置高度
        gridview:true,        //加速显示
        multiselect : false,
        sortable:true,        //可以排序
        sortname: 'createDate',  //排序字段名
        sortorder: "desc",    //排序方式：倒序
        caption : "消费记录列表",
        postData : getUserListParams(),
        jsonReader : {
            root : "results",               // json中代表实际模型数据的入口
            page : "paging.page",       // json中代表当前页码的数据
            records : "paging.records", // json中代表数据行总数的数据
            total:'paging.total',       // json中代表页码总数的数据
            repeatitems : false             // 如果设为false，则jqGrid在解析json时，会根据name来搜索对应的数据元素（即可以json中元素可以不按顺序）；而所使用的name是来自于colModel中的name设定。
        },
        onPaging : function(pgButton) {
            $("#userList").jqGrid('setGridParam', {
                postData : getUserListParams()
            });
        }
        //,
        //gridComplete:function(){  //在此事件中循环为每一行添加
        //    var ids=jQuery("#userList").jqGrid('getDataIDs');
        //    var operateClick;
        //    for (var i = 0; i < ids.length; i++) {
        //        var id = ids[i];
        //        var rowData = $('#userList').jqGrid('getRowData', id);
        //        var userId = rowData['id'];
        //        var status = rowData['status'];
        //        var statusStr = rowData['statusStr'];
        //        //显示设为有效/ 无效链接
        //        if(statusStr=="有效"){
        //            operateClick = '<a href="javascript:void(0)" style="color:blue" onclick="modifyCostStatus(' + "'" +
        //                costId+ "' ,'" + status + "' ,'" + statusStr + "'" + ')" >设为无效</a>'
        //                +" | <a href='javascript:void(0)' onclick='showAddDiv("+id+")' style='color:blue;'>编辑</a>";
        //        }else{
        //            operateClick = '<a href="javascript:void(0)" style="color:blue" onclick="modifyCostStatus(' + "'" +
        //                costId+ "' ,'" + status + "' ,'" + statusStr + "'" + ')" >设为有效</a>';
        //        }
        //
        //        jQuery("#costList").jqGrid('setRowData', id, {operate: operateClick});
        //    }
        //}
    });
}

function addStatusCellAttr(rowId, val, rawObject, cm, rdata) {
    if (val=='无效') {
        return "style='color:red'";
    }
}

function getUserListParams(){
    return {
        'userType' : $("#userType").val(),
        'status' : $("#status").val()
    }
}
/**
 * 设置默认时间
 */
function setDefaultTime() {
    $("#costTime").val(getFormatDate(new Date(), 'yyyy-MM-dd'));
    //var curDate = new Date();
    //var startDate = (curDate.getFullYear()-1) + "/" + (curDate.getMonth() + 1);
    //$(".startTime").val(getFormatDate(new Date(startDate), 'yyyy-MM-dd'));
    //$('.endTime').val(getFormatDate(new Date(), 'yyyy-MM-dd'));
}

function syncCostBudget(){
    $("#costBudget").val($("#costAmount").val());
}

//修改消费状态
function modifyCostStatus(id, status, validStatusStr) {
    if (validStatusStr=="有效") {
        status = "INVALID";
        layer.prompt({
            title: '设为无效，请填写原因。',
            formType: 2 //prompt风格，支持0-2
        }, function(reason){
            ajaxModifyCostStatus(id, status,reason);
        });
    }else{
        status = "VALID";
        /*gnl = */
        layer.confirm("确认将该记录设为有效？",{btn: ['确定','取消'] },
                function(){
                    ajaxModifyCostStatus(id, status,'');
                    //layer.close(gnl);
                }
        );
    }
}

function ajaxModifyCostStatus(id, status,reason){
    $.ajax({
        url : 'modifyCostStatus',
        type:'post',
        dataType : "json",
        data : {
            id:id,
            status : status,
            reason : reason
        },
        success: function(data){
            if(data.status)
                window.location.reload();
            else
                layer.alert(data.message);
        }
    });
}