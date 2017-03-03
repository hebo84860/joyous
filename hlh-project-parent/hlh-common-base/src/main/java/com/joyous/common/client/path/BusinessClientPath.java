package com.joyous.common.client.path;



public enum BusinessClientPath {

	/**订单查询搜索操作 --start*/
    QUERY_HOLIDAY_LIST(Path.QUERY_HOLIDAY_LIST, "查询预售天内的节假日"),
    QUERY_ALL_CITY_LIST(Path.QUERY_ALL_CITY_LIST, "获取全部有效城市"),
    QUERY_STATION(Path.QUERY_STATION, "查询列车站点信息"),
    QUERY_CITY(Path.QUERY_CITY, "查询城市信息"),
    /**订单查询搜索操作 --end*/

    /** 多供应商回调结果操作 --start*/
    BOOKING_CALLBACK(Path.BOOKING_CALLBACK,"订单供应商预定回调"),
    CONFIRM_TICKET_CALLBACK(Path.CONFIRM_TICKET_CALLBACK,"供应商确认出票回调"),
    CANCEL_ORDER_CALLBACK(Path.CANCEL_ORDER_CALLBACK,"供应商取掉订单回调"),
    RETURN_TICKET_CALLBACK(Path.RETURN_TICKET_CALLBACK,"订单退票回调"),
    RETURN_MONEY_OFFLINE_CALLBACK(Path.RETURN_MONEY_OFFLINE_CALLBACK, "线下退款通知回调"),
    SAVE_OR_UPDATE_REFUND_MONEY(Path.SAVE_OR_UPDATE_REFUND_MONEY, "保存修改退款记录表"),
    QUERY_TRAIN_OFFLINE_REFUND_MONEY_LIST(Path.QUERY_TRAIN_OFFLINE_REFUND_MONEY_LIST, "退款列表查询"),
    QUERY_ACCOUNT_LIST(Path.QUERY_ACCOUNT_LIST, "线下退款通知回调"),
    /** 多供应商回调结果操作  --end*/

    /** 火车票订单相关操作 --start*/
    BOOKING(Path.BOOKING, "订单供应商预定"),
    CANCEL_ORDER(Path.CANCEL_ORDER, "订单供应商取消订单"),
    REPEAT_CANCEL_ORDER_STATE(Path.REPEAT_CANCEL_ORDER_STATE, "人工回退符合条件的已取消订单"),
    CONFIRM_TICKET(Path.CONFIRM_TICKET,"订单向供应商确认出票"),
    RETURN_TICKET(Path.RETURN_TICKET,"订单供应商退票"),
    RETURN_TICKET_WAP(Path.RETURN_TICKET_WAP,"订单供应商退票"),

    DELETE_ORDER_BY_ORDER_ID(Path.DELETE_ORDER_BY_ORDER_ID, "根据订单Id删除订单"),
    SELECT_ORDER_LIST(Path.SELECT_ORDER_LIST, "查询订单列表"),
    QUERY_ORDER_DISPLAY_DETAIL(Path.QUERY_ORDER_DISPLAY_DETAIL, "查询订单前端显示详情"),
    QUERY_ORDER_OFFLINE(Path.QUERY_ORDER_OFFLINE, "后台查询订单列表"),
    VIEW_ORDER_OFFLINE(Path.VIEW_ORDER_OFFLINE, "后台订单详情"),
    QUERY_ORDER_TICKET_OFFLINE(Path.QUERY_ORDER_TICKET_OFFLINE, "后台查询客票信息列表"),
    QUERY_TICKET_REFUND_MONITOR_LIST(Path.QUERY_TICKET_REFUND_MONITOR_LIST, "出票监控查询"),
    QUERY_TICKET_MONITOR_LIST(Path.QUERY_TICKET_MONITOR_LIST, "出票监控查询"),
    QUERY_ORDER_ITEM(Path.QUERY_ORDER_ITEM, "查询订单item信息"),
    SELECT_TRAIN_ORDER_WAIT_TRAVEL(Path.SELECT_TRAIN_ORDER_WAIT_TRAVEL, "查询N小时后待出行的订单"),
    QUERY_TRAIN_REFUNDABLE_TICKET_LIST(Path.QUERY_TRAIN_REFUNDABLE_TICKET_LIST, "查询订单可退票的乘客信息"),
    SMS_NOT_PAID(Path.SMS_NOT_PAID, "15min未支付订单，短信提示"),

    QUERY_ORDER_OFFLINE_OF_EXPORT(Path.QUERY_ORDER_OFFLINE_OF_EXPORT, "后台订单列表导出"),
    QUERY_ORDER_TICKET_OFFLINE_OF_EXPORT(Path.QUERY_ORDER_TICKET_OFFLINE_OF_EXPORT, "后台客票信息列表导出"),
    ADD_TRAIN_LOSC(Path.ADD_TRAIN_LOSC, "新增火车Losc信息"),
    TICKET_MONITOR_EXPORT(Path.TICKET_MONITOR_EXPORT, "出票监控导出"),
    TICKET_REFUND_MONITOR_EXPORT(Path.TICKET_REFUND_MONITOR_EXPORT, "退票监控导出"),

    /**订单备注操作 --start*/
    ADD_ORDER_REMARK(Path.ADD_ORDER_REMARK, "新增订单备注信息"),
    QUERY_ORDER_REMARK_LIST(Path.QUERY_ORDER_REMARK_LIST, "查询订单备注列表"),
    ADD_ORDER_LOG(Path.ADD_ORDER_LOG, "新增订单日志信息"),
    QUERY_ORDER_LOG_LIST(Path.QUERY_ORDER_LOG_LIST, "查询订单日志列表"),
    /**订单备注操作 --start*/
    /**订单流量统计操作 --start*/
    QUERY_API_FLOW_LIST(Path.QUERY_API_FLOW_LIST,"查询流量列表"),
    QUERY_API_FLOW_LIST_COUNT(Path.QUERY_API_FLOW_LIST_COUNT,"查询流量统计"),
    QUERY_API_FLOW_LIST_FOR_CSV(Path.QUERY_API_FLOW_LIST_FOR_CSV,"导出流量列表"),
    QUERY_API_FLOW_COUNT_LIST_FOR_CSV(Path.QUERY_API_FLOW_COUNT_LIST_FOR_CSV,"导出流量统计列表"),
    /**订单流量统计操作 --start*/
    /** 手动同步订单状态 */
    UPDATE_ORDER_CONFIRM_TICKET_STATE(Path.UPDATE_ORDER_CONFIRM_TICKET_STATE,"同步出票状态"),
    UPDATE_ORDER_REFUND_TICKET_STATE(Path.UPDATE_ORDER_REFUND_TICKET_STATE,"修改退票状态"),
    UPDATE_ORDER_REFUND_AMOUNT_STATE(Path.UPDATE_ORDER_REFUND_AMOUNT_STATE,"修改退款状态"),
    /** 新系统操作日志 */
    ADD_TRAIN_OPER_LOG(Path.ADD_TRAIN_OPER_LOG,"添加新系统操作日志"),
    QUERY_TRAIN_OPER_LOG(Path.QUERY_TRAIN_OPER_LOG,"查询系统操作日志"),
    /** 用户基本信息管理查询*/
    QUERY_USER_INFO(Path.USER_INFO_QUERY, "用户基本信息管理查询"),
    /**下单请求记录查询**/
    QUERY_TRAIN_ORDER_REQ_RECORD_LIST_OF_EXPORT(Path.QUERY_TRAIN_ORDER_REQ_RECORD_LIST_OF_EXPORT,"导出下单请求记录信息"),
    QUERY_TRAIN_ORDER_REQ_RECORD_LIST(Path.QUERY_TRAIN_ORDER_REQ_RECORD_LIST,"查询下单请求记录列表"),

    /** 火车票订单相关操作 --start*/

    /** 订单支付退款操作 --start*/
    PAY(Path.PAY,"申请支付"),
    PAY_CALL_BACK_SIMULATION(Path.PAY_CALL_BACK_SIMULATION,"后台支付回调模拟"),
    PAY_CALLBACK(Path.PAY_CALLBACK, "支付回调"),
    REFUND_CALLBACK(Path.REFUND_CALLBACK, "退款回调"),
    REFUND(Path.REFUND, "退款"),
    REFUND_TRAIN_OFFLINE(Path.REFUND_TRAIN_OFFLINE, "线下操作退款"),
    QUERY_REFUND_LIST(Path.QUERY_REFUND_LIST, "查询退款信息"),
    QUERY_PAY_LIST(Path.QUERY_PAY_LIST, "查询支付信息"),
    /** 订单支付退款操作   --end*/

    /** 火车票供应商交易信息记录管理 --start*/
    QUERY_TRANSDETAIL_LIST(Path.QUERY_TRANSDETAIL_LIST, "查交易明细列表"),
    EXPORT_TRANSDETAIL_LIST(Path.EXPORT_TRANSDETAIL_LIST, "导出交易明细"),
    EXPORT_ACCOUNT_LIST(Path.EXPORT_ACCOUNT_LIST, "导出账户"),
    ADD_ACCOUNT(Path.ADD_ACCOUNT, "新增账户"),
    ADD_TRANSDETAIL(Path.ADD_TRANSDETAIL, "新增交易明细"),
    DELETE_ACCOUNT_BY_ID(Path.DELETE_ACCOUNT_BY_ID, "账户设为无效"),
    DELETE_TRANSDETAIL_BY_ID(Path.DELETE_TRANSDETAIL_BY_ID, "交易明细设为无效"),
    QUERY_ACCOUNT_AND_TRANSDETAIL(Path.QUERY_ACCOUNT_AND_TRANSDETAIL, "账户交易明细立即更新数据"),
    UPDATE_ACCOUNT(Path.UPDATE_ACCOUNT, "编辑账户"),
    UPDATE_TRANSDETAIL(Path.UPDATE_TRANSDETAIL, "编辑交易明细"),
    /** 火车票供应商交易信息记录管理  --start*/

    /** 火车票站点管理 --start*/
    ADD_STATION(Path.ADD_STATION, "新增站点"),
    DELETE_STATION_BYID(Path.DELETE_STATION_BYID, "站点设为无效"),
    UPDATE_STATION(Path.UPDATE_STATION, "编辑站点"),
    IMPORT_EXCEL(Path.IMPORT_EXCEL, "导入Excel"),
    ACTIVATE_STATION(Path.ACTIVATE_STATION, "站点设为有效"),
    QUERY_TRAIN_STATION_LIST(Path.QUERY_TRAIN_STATION_LIST, "查询站点"),
    QUERY_TRAIN_ALL_STATION_LIST(Path.QUERY_TRAIN_ALL_STATION_LIST, "查询所有列车站点"),
    /** 火车票站点管理 --start*/

    /** 火车票结算管理 --start*/
    QUERY_TRAIN_SETTLEMENT(Path.QUERY_TRAIN_SETTLEMENT,"结算列表查询"),
    TRAIN_SETTLEMENT_EXPORT(Path.TRAIN_SETTLEMENT_EXPORT,"结算列表导出"),
    TRAIN_SETTLEMENT_TO_VST(Path.TRAIN_SETTLEMENT_TO_VST,"推送火车票结算"),
    TRAIN_OFFLINE_TO_VST_SETTLEMENT(Path.TRAIN_OFFLINE_TO_VST_SETTLEMENT,"后台新增推送火车票结算"),
    QUERY_NO_SETTLEMENT_ITEMS_TO_VST(Path.QUERY_NO_SETTLEMENT_ITEMS_TO_VST,"查询未推送结算子订单列表"),

    /** 火车票结算管理 --end*/

    /** 火车票保险管理 --start*/
    QUERY_TRAIN_INSURANCE_LIST(Path.QUERY_TRAIN_INSURANCE_LIST,"查询火车票保单列表"),
    SAVE_TRAIN_INSURANCE_ORDER(Path.SAVE_TRAIN_INSURANCE_ORDER,"保存火车票保单列表"),
    ARTIFICIAL_TRAIN_INSURANCE(Path.ARTIFICIAL_TRAIN_INSURANCE,"火车票人工投保"),//封装机票提供的投保接口，提供统一的接口
    HESITATE_TRAIN_INSURANCE(Path.HESITATE_TRAIN_INSURANCE,"火车票人工废保"),
    QUERY_ORDER_TICKET_INFO(Path.QUERY_ORDER_TICKET_INFO,"根据票号查询乘车人、车次等相关信息"),
	//公共查询接口
	COMMON_QUERY_INSURANCE_LIST(Path.COMMON_QUERY_INSURANCE_LIST,"查询可用保险列表"),
	COMMON_QUERY_INSURANCE_ORDER(Path.COMMON_QUERY_INSURANCE_ORDER,"查询保单详情"),
    /** 火车票保险管理 --end*/

    /** 配送规则 --start*/
    SAVE_TRAIN_DISTRIBUTION_RULE(Path.SAVE_TRAIN_DISTRIBUTION_RULE,"新增或修改配送规则"),
    QUERY_TRAIN_DISTRIBUTION_RULE_LIST(Path.QUERY_TRAIN_DISTRIBUTION_RULE_LIST,"条件查询配送规则列表"),
    UPDATE_TRAIN_DISTRIBUTION_RULE_STATUS(Path.UPDATE_TRAIN_DISTRIBUTION_RULE_STATUS,"修改配送规则有效状态"),
    VALID_OFFLINE_DISTRIBUTION_RULE(Path.VALID_OFFLINE_DISTRIBUTION_RULE,"验证线下配送规则"),
    /** 配送规则 --end*/

    /** 供应商订单（线下订单） */
    QUERY_TRAIN_ORDER_SUPP_LIST(Path.QUERY_TRAIN_ORDER_SUPP_LIST,"查询线下订单列表"),
    QUERY_TRAIN_ORDER_SUPP_DETAIL(Path.QUERY_TRAIN_ORDER_SUPP_DETAIL,"查询线下订单详情"),
    TRAIN_ORDER_SUPP_CONFIRM_TICKET(Path.TRAIN_ORDER_SUPP_CONFIRM_TICKET,"线下订单出票成功或无票驳回"),
    UPDATE_TRAIN_ORDER_SUPP(Path.UPDATE_TRAIN_ORDER_SUPP,"修改线下订单信息"),
    ADD_TRAIN_ORDER_SUPP_REMARK(Path.ADD_TRAIN_ORDER_SUPP_REMARK,"添加线下订单备注"),
    QUERY_TRAIN_ORDER_SUPP_REMARK(Path.QUERY_TRAIN_ORDER_SUPP_REMARK,"查询线下订单备注列表"),

    /** 12306常用联系人接口 */
    PASSENGER_ADD_12306(Path.PASSENGER_ADD_12306, "添加常用联系人信息(12306)"),
    PASSENGER_DELETE_12306(Path.PASSENGER_DELETE_12306, "删除常用联系人信息(12306)"),
    PASSENGER_EDIT_12306(Path.PASSENGER_EDIT_12306, "修改常用联系人信息(12306)"),
    PASSENGER_QUERY_12306(Path.PASSENGER_QUERY_12306, "获取常用联系人信息(12306)"),
    CHECK_LOGIN_INFO_12306(Path.CHECK_LOGIN_INFO_12306, "校验12306登录信息"),
    HANDLE_QUERY_PASSENGER_CALLBACK(Path.HANDLE_QUERY_PASSENGER_CALLBACK, "供应商回调处理查询用户12306常用联系人结果"),
    HANDLE_ADD_PASSENGER_CALLBACK(Path.HANDLE_ADD_PASSENGER_CALLBACK, "供应商回调处理添加12306联系人结果"),
    HANDLE_EDIT_PASSENGER_CALLBACK(Path.HANDLE_EDIT_PASSENGER_CALLBACK, "供应商回调处理编辑12306联系人结果"),
    HANDLE_DELETE_PASSENGER_CALLBACK(Path.HANDLE_DELETE_PASSENGER_CALLBACK, "供应商回调处理删除12306联系人结果"),
    QUERY_TRAIN_USER_PASSENGER_LIST(Path.QUERY_TRAIN_USER_PASSENGER_LIST, "查询12306联系人信息"),
    GET_USER_LOGIN_INFO(Path.GET_USER_LOGIN_INFO, "查询用户是否登录了12306账号"),
    CHECK_ACCOUNT(Path.CHECK_ACCOUNT, "12306账号核验"),
    SAVE_TRAIN_USER_INFO(Path.SAVE_TRAIN_USER_INFO, "保存12306登录信息"),
    UPDATE_TRAIN_ACCOUNT_12306(Path.UPDATE_TRAIN_ACCOUNT_12306, "更新驴妈妈账号绑定的火车票账号的信息"),
    GET_TRAIN_ACCOUNTS_12306(Path.GET_TRAIN_ACCOUNTS_12306, "查询用户绑定且未删除的12306账号列表"),

    /** 线下导单接口 */
    TRAIN_IMPORT_GROUP_ORDER(Path.TRAIN_IMPORT_GROUP_ORDER, "线下团体票导单"),
    TRAIN_IMPORT_ADDORUPDATE_ITEM(Path.TRAIN_IMPORT_ADDORUPDATE_ITEM, "线下订单添加联系人信息"),
    TRAIN_IMPORT_AUDIT_CONFIRMTICKET(Path.TRAIN_IMPORT_AUDIT_CONFIRMTICKET, "线下订单导单审核出票"),
    TRAIN_IMPORT_DELETE_ORDER(Path.TRAIN_IMPORT_DELETE_ORDER, "线下订单删除导单"),
    QUERY_ORDER_ITEM_PAGE(Path.QUERY_ORDER_ITEM_PAGE, "分页查询订单item信息"),
    TRAIN_IMPORT_ORDER_DELETE_ITEM(Path.TRAIN_IMPORT_ORDER_DELETE_ITEM, "删除询订单item信息"),
    /** 代售点管理 **/
    IMPORT_TRAIN_TICKET_AGENT_EXCEL(Path.IMPORT_TRAIN_TICKET_AGENT_EXCEL, "代售点导入"),
    EXPORT_TRAIN_TICKET_AGENT_EXCEL(Path.EXPORT_TRAIN_TICKET_AGENT_EXCEL, "代售点导出"),
    SAVE_OR_UPDATE_TRAIN_TICKET_AGENT(Path.SAVE_OR_UPDATE_TRAIN_TICKET_AGENT, "代售点增加或更新"),
    DELETE_TRAIN_TICKET_AGENT_BY_ID(Path.DELETE_TRAIN_TICKET_AGENT_BY_ID, "代售点删除"),
    QUERY_TRAIN_TICKET_AGENT_LIST(Path.QUERY_TRAIN_TICKET_AGENT_LIST, "代售点查询"),
    QUERY_TRAIN_TICKET_AGENT_AREA_LIST(Path.QUERY_TRAIN_TICKET_AGENT_AREA_LIST, "代售点区域查询"),

    /** 发送短信公共接口 */
    SEND_SMS_INTERFACE(Path.SEND_SMS_INTERFACE, "发送短信公共接口"),

    /** 火车票资讯 */
    SAVE_TRAIN_NEWS(Path.SAVE_TRAIN_NEWS, "保存资讯"),
    DELETE_TRAIN_NEWS_BY_ID(Path.DELETE_TRAIN_NEWS_BY_ID, "根据Id删除资讯"),
    IMPORT_TRAIN_NEWS_EXCEL(Path.IMPORT_TRAIN_NEWS_EXCEL, "导入资讯"),
    QUERY_TRAIN_NEWS_LIST(Path.QUERY_TRAIN_NEWS_LIST, "查询资讯"),
    EXPORT_TRAIN_NEWS_EXCEL(Path.EXPORT_TRAIN_NEWS_EXCEL, "导出资讯"),


    /** 多供应商 路由 操作**/
    SUPP_LOCK_ORDER_CALLBACK(Path.SUPP_LOCK_ORDER_CALLBACK,"多供应商订单锁定回调"),
    SUPP_REFUND_ORDER_CALLBACK(Path.SUPP_REFUND_ORDER_CALLBACK,"多供应商订单退款回调"),
    SUPP_RETURN_TICKET_CALLBACK(Path.SUPP_RETURN_TICKET_CALLBACK,"多供应商退票"),
    /** 发起供应商订单退款 */
    HANDLE_SUPP_REFUND_OFF_ORDER(Path.HANDLE_SUPP_REFUND_OFF_ORDER,"发起退款处理"),
    /**搜索日志**/
    QUERY_TRAIN_SEARCH_REQUEST_RECORD_LIST(Path.QUERY_TRAIN_SEARCH_REQUEST_RECORD_LIST, "客户搜索请求记录查询"),
    ADD_TRAIN_SEARCH_REQUEST_RECORD(Path.ADD_TRAIN_SEARCH_REQUEST_RECORD, "客人搜索请求记录保存"),

    /** 异常列表 */
    QUERY_TRAIN_EXCEPTION_LIST(Path.QUERY_TRAIN_EXCEPTION_LIST, "异常列表查询"),
    SAVE_TRAIN_EXCEPTION(Path.SAVE_TRAIN_EXCEPTION, "异常列表保存"),
    HANDLE_TRAIN_EXCEPTION_LIST(Path.HANDLE_TRAIN_EXCEPTION_LIST, "查询异常列表"),

    /** 抢票查询 */
    QUERY_TRAIN_ROB_TICKETS_PACKAGE_LIST(Path.QUERY_TRAIN_ROB_TICKETS_PACKAGE_LIST, "查询抢票套餐"),
    QUERY_TRAIN_ROB_TICKETS_SUCCESS_RATE(Path.QUERY_TRAIN_ROB_TICKETS_SUCCESS_RATE, "查询抢票成功率"),

    /** 待处理订单 */
    QUERY_TRAIN_ORDER_PENDING_LIST(Path.QUERY_TRAIN_ORDER_PENDING_LIST, "查询待处理订单列表"),
    SAVE_TRAIN_ORDER_PENDING(Path.SAVE_TRAIN_ORDER_PENDING, "保存待处理订单数据"),
    UPDATE_TRAIN_ORDER_PENDING_BY_ORDER_ID(Path.UPDATE_TRAIN_ORDER_PENDING_BY_ORDER_ID, "根据orderId修改待处理数据"),
    QUERY_TRAIN_ORDER_BY_ORDER_ID(Path.QUERY_TRAIN_ORDER_BY_ORDER_ID, "根据orderId获取订单详情"),
    QUERY_TRAIN_ORDER_PENDING_INFO_LIST(Path.QUERY_TRAIN_ORDER_PENDING_INFO_LIST, "查询待处理订单列表"),
    HANDLE_TRAIN_ORDER_PENDING_LIST(Path.HANDLE_TRAIN_ORDER_PENDING_LIST, "批处理待处理订单"),
    HANDLE_TRAIN_ORDER_PENDING_TO_BOOKING(Path.HANDLE_TRAIN_ORDER_PENDING_TO_BOOKING, "批处理请求占座"),
    BATCH_UPDATE_TRAIN_ORDER_PENDING_HANDLE_STATE(Path.BATCH_UPDATE_TRAIN_ORDER_PENDING_HANDLE_STATE, "批量修改处理状态为处理中"),

    /** 供应商回调处理 */
    QUERY_SUPP_CALLBACK_NOTIFY_LIST(Path.QUERY_SUPP_CALLBACK_NOTIFY_LIST, "查询供应商通知列表。"),
    SAVE_OR_UPDATE_TRAIN_SUPP_CALLBACK_NOTIFY(Path.SAVE_OR_UPDATE_TRAIN_SUPP_CALLBACK_NOTIFY, "保存/修改供应商回调处理列表"),
    HANDLE_SUPP_CALLBACK_NOTIFY_REQUEST(Path.HANDLE_SUPP_CALLBACK_NOTIFY_REQUEST, "供应商回调报文处理"),
    BATCH_UPDATE_CALLBACK_NOTIFY_HANDLE_STATE(Path.BATCH_UPDATE_CALLBACK_NOTIFY_HANDLE_STATE, "批量修改回调通知为处理中状态"),
    REPEAT_HANDLE_FAIL_SUPP_CALLBACK_NOTIFY(Path.REPEAT_HANDLE_FAIL_SUPP_CALLBACK_NOTIFY, "重新人工发起处理失败通知"),
    ROUTE_HANDLE_SUPP_CALLBACK_NOTIFY(Path.ROUTE_HANDLE_SUPP_CALLBACK_NOTIFY, "路由处理供应商通知"),
    QUERY_TRAIN_ORDER_CPS_LIST(Path.QUERY_TRAIN_ORDER_CPS_LIST, "查询cps订单"),
    BATCH_NOTICE_CPS_ORDER(Path.BATCH_NOTICE_CPS_ORDER, "批量推送cps订单"),

    SYNC_STATION_MAIN_DATA(Path.SYNC_STATION_MAIN_DATA, "12306站点数据更新"),
    /** 详情页修改到达时间 */
    UPDATE_ARRIVE_DATE_AND_TO_TIME(Path.UPDATE_ARRIVE_DATE_AND_TO_TIME, "详情页修改到达日期和到达时间"),
    /** 人工同步订单状态到VST */
    MANUAL_ORDER_STATE_TO_VST(Path.MANUAL_ORDER_STATE_TO_VST,"人工同步订单状态到VST"),

    /**分销回调*/
    DIST_SYNC_ORDER_STATUS(Path.DIST_SYNC_ORDER_STATUS,"同步分销火车票订单状态"),
    DIST_GET_TNTID(Path.DIST_GET_TNTID,"获取分销单号"),
    DIST_GET_ORDERNO_BY_REFUNDNO(Path.DIST_GET_ORDERNO_BY_REFUNDNO, "退款单号获取退票单号");

    public String path;
    public String cnName;

    public static class Path {

		public final static String basePath = "business/";
        public final static String mainDataPath = "maindata/";
        public final static String orderPath = "order/";
        public final static String memberPath = "member/";
        public final static String financePath = "finance/";
        public final static String stationPath = "station/";
        public final static String settlementPath = "settlement/";
        public final static String insurancePath = "insurance/";    //保险
        public final static String payPath = "pay/";    //支付
        public final static String refundPath = "refund/";    //退款
        public final static String distributionPath = "distribution/";    //配送规则
        public final static String orderSuppPath = "orderSupp/";
        public final static String operLogPath = "operLog/";
        public final static String passengerPath = "passenger/";
        public final static String orderSuppGroupPath = "orderSuppGroup/";
        public final static String robTicketsPath = "robTickets/"; //抢票


        /** 查询预售天内的节假日 */
        public static final String QUERY_HOLIDAY_LIST = basePath + mainDataPath + "holiday/queryHolidayList";
        /** 获取全部有效城市 */
        public static final String QUERY_ALL_CITY_LIST = basePath + mainDataPath + "city/queryAllCityList";
        /** 查询城市信息 */
        public static final String QUERY_CITY = basePath + mainDataPath + "city/queryCity";
        /** 查询列车站点信息 */
        public static final String QUERY_STATION = basePath + mainDataPath + "city/queryStation";
        /** 查询订单列表 */
        public static final String SELECT_ORDER_LIST = basePath + orderPath + "selectOrderList";
        /** 查询订单前端显示详情 */
        public static final String QUERY_ORDER_DISPLAY_DETAIL = basePath + orderPath + "queryOrderDisplayDetail";
        /** 根据订单Id删除订单 */
        public final static String DELETE_ORDER_BY_ORDER_ID = basePath + orderPath + "deleteOrderById/{orderId}";
        /** 取消订单 */
        public final static String CANCEL_ORDER = basePath + orderPath + "cancelOrder";
        /** 人工回退符合条件的已取消订单 */
        public final static String REPEAT_CANCEL_ORDER_STATE = basePath + orderPath + "repeatCancelOrderState";
        /** 后台查询订单列表 */
        public final static String QUERY_ORDER_OFFLINE = basePath + orderPath + "queryOrderOffline";
        /** 后台查询客票信息列表 */
        public final static String QUERY_ORDER_TICKET_OFFLINE = basePath + orderPath + "queryOrderTicketOffline";
        /** 后台订单详情 */
        public final static String VIEW_ORDER_OFFLINE = basePath + orderPath + "viewOrderOffline";
        /** 后台订单列表导出 */
        public final static String QUERY_ORDER_OFFLINE_OF_EXPORT = basePath + orderPath + "queryOrderListOfExport";
        /** 后台客票信息列表导出 */
        public final static String QUERY_ORDER_TICKET_OFFLINE_OF_EXPORT = basePath + orderPath + "queryTicketDetailListOfExport";
        /** 新增火车Losc信息 */
        public final static String ADD_TRAIN_LOSC = basePath + mainDataPath + "losc/addTrainLosc";
        /** 新增订单备注信息 */
        public final static String ADD_ORDER_REMARK = basePath + orderPath + "addOrderRemark";
        /** 查询订单备注列表**/
        public static final String QUERY_ORDER_REMARK_LIST = basePath + orderPath + "queryOrderRemarkList";
        /** 新增订单备注信息 */
        public final static String ADD_ORDER_LOG = basePath + orderPath + "addOrderLog";
        /** 查询订单日志列表**/
        public static final String QUERY_ORDER_LOG_LIST = basePath + orderPath + "queryOrderLogList";

        /** 火车票订单回调通知处理管理 --start*/
        /**预定回调 */
        public final static String BOOKING_CALLBACK=basePath+orderPath+"bookingCallback";
        /**确认出票回调*/
        public final static String CONFIRM_TICKET_CALLBACK=basePath+orderPath+"confirmTicketCallback";
        /**向供应商确认出票*/
        public final static String CONFIRM_TICKET=basePath+orderPath+"confirmTicket";
        /** 取消订单回调*/
        public final static String CANCEL_ORDER_CALLBACK=basePath+orderPath+"cancelOrderCallback";
        /**退票回调 */
        public final static String RETURN_TICKET_CALLBACK=basePath+orderPath+"returnTicketCallback";
        /** 供应商退票*/
        public final static String RETURN_TICKET=basePath+orderPath+"returnTicket";
        public final static String RETURN_TICKET_WAP=basePath+orderPath+"returnTicketWap";
        /** 火车票订单回调通知处理管理  --start*/

        /** 预定 */
        public final static String BOOKING = basePath + "booking";
         /** 15min未支付订单，短信提示 */
        public final static String SMS_NOT_PAID = basePath + orderPath + "smsNotPaid";
        /** 出票监控查询 */
        public final static String QUERY_TICKET_MONITOR_LIST = basePath + orderPath + "queryTicketMonitorList";
        /** 退票/退款监控查询 */
        public final static String QUERY_TICKET_REFUND_MONITOR_LIST = basePath + orderPath + "queryTicketRefundMonitorList";
        /** 出票监控导出*/
        public final static String TICKET_MONITOR_EXPORT = basePath + orderPath + "exportTicketMonitor";
        /** 退票监控导出*/
        public final static String TICKET_REFUND_MONITOR_EXPORT = basePath + orderPath + "exportTicketRefundMonitor";
        /** 查询订单item信息*/
        public static final String QUERY_ORDER_ITEM = basePath + orderPath + "queryOrderItem";
        /** 查询流量列表 */
        public static final String QUERY_API_FLOW_LIST = basePath + orderPath + "queryApiFlowList";
        /** 查询流量统计 */
        public static final String QUERY_API_FLOW_LIST_COUNT = basePath + orderPath + "queryApiFlowListCount";
        /** 导出流量列表 */
        public static final String QUERY_API_FLOW_LIST_FOR_CSV = basePath + orderPath + "queryApiFlowListForCsv";
        /** 导出流量统计列表 */
        public static final String QUERY_API_FLOW_COUNT_LIST_FOR_CSV = basePath + orderPath + "queryApiFlowCountListForCsv";
        /** 线下退款通知回调 */
        public static final String RETURN_MONEY_OFFLINE_CALLBACK = basePath + orderPath + "returnMoneyOfflineCallback";
        /** 线下退款通知回调 */
        public static final String SAVE_OR_UPDATE_REFUND_MONEY= basePath + orderPath + "saveOrUpdateRefundMoney";
        /** 线下退款列表查询 */
        public static final String QUERY_TRAIN_OFFLINE_REFUND_MONEY_LIST = basePath + orderPath + "queryTrainOfflineRefundMoneyList";
        /** 查账户列表 */
        public static final String QUERY_ACCOUNT_LIST = basePath + financePath + "queryAccountList";
        /** 查交易明细列表 */
        public static final String QUERY_TRANSDETAIL_LIST = basePath + financePath + "queryTransDetailList";
        /** 导出交易明细 */
        public static final String EXPORT_TRANSDETAIL_LIST = basePath + financePath + "exportTransDetailList";
        /** 导出账户 */
        public static final String EXPORT_ACCOUNT_LIST = basePath + financePath + "exportAccountList";
        /** 新增账户 */
        public static final String ADD_ACCOUNT = basePath + financePath + "addAccount";
        /** 新增交易明细 */
        public static final String ADD_TRANSDETAIL = basePath + financePath + "addTransDetail";
        /** 账户设为无效 */
        public static final String DELETE_ACCOUNT_BY_ID = basePath + financePath + "deleteAccountById";
        /** 交易明细设为无效 */
        public static final String DELETE_TRANSDETAIL_BY_ID = basePath + financePath + "deleteTransDetailById";
        /** 账户交易明细立即更新数据 */
        public static final String QUERY_ACCOUNT_AND_TRANSDETAIL = basePath + financePath + "queryAccountAndTransDetail";
        /** 编辑账户 */
        public static final String UPDATE_ACCOUNT = basePath + financePath + "updateAccount";
        /** 编辑交易明细 */
        public static final String UPDATE_TRANSDETAIL = basePath + financePath + "updateTransDetail";
         /** 新增站点 */
        public static final String ADD_STATION = basePath + stationPath + "addStation";
        /** 站点设为无效 */
        public static final String DELETE_STATION_BYID = basePath + stationPath + "deleteStationById";
        /** 编辑站点 */
        public static final String UPDATE_STATION = basePath + stationPath + "updateStation";
        /** 导入Excel */
        public static final String IMPORT_EXCEL = basePath + stationPath + "importExcel";
        /** 站点设为有效 */
        public static final String ACTIVATE_STATION = basePath + stationPath + "activateStation";
         /** 查询站点 */
        public static final String QUERY_TRAIN_STATION_LIST = basePath + stationPath + "queryTrainStationList";
        /** 查询所有列车站点 */
        public static final String QUERY_TRAIN_ALL_STATION_LIST = basePath + stationPath + "queryTrainAllStationList";

        /** 火车票订单结算管理 --start*/
        /** 结算列表查询 */
        public static final String QUERY_TRAIN_SETTLEMENT = basePath + settlementPath + "querySettlementOrderList";
        /** 结算列表导出 */
        public static final String TRAIN_SETTLEMENT_EXPORT = basePath + settlementPath + "trainSettlementExport";
        /** offline后台推送结算 */
        public static final String TRAIN_OFFLINE_TO_VST_SETTLEMENT= basePath + settlementPath + "offlineToVstSettlement";
        /** 推送结算 */
        public static final String TRAIN_SETTLEMENT_TO_VST = basePath + settlementPath + "trainSettlementToVST";
        public static final String QUERY_NO_SETTLEMENT_ITEMS_TO_VST = basePath + settlementPath + "querySettleItemsByOrderId";
        /** 火车票订单结算管理  --start*/

        /** 火车票保险管理 --start*/
        public static final String QUERY_TRAIN_INSURANCE_LIST = basePath + insurancePath + "queryTrainInsuranceList";
        public static final String SAVE_TRAIN_INSURANCE_ORDER = basePath + insurancePath + "saveTrainInsuranceOrder";
        public static final String ARTIFICIAL_TRAIN_INSURANCE = basePath + insurancePath + "artificialTrainInsurance";
        public static final String HESITATE_TRAIN_INSURANCE = basePath + insurancePath + "hesitateTrainInsurance";
        /**根据票号查询乘车人、车次等相关信息*/
        public final static String  QUERY_ORDER_TICKET_INFO = basePath + insurancePath +"queryTrainOrderTicket/{ticketNo}/{orderNo}";
        /**公共保险接口：查询可用保险列表 */
        public static final String COMMON_QUERY_INSURANCE_LIST = basePath + insurancePath + "commonQueryInsurance";
        /**公共保险接口：查询保单详情 */
        public static final String COMMON_QUERY_INSURANCE_ORDER = basePath + insurancePath + "commonQueryInsuranceOrder";
        /** 火车票保险管理 --end*/

        /** 配送规则相关 --start*/
        public static final String SAVE_TRAIN_DISTRIBUTION_RULE = basePath + distributionPath + "saveTrainDistributionRule";
        public static final String QUERY_TRAIN_DISTRIBUTION_RULE_LIST = basePath + distributionPath + "queryTrainDistributionRuleList";
        public static final String UPDATE_TRAIN_DISTRIBUTION_RULE_STATUS = basePath + distributionPath + "updateTrainDistributionRuleStatus";
        public static final String VALID_OFFLINE_DISTRIBUTION_RULE = basePath + distributionPath + "validOfflineDistributionRule";
        /** 配送规则相关 --end*/

        /** 供应商订单（线下订单）--start*/
        public static final String QUERY_TRAIN_ORDER_SUPP_LIST = basePath + orderSuppPath +"queryTrainOrderSupp";
        public static final String QUERY_TRAIN_ORDER_SUPP_DETAIL = basePath + orderSuppPath +"queryTrainOrderSuppDetail";
        public static final String TRAIN_ORDER_SUPP_CONFIRM_TICKET = basePath + orderSuppPath +"trainOrderSuppConfirmTicket";
		public static final String UPDATE_TRAIN_ORDER_SUPP = basePath + orderSuppPath +"updateTrainOrderSupp";
		public static final String ADD_TRAIN_ORDER_SUPP_REMARK = basePath + orderSuppPath +"addTrainOrderSuppRemark";
		public static final String QUERY_TRAIN_ORDER_SUPP_REMARK = basePath + orderSuppPath +"queryTrainOrderSuppRemark";
		/** 供应商订单（线下订单）--end*/

        /** 新系统操作日志 */
		public static final String ADD_TRAIN_OPER_LOG = basePath + operLogPath +"addTrainOperLog";
		public static final String QUERY_TRAIN_OPER_LOG = basePath + operLogPath +"queryTrainOperLog";
		 /** 修改订单出票状态  */
        public final static String UPDATE_ORDER_CONFIRM_TICKET_STATE = basePath + orderPath + "manualUpdateConfirmTicketState";
        /** 修改订单退票状态 */
        public final static String UPDATE_ORDER_REFUND_TICKET_STATE = basePath + orderPath + "manualUpdateRefundTicketState";
        /** 修改订单退款状态 */
        public final static String UPDATE_ORDER_REFUND_AMOUNT_STATE = basePath + orderPath + "manualUpdateRefundAmountState";
        /** 查询待出行订单 */
        public static final String SELECT_TRAIN_ORDER_WAIT_TRAVEL = basePath + orderPath + "selectTrainOrderWaitTravel";
        /** 查询可退票乘客系想你 */
        public static final String QUERY_TRAIN_REFUNDABLE_TICKET_LIST = basePath + orderPath + "queryTrainRefundableTicketList";

        /** 添加常用联系人信息(12306) */
        public static final String PASSENGER_ADD_12306 = basePath + passengerPath + "addPassenger";
        /** 删除常用联系人信息(12306) */
        public static final String PASSENGER_DELETE_12306 = basePath + passengerPath + "deletePassenger";
        /** 修改常用联系人信息(12306) */
        public static final String PASSENGER_EDIT_12306 = basePath + passengerPath + "editPassenger";
        /** 获取常用联系人信息(12306) */
        public static final String PASSENGER_QUERY_12306 = basePath + passengerPath + "queryPassenger";
        /** 校验12306登录信息 */
        public static final String CHECK_LOGIN_INFO_12306 = basePath + passengerPath + "checkLoginInfo12306";
        /** 供应商回调 查询用户12306常用联系人 */
        public static final String HANDLE_QUERY_PASSENGER_CALLBACK = basePath + passengerPath + "handleQueryPassengerCallback";
        /** 供应商回调 处理 添加12306常用联系人 */
        public static final String HANDLE_ADD_PASSENGER_CALLBACK = basePath + passengerPath + "handleAddPassengerCallback";
        /** 供应商回调 处理 修改12306常用联系人 */
        public static final String HANDLE_EDIT_PASSENGER_CALLBACK = basePath + passengerPath + "handleEditPassengerCallback";
        /** 供应商回调 处理 删除12306常用联系人 */
        public static final String HANDLE_DELETE_PASSENGER_CALLBACK = basePath + passengerPath + "handleDeletePassengerCallback";
        /** 查询12306联系人信息 */
        public static final String QUERY_TRAIN_USER_PASSENGER_LIST = basePath + passengerPath + "queryTrainUserPassengerList";
        /** 查询用户是否登录了12306账号 */
        public static final String GET_USER_LOGIN_INFO = basePath + passengerPath + "getUserLoginInfo";
        /** 用户基本信息管理查询*/
        public static final String USER_INFO_QUERY = basePath + passengerPath + "queryUserInfo";
        /** 12306账户核验 */
        public static final String CHECK_ACCOUNT = basePath + passengerPath + "checkAccount";
        /** 保存12306登录信息 */
        public static final String SAVE_TRAIN_USER_INFO = basePath + passengerPath + "saveTrainUserInfo";
        /** 更新驴妈妈账号绑定的火车票账号的信息 */
        public static final String UPDATE_TRAIN_ACCOUNT_12306 = basePath + passengerPath + "updateTrainAccount12306";
        /** 查询用户绑定且未删除的12306账号列表 */
        public static final String GET_TRAIN_ACCOUNTS_12306 = basePath + passengerPath + "getTrainAccounts12306";


        /**下单请求记录相关路径*/
        public static final String QUERY_TRAIN_ORDER_REQ_RECORD_LIST = basePath + orderPath + "queryTrainOrderReqRecordList";
		public static final String QUERY_TRAIN_ORDER_REQ_RECORD_LIST_OF_EXPORT = basePath + orderPath + "queryTrainOrderReqRecordExport";

		/** 订单线下导单处理操作 --start*/
        /** 线下导单（团体票） */
        public static final String TRAIN_IMPORT_GROUP_ORDER = basePath + orderSuppGroupPath + "importGroupOrder";
        /** 线下导单（添加或修改联系人信息） */
        public static final String TRAIN_IMPORT_ADDORUPDATE_ITEM = basePath + orderSuppGroupPath + "addOrUpdateTrainOrderItem";
        /** 线下导单（导单审核出票） */
        public static final String TRAIN_IMPORT_AUDIT_CONFIRMTICKET = basePath + orderSuppGroupPath + "auditConfirmTicket";
        /** 线下导单（删除导单） */
        public static final String TRAIN_IMPORT_DELETE_ORDER = basePath + orderSuppGroupPath + "deleteTrainOrderSuppGroup";
        /** 分页查询订单item信息*/
        public static final String QUERY_ORDER_ITEM_PAGE = basePath + orderPath + "queryOrderItemByPage";
        /** 删除订单item信息*/
        public static final String TRAIN_IMPORT_ORDER_DELETE_ITEM = basePath + orderPath + "deleteOrderItem";
        /** 订单线下导单处理操作 --end*/

        /** 订单支付退款处理操作 --start*/
        public static final String PAY = basePath + payPath + "pay";
        public static final String PAY_CALL_BACK_SIMULATION = basePath + payPath + "payCallBackSimulation";
        /** 支付回调 */
        public final static String PAY_CALLBACK = basePath + payPath + "payCallback";
        /** 退款回调 */
        public final static String REFUND_CALLBACK = basePath + refundPath + "refundCallback";
        /** 退款 */
        public final static String REFUND = basePath + refundPath + "refund";
        /** 线下退款 */
        public final static String REFUND_TRAIN_OFFLINE = basePath + refundPath + "refundTrainOffline";
        /** 查看退款信息 */
        public final static String QUERY_REFUND_LIST = basePath + refundPath + "queryRefundList";
        /** 查询支付信息 */
        public final static String QUERY_PAY_LIST = basePath + payPath + "queryPayList";
        /** 订单支付退款处理操作 --end*/

        /** 发送短信公共接口 */
        public static final String SEND_SMS_INTERFACE = basePath + orderPath + "sendSmsInterface";

        /** 代售点管理相关**/
        public static final String IMPORT_TRAIN_TICKET_AGENT_EXCEL = basePath + mainDataPath + "importTrainTicketAgentExcel";
        public static final String EXPORT_TRAIN_TICKET_AGENT_EXCEL = basePath + mainDataPath + "exportTrainTicketAgentExcel";
        public static final String SAVE_OR_UPDATE_TRAIN_TICKET_AGENT = basePath + mainDataPath + "saveOrUpdateTrainTicketAgent";
        public static final String DELETE_TRAIN_TICKET_AGENT_BY_ID = basePath + mainDataPath + "queryTrainTicketAgentList";
        public static final String QUERY_TRAIN_TICKET_AGENT_LIST = basePath + mainDataPath + "deleteTrainTicketAgentById";
        public static final String QUERY_TRAIN_TICKET_AGENT_AREA_LIST = basePath + mainDataPath + "queryTrainTicketAgentAreaList";

        /** 火车票资讯 */
        public static final String SAVE_TRAIN_NEWS = basePath + mainDataPath + "saveTrainNews";
        public static final String DELETE_TRAIN_NEWS_BY_ID = basePath + mainDataPath + "deleteTrainNewsById";
        public static final String QUERY_TRAIN_NEWS_LIST = basePath + mainDataPath + "queryTrainNewsList";
        public static final String IMPORT_TRAIN_NEWS_EXCEL = basePath + mainDataPath + "importTrainNewsExcel";
        public static final String EXPORT_TRAIN_NEWS_EXCEL = basePath + mainDataPath + "exportTrainNewsExcel";

        /** 多供应商 路由 操作  --start*/
        /** 供应商订单锁定回调**/
        public static final String SUPP_LOCK_ORDER_CALLBACK = basePath+orderSuppPath+"suppLockOrderCallback";
        /** 供应商订单退款回调**/
        public static final String SUPP_REFUND_ORDER_CALLBACK = basePath+orderSuppPath+"suppRefundOrderCallback";
        /** 发起供应商订单退款**/
        public static final String HANDLE_SUPP_REFUND_OFF_ORDER = basePath+orderSuppPath+"suppRefundOrderMoney";
        /**供应商退票回调*/
        public final static String SUPP_RETURN_TICKET_CALLBACK=basePath+orderSuppPath+"suppReturnTicketCallback";
        /** 多供应商 路由 操作  --end*/
        /** 搜索日志 */
        public static final String QUERY_TRAIN_SEARCH_REQUEST_RECORD_LIST = basePath + mainDataPath + "queryTrainSearchRequestRecordList";
        public static final String ADD_TRAIN_SEARCH_REQUEST_RECORD = basePath + mainDataPath + "addTrainSearchRequestRecord";

        /** 异常列表 */
        public static final String QUERY_TRAIN_EXCEPTION_LIST = basePath + orderPath + "queryTrainExceptionList";
        public static final String SAVE_TRAIN_EXCEPTION = basePath + orderPath + "saveTrainException";
        public static final String HANDLE_TRAIN_EXCEPTION_LIST = basePath + orderPath + "handleTrainExceptionList";

        /** 查询抢票套餐列表 */
        public static final String QUERY_TRAIN_ROB_TICKETS_PACKAGE_LIST = basePath + robTicketsPath + "queryTrainRobTicketsPackageList";
        /** 查询抢票成功率套餐 */
        public static final String QUERY_TRAIN_ROB_TICKETS_SUCCESS_RATE = basePath + robTicketsPath + "queryTrainRobTicketsSuccessRate";

        /** 订单待处理列表 */
        public static final String QUERY_TRAIN_ORDER_PENDING_LIST = basePath + orderPath + "queryTrainOrderPendingList";
        public static final String SAVE_TRAIN_ORDER_PENDING = basePath + orderPath + "saveTrainOrderPending";
        public static final String UPDATE_TRAIN_ORDER_PENDING_BY_ORDER_ID = basePath + orderPath + "updateTrainOrderPendingByOrderId";
        public static final String QUERY_TRAIN_ORDER_BY_ORDER_ID = basePath + orderPath + "queryTrainOrderById";
        public static final String QUERY_TRAIN_ORDER_PENDING_INFO_LIST = basePath + orderPath + "queryTrainOrderPendingInfoList";
        public static final String HANDLE_TRAIN_ORDER_PENDING_LIST = basePath + orderPath + "handleTrainOrderPendingList";
        public static final String HANDLE_TRAIN_ORDER_PENDING_TO_BOOKING = basePath + orderPath + "handleTrainOrderPendingToBooking";
        public static final String BATCH_UPDATE_TRAIN_ORDER_PENDING_HANDLE_STATE = basePath + orderPath + "batchUpdateTrainOrderPendingHandleState";

        /** cps订单管理 */
        public static final String QUERY_TRAIN_ORDER_CPS_LIST = basePath + orderPath + "queryTrainOrderCpsList";
        public static final String BATCH_NOTICE_CPS_ORDER = basePath + orderPath + "batchNoticeCpsOrder";

        /** 供应商回调通知 */
        public static final String QUERY_SUPP_CALLBACK_NOTIFY_LIST = basePath + orderPath + "querySuppCallbackNotifyList";
        public static final String SAVE_OR_UPDATE_TRAIN_SUPP_CALLBACK_NOTIFY = basePath + orderPath + "saveOrUpdateSuppCallbackNotify";
        public static final String HANDLE_SUPP_CALLBACK_NOTIFY_REQUEST = basePath + orderPath + "handleSuppCallbackNotifyRequest";
        public static final String BATCH_UPDATE_CALLBACK_NOTIFY_HANDLE_STATE = basePath + orderPath + "batchUpdateCallbackNotifyHandleState";
        public static final String REPEAT_HANDLE_FAIL_SUPP_CALLBACK_NOTIFY = basePath + orderPath + "repeatHandleFailSuppCallbackNotify";
        public static final String ROUTE_HANDLE_SUPP_CALLBACK_NOTIFY = basePath + orderPath + "routeHandleSuppCallbackNotify";

        /** 12306站点数据更新 */
        public static final String SYNC_STATION_MAIN_DATA = basePath + mainDataPath + "syncStationMainData";
        /** 详情页修改到达时间 */
        public static final String UPDATE_ARRIVE_DATE_AND_TO_TIME = basePath + orderPath + "updateArriveDateAndToTime";
        /** 分销回调 */
        public static final String DIST_SYNC_ORDER_STATUS = basePath + "distributor/syncStatus";
        public static final String DIST_GET_TNTID = basePath + "distributor/getTntId";
        public static final String DIST_GET_ORDERNO_BY_REFUNDNO = basePath + "distributor/getFlightOrderNoByRefundNo/{refundNo}/{refundAmount}";

        /** 人工同步订单状态到VST */
        public final static String MANUAL_ORDER_STATE_TO_VST = basePath + memberPath + "manualSyncTrainOrderStatusToVst";
    }

    BusinessClientPath(String path, String cnName) {
        this.path = path;
        this.cnName = cnName;
    }

    public String getPath() {
        return path;
    }

    public String getCnName() {
        return cnName;
    }

    public String url(String baseUrl) {
        if (!baseUrl.contains("http")) {
            baseUrl = "";
        }
        if (baseUrl.endsWith("/")) {
            return baseUrl + this.path;
        }
        return baseUrl + "/" + this.path;
    }

    public String url(String baseUrl, Object... args) {
        String url = url(baseUrl);
        String pat = "\\{\\w*\\}";
        return String.format(url.replaceAll(pat, "%s"), args);
    }
}
