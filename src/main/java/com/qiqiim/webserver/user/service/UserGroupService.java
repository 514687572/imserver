package com.qiqiim.webserver.user.service;

import com.qiqiim.webserver.user.model.UserGroupEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author qiqiim
 * @email 1044053532@qq.com
 * @date 2019-06-17 20:23:44
 */
public interface UserGroupService {
	
	UserGroupEntity queryObject(Long id);
	
	List<UserGroupEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(UserGroupEntity userGroup);
	
	int update(UserGroupEntity userGroup);
	
	int delete(Long id);
	
	int deleteBatch(Long[] ids);

	List<UserGroupEntity> queryGroupList(Map<String, Object> map);
}
