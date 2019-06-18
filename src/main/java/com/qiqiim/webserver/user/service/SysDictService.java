package com.qiqiim.webserver.user.service;

import com.qiqiim.webserver.user.model.SysDictEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author qiqiim
 * @email 1044053532@qq.com
 * @date 2019-06-18 11:22:56
 */
public interface SysDictService {
	
	SysDictEntity queryObject(Long id);
	
	List<SysDictEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(SysDictEntity sysDict);
	
	int update(SysDictEntity sysDict);
	
	int delete(Long id);
	
	int deleteBatch(Long[] ids);
}
