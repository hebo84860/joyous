package com.joyous.common.vo;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonIgnore;



/**
 * 结果集泛型对象
 * @author leizhengwei
 * 2015年8月11日
 * @param <T>
 */
@XmlRootElement
public class BaseSingleResultVO<T> extends BaseResponseHandle {

	private static final long serialVersionUID = 1911878262015746803L;

	private T result;

	private String queryKey;
	
	/** 返回类型:true 同步 false 异步 */
	private Boolean isSync;

	public BaseSingleResultVO() {
		
	}
	
	public BaseSingleResultVO(T result) {
		this.result = result;
	}

	
	public String getQueryKey() {
		return queryKey;
	}

	public void setQueryKey(String queryKey) {
		this.queryKey = queryKey;
	}

	public T getResult() {
		return result;
	}

	public void setResult(T result) {
		this.result = result;
	}

	@JsonIgnore
	@Override
	public Integer getId() {
		return null;
	}

	public Boolean getIsSync() {
		return isSync;
	}

	public void setIsSync(Boolean isSync) {
		this.isSync = isSync;
	}
	
	
}
