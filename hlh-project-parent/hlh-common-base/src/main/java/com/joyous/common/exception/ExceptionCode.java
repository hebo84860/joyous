package com.joyous.common.exception;

import org.codehaus.jackson.annotate.JsonIgnore;

import java.io.Serializable;


/**
 * 异常编码枚举
 * @author majun
 * @date   2015-1-24
 */
public class ExceptionCode implements Serializable{
    
	private static final long serialVersionUID = 8418873379374631922L;
	
	public final static ExceptionCode UNDEF_ERROR = new ExceptionCode("500","不好意思，系统繁忙，请稍后再试！");
    public final static ExceptionCode REMOTE_INVOKE = new ExceptionCode("0001", "【%s】接口调用异常，接口地址【%s】！");

    public final static ExceptionCode UNDEF_REMOTE_INVOKE= new ExceptionCode("0012", "接口调用异常，接口地址【%s】！%s");

    
    public final static ExceptionCode END_TAG= new ExceptionCode("-1","异常枚举code结束TAG(非正常使用)");

    public ExceptionCode(String code, String messageFmt) {
        this.code = code;
        this.messageFmt = messageFmt;
    }

    public ExceptionCode(String code, String messageFmt, String clientMessageFmt) {
        this.code = code;
        this.messageFmt = messageFmt;
        this.clientMessageFmt = clientMessageFmt;
    }

    /** 编码 */
    private String code;
    
    /** 消息格式字符串 */
    @JsonIgnore
    private String messageFmt;

    /** 客户端消息格式字符串 */
    @JsonIgnore
    private String clientMessageFmt;

    public ExceptionCode() {
		super();
	}

	public String errMessage(Object... vars){
        return String.format(this.messageFmt,vars);
    }

	public String clientErrMessage(Object... vars) {
        return null == this.clientMessageFmt ? null : String.format(this.clientMessageFmt, vars);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessageFmt() {
        return messageFmt;
    }

    public void setMessageFmt(String messageFmt) {
        this.messageFmt = messageFmt;
    }

    public String getClientMessageFmt() {
        return clientMessageFmt;
    }

    public void setClientMessageFmt(String clientMessageFmt) {
        this.clientMessageFmt = clientMessageFmt;
    }
}
