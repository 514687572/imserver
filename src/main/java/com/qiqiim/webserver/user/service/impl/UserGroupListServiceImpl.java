package com.qiqiim.webserver.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.qiqiim.webserver.user.dao.UserGroupListDao;
import com.qiqiim.webserver.user.model.UserGroupListEntity;
import com.qiqiim.webserver.user.service.UserGroupListService;



@Service("userGroupListServiceImpl")
public class UserGroupListServiceImpl implements UserGroupListService {
	@Autowired
	private UserGroupListDao userGroupListDao;
	
	@Override
	public UserGroupListEntity queryObject(Long id){
		return userGroupListDao.queryObject(id);
	}
	
	@Override
	public List<UserGroupListEntity> queryList(Map<String, Object> map){
		return userGroupListDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return userGroupListDao.queryTotal(map);
	}
	
	@Override
	public void save(UserGroupListEntity userGroupList){
		userGroupListDao.save(userGroupList);
	}
	
	@Override
	public int update(UserGroupListEntity userGroupList){
		return userGroupListDao.update(userGroupList);
	}
	
	@Override
	public int delete(Long id){
		return userGroupListDao.delete(id);
	}
	
	@Override
	public int deleteBatch(Long[] ids){
		return userGroupListDao.deleteBatch(ids);
	}
	
}
