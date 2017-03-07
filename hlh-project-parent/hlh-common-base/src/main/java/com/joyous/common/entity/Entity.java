package com.joyous.common.entity;

import org.codehaus.jackson.annotate.JsonIgnore;

import javax.xml.bind.annotation.XmlTransient;
import java.io.Serializable;
import java.util.Date;

public class Entity implements Serializable,Dto{
	
	private static final long serialVersionUID = -6624519953583114792L;
	
	private Integer id;
	private String uuid;
	private Date createTime = new Date();
	private Date updateTime = new Date();


	@JsonIgnore
	public String getSequence(){
		return null;
	};

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	
}
