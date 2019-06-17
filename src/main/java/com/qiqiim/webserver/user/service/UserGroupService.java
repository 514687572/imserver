package com.qiqiim.webserver.user.service;


import com.qiqiim.webserver.user.example.UserGroupExample;
import com.qiqiim.webserver.user.model.UserGroup;
import com.stip.mybatis.generator.plugin.IService;

import java.util.List;

/**
 * Extensible custom interface
 **/
public interface UserGroupService extends IService<UserGroup, UserGroupExample, Long> {
    List<UserGroup> selectUserGroupByExample(long uid);
}