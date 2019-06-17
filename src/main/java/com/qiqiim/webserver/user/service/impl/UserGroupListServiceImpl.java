package com.qiqiim.webserver.user.service.impl;

import com.qiqiim.webserver.user.example.UserGroupListExample;
import com.qiqiim.webserver.user.model.UserGroupList;
import com.qiqiim.webserver.user.service.UserGroupListService;
import com.stip.mybatis.generator.plugin.BaseService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserGroupListServiceImpl extends BaseService<UserGroupList, UserGroupListExample, Long> implements UserGroupListService {
    public List<UserGroupList> getUserGroupList(long uid) {
        UserGroupListExample example = new UserGroupListExample();
        example.createCriteria().andUidEqualTo(uid);

        return dao.selectByExample(example);
    }
}