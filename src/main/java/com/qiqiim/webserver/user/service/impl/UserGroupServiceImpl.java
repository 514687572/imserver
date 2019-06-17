package com.qiqiim.webserver.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.qiqiim.webserver.user.dao.UserGroupDao;
import com.qiqiim.webserver.user.model.UserGroupEntity;
import com.qiqiim.webserver.user.service.UserGroupService;



@Service("userGroupServiceImpl")
public class UserGroupServiceImpl implements UserGroupService {
	@Autowired
	private UserGroupDao userGroupDao;
	
	@Override
	public UserGroupEntity queryObject(Long id){
		return userGroupDao.queryObject(id);
	}
	
	@Override
	public List<UserGroupEntity> queryList(Map<String, Object> map){
		return userGroupDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return userGroupDao.queryTotal(map);
	}
	
	@Override
	public void save(UserGroupEntity userGroup){
		userGroupDao.save(userGroup);
	}
	
	@Override
	public int update(UserGroupEntity userGroup){
		return userGroupDao.update(userGroup);
	}
	
	@Override
	public int delete(Long id){
		return userGroupDao.delete(id);
	}
	
	@Override
	public int deleteBatch(Long[] ids){
		return userGroupDao.deleteBatch(ids);
	}

	@Override
	public List<UserGroupEntity> queryGroupList(Map<String, Object> map) {
		return userGroupDao.queryGroupList(map);
	}
	
}
