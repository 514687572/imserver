package com.qiqiim.webserver.user.service;

import com.qiqiim.webserver.user.model.UserGroupListEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author qiqiim
 * @email 1044053532@qq.com
 * @date 2019-06-17 20:23:44
 */
public interface UserGroupListService {
	
	UserGroupListEntity queryObject(Long id);
	
	List<UserGroupListEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(UserGroupListEntity userGroupList);
	
	int update(UserGroupListEntity userGroupList);
	
	int delete(Long id);
	
	int deleteBatch(Long[] ids);
}
