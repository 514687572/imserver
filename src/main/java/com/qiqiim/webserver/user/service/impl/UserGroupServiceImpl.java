package com.qiqiim.webserver.user.service.impl;

import com.qiqiim.webserver.user.dao.UserGroupDao;
import com.qiqiim.webserver.user.example.UserGroupExample;
import com.qiqiim.webserver.user.model.UserGroup;
import com.qiqiim.webserver.user.service.UserGroupService;
import com.stip.mybatis.generator.plugin.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserGroupServiceImpl extends BaseService<UserGroup, UserGroupExample, Long> implements UserGroupService {
    @Autowired
    UserGroupDao userGroupDao;

    public List<UserGroup> getUserGroupList() {
        UserGroupExample example = new UserGroupExample();

        return dao.selectByExample(example);
    }

    @Override
    public List<UserGroup> selectUserGroupByExample(long uid) {
        return userGroupDao.selectUserGroupByExample(uid);
    }
}