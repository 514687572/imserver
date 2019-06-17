package com.qiqiim.webserver.user.service;


import com.qiqiim.webserver.user.example.UserGroupListExample;
import com.qiqiim.webserver.user.model.UserGroupList;
import com.stip.mybatis.generator.plugin.IService;

import java.util.List;

/**
 * Extensible custom interface
 **/
public interface UserGroupListService extends IService<UserGroupList, UserGroupListExample, Long> {
    List<UserGroupList> getUserGroupList(long uid);
}