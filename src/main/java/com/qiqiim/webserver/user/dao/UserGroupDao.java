package com.qiqiim.webserver.user.dao;

import com.qiqiim.webserver.base.dao.BaseDao;
import com.qiqiim.webserver.user.model.UserGroupEntity;

import java.util.List;
import java.util.Map;


public interface UserGroupDao extends BaseDao<UserGroupEntity> {
    List<UserGroupEntity> queryGroupList(Map<String, Object> map);
}
