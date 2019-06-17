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
public class UserGroupEntity extends BaseModel{
	private static final long serialVersionUID = 1L;
	
	//
	private Long id;
	//
	private String avatar;
	//
	private String groupName;
	//
	private String members;
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
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	/**
	 * 获取：
	 */
	public String getAvatar() {
		return avatar;
	}
	/**
	 * 设置：
	 */
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	/**
	 * 获取：
	 */
	public String getGroupName() {
		return groupName;
	}
	/**
	 * 设置：
	 */
	public void setMembers(String members) {
		this.members = members;
	}
	/**
	 * 获取：
	 */
	public String getMembers() {
		return members;
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
