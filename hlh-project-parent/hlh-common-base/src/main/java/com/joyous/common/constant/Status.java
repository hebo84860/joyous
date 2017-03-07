package com.joyous.common.constant;


import org.apache.commons.lang.StringUtils;

/**
 * 有效状态
 * @author zhangzongshuang
 *
 */
public enum Status {
	NULL("",""),
	VALID("Y","有效"),
	INVALID("N","无效");
	
	private String code;
	private String cnName;

	private Status(String code, String cnName) {
		this.code = code;
		this.cnName = cnName;
		
	}
	
	public String getCnName() {
		return cnName;
	}
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setCnName(String cnName) {
		this.cnName = cnName;
	}
	public static Status getByCode(String code) {
		if(StringUtils.isEmpty(code)) {
			return null;
		}
		for(Status ro : Status.values()) {
			if(ro.getCode().equals(code)) {
				return ro;
			}
		}
		return null;
	}
	
	public static Status getByName(String cnName) {
		if(StringUtils.isEmpty(cnName)) {
			return null;
		}
		for(Status ro : Status.values()) {
			if(ro.getCnName().equals(cnName)) {
				return ro;
			}
		}
		return null;
	}
}
