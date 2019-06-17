package com.qiqiim.webserver.user.dao;


import com.qiqiim.webserver.user.example.UserGroupExample;
import com.qiqiim.webserver.user.model.UserGroup;
import com.stip.mybatis.generator.plugin.GenericMapper;

import java.util.List;

/**
 * 可添加自定义查询语句，方便后续扩展
 **/
public interface UserGroupDao extends GenericMapper<UserGroup, UserGroupExample, Long> {
    List<UserGroup> selectUserGroupByExample(long uid);
}