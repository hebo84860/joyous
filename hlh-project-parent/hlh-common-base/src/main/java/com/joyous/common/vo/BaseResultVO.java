package com.joyous.common.vo;

import com.joyous.common.entity.Paging;
import org.codehaus.jackson.annotate.JsonIgnore;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * 结果集泛型对象
 * 
 * @author mashengwen
 * @date 2015-3-13
 */
@XmlRootElement
public class BaseResultVO<T> extends BaseResponseHandle {

	private static final long serialVersionUID = 1911878262015746803L;

	private List<T> results = new ArrayList<T>();

	private Paging paging = new Paging();

	private String queryKey;
	
	/** 返回类型:true 同步 false 异步 */
	private Boolean isSync;

	public BaseResultVO() {
		paging = new Paging();
	}
	
	public BaseResultVO(List<T> results) {
		paging = new Paging();
		this.results = results;
	}

	public BaseResultVO(Paging paging, List<T> results) {
		this.paging = paging;
		this.results = results;

	}
	
	public String getQueryKey() {
		return queryKey;
	}

	public void setQueryKey(String queryKey) {
		this.queryKey = queryKey;
	}

	@XmlElement
	public List<T> getResults() {
		return results;
	}

	public void setResults(List<T> results) {
		this.results = results;
	}

	@XmlElement
	public Paging getPaging() {
		return paging;
	}

	public void setPaging(Paging paging) {
		this.paging = paging;
	}
	@JsonIgnore
	public int getPage() {
		return paging.getPage();
	}
	@JsonIgnore
	public int getRows() {
		return paging.getRows();
	}
	@JsonIgnore
	public int getRecords() {
		return paging.getRecords();
	}
	@JsonIgnore
	public int getTotal() {
		return paging.getTotal();
	}
	@JsonIgnore
	public String getSidx() {
		return paging.getSidx();
	}
	@JsonIgnore
	public String getSord() {
		return paging.getSord();
	}
	@JsonIgnore
	public Boolean isHasResults() {
		return getResults() != null;
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
