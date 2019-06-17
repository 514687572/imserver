package com.qiqiim.webserver.user.dao;


import com.qiqiim.webserver.user.example.UserGroupListExample;
import com.qiqiim.webserver.user.model.UserGroupList;
import com.stip.mybatis.generator.plugin.GenericMapper;

/**
 * 可添加自定义查询语句，方便后续扩展
 **/
public interface UserGroupListDao extends GenericMapper<UserGroupList, UserGroupListExample, Long> {
}