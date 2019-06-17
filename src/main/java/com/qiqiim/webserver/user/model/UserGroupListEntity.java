package com.qiqiim.webserver.user.model;

import java.io.Serializable;
import java.util.Date;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import com.qiqiim.webserver.base.model.BaseModel;


/**
 * 
 * 
 * @author qiqiim
 * @email 1044053532@qq.com
 * @date 2019-06-17 20:23:44
 */
public class UserGroupListEntity extends BaseModel{
	private static final long serialVersionUID = 1L;
	
	//
	private Long id;
	//
	private Long uid;
	//
	private Long groupId;
	//
	private Date createTime;
	//
	private Date updateTime;
	//
	private String remark;

	/**
	 * 设置：
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public Long getId() {
		return id;
	}
	/**
	 * 设置：
	 */
	public void setUid(Long uid) {
		this.uid = uid;
	}
	/**
	 * 获取：
	 */
	public Long getUid() {
		return uid;
	}
	/**
	 * 设置：
	 */
	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}
	/**
	 * 获取：
	 */
	public Long getGroupId() {
		return groupId;
	}
	/**
	 * 设置：
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * 获取：
	 */
	public Date getUpdateTime() {
		return updateTime;
	}
	/**
	 * 设置：
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/**
	 * 获取：
	 */
	public String getRemark() {
		return remark;
	}

	 
	@Override
	public String toString() {
		return  ReflectionToStringBuilder.toString(this);
	}
}
