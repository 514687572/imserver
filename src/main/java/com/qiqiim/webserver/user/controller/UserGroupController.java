package com.qiqiim.webserver.user.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Controller;
import com.qiqiim.constant.Constants;
import com.qiqiim.webserver.util.Query;
import com.qiqiim.webserver.base.controller.BaseController;
import com.qiqiim.webserver.user.model.UserGroupEntity;
import com.qiqiim.webserver.user.service.UserGroupService;
 
/**
 * 
 * 
 * @author qiqiim
 * @email 1044053532@qq.com
 * @date 2019-06-17 20:23:44
 */
@Controller
@RequestMapping("usergroup")
public class UserGroupController extends BaseController{
	@Autowired
	private UserGroupService userGroupServiceImpl;
	
	/**
	 * 页面
	 */
	@RequestMapping("/page")
	public String page(@RequestParam Map<String, Object> params){
		return "group/usergroup";
	}
	/**
	 * 列表
	 */
	@RequestMapping(value="/list", produces="text/html;charset=UTF-8", method = RequestMethod.POST)
	@ResponseBody
	public Object list(@RequestParam Map<String, Object> params){
	    Query query = new Query(params);
		List<UserGroupEntity> userGroupList = userGroupServiceImpl.queryList(query);
		int total = userGroupServiceImpl.queryTotal(query);
		return putMsgToJsonString(Constants.WebSite.SUCCESS,"",total,userGroupList);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping(value="/info/{id}", produces="text/html;charset=UTF-8", method = RequestMethod.POST)
	@ResponseBody
	public Object info(@PathVariable("id") Long id){
		UserGroupEntity userGroup = userGroupServiceImpl.queryObject(id);
		return putMsgToJsonString(Constants.WebSite.SUCCESS,"",0,userGroup);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping(value="/save", produces="text/html;charset=UTF-8", method = RequestMethod.POST)
	@ResponseBody
	public Object save(@ModelAttribute UserGroupEntity userGroup){
		userGroupServiceImpl.save(userGroup);
		return putMsgToJsonString(Constants.WebSite.SUCCESS,"",0,userGroup);
	}
	
	/**
	 * 修改
	 */
	@RequestMapping(value="/update", produces="text/html;charset=UTF-8", method = RequestMethod.POST)
	@ResponseBody
	public Object update(@ModelAttribute UserGroupEntity userGroup){
		int result = userGroupServiceImpl.update(userGroup);
		return putMsgToJsonString(result,"",0,"");
	}
	
	/**
	 * 删除
	 */
	@RequestMapping(value="/delete", produces="text/html;charset=UTF-8", method = RequestMethod.POST)
	@ResponseBody
	public Object delete(@RequestParam Long[] ids){
		int result = userGroupServiceImpl.deleteBatch(ids);
		return putMsgToJsonString(result,"",0,"");
	}
	
}
