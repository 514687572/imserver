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
 * @date 2019-06-18 11:22:56
 */
public class SysDictEntity extends BaseModel{
	private static final long serialVersionUID = 1L;
	
	//
	private Long id;
	//
	private String dicType;
	//
	private String dicValue;
	//
	private Integer dicIndex;
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
	public void setDicType(String dicType) {
		this.dicType = dicType;
	}
	/**
	 * 获取：
	 */
	public String getDicType() {
		return dicType;
	}
	/**
	 * 设置：
	 */
	public void setDicValue(String dicValue) {
		this.dicValue = dicValue;
	}
	/**
	 * 获取：
	 */
	public String getDicValue() {
		return dicValue;
	}
	/**
	 * 设置：
	 */
	public void setDicIndex(Integer dicIndex) {
		this.dicIndex = dicIndex;
	}
	/**
	 * 获取：
	 */
	public Integer getDicIndex() {
		return dicIndex;
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
