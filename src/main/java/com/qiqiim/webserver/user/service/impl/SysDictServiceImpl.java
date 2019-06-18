package com.qiqiim.webserver.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.qiqiim.webserver.user.dao.SysDictDao;
import com.qiqiim.webserver.user.model.SysDictEntity;
import com.qiqiim.webserver.user.service.SysDictService;



@Service("sysDictServiceImpl")
public class SysDictServiceImpl implements SysDictService {
	@Autowired
	private SysDictDao sysDictDao;
	
	@Override
	public SysDictEntity queryObject(Long id){
		return sysDictDao.queryObject(id);
	}
	
	@Override
	public List<SysDictEntity> queryList(Map<String, Object> map){
		return sysDictDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return sysDictDao.queryTotal(map);
	}
	
	@Override
	public void save(SysDictEntity sysDict){
		sysDictDao.save(sysDict);
	}
	
	@Override
	public int update(SysDictEntity sysDict){
		return sysDictDao.update(sysDict);
	}
	
	@Override
	public int delete(Long id){
		return sysDictDao.delete(id);
	}
	
	@Override
	public int deleteBatch(Long[] ids){
		return sysDictDao.deleteBatch(ids);
	}
	
}
