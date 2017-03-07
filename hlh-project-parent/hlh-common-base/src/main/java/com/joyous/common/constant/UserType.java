package com.joyous.common.constant;


import org.apache.commons.lang.StringUtils;

/**
 * 有效状态
 * @author zhangzongshuang
 *
 */
public enum UserType {
	NULL("",""),
	USER_SUPER_ADMIN("1","超级管理员"),
	USER_SALESMAN("2","业务员"),
	USER_FIRST_DISTRIBUTION("3","一级分销商"),
	USER_SECOND_DISTRIBUTION("4","二级分销商");

	private String code;
	private String cnName;

	UserType(String code, String cnName) {
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
	public static UserType getByCode(String code) {
		if(StringUtils.isEmpty(code)) {
			return null;
		}
		for(UserType ro : UserType.values()) {
			if(ro.getCode().equals(code)) {
				return ro;
			}
		}
		return null;
	}
	
	public static UserType getByName(String cnName) {
		if(StringUtils.isEmpty(cnName)) {
			return null;
		}
		for(UserType ro : UserType.values()) {
			if(ro.getCnName().equals(cnName)) {
				return ro;
			}
		}
		return null;
	}
}
