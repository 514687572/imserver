<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
  <link rel="stylesheet" href="layui/css/layui.css"> 
  <link rel="stylesheet" href="layui/css/layui.mobile.css">
  <style type="text/css">
  	.index-button{margin-bottom: 30px;}
	.index-button div{margin: 20px 30px 10px;}
	.index-button .layui-btn+.layui-btn{margin-left: 0;}
	.index-button .layui-btn{margin: 0 7px 10px 0; }
  </style>
</head>
<body>
  <div style="margin: 30px;">
	 <fieldset class="layui-elem-field index-button" style="margin-top: 30px;">
	  <legend>聊天</legend>
	  <div>
	    <a class="layui-btn layui-btn-primary"  href="login.jsp" target="_blank"><i class="layui-icon">&#xe613;</i>登录去聊天</a>
	  </div>
	</fieldset>
	
	 <fieldset class="layui-elem-field index-button" style="margin-top: 30px;">
	  <legend>管理</legend>
	  <div>
	    <a class="layui-btn layui-btn-primary"  href="user/imuser/list" target="_blank"><i class="layui-icon">&#xe613;</i>在线用户管理</a>
	    <a class="layui-btn layui-btn-primary" href="usermessage/page" target="_blank"><i class="layui-icon">&#xe63a;</i>消息管理</a>
	    <a class="layui-btn layui-btn-primary" href="usergroup/page" target="_blank"><i class="layui-icon">&#xe63a;</i>群管理</a>
	    <a class="layui-btn layui-btn-primary" href="useraccount/page" target="_blank"><i class="layui-icon">&#xe63a;</i>用户管理</a>
	    <a class="layui-btn layui-btn-primary" href="sysdict/page" target="_blank"><i class="layui-icon">&#xe63a;</i>敏感词管理</a>
	    <a class="layui-btn layui-btn-primary" href="sys/generator/page" target="_blank"><i class="layui-icon">&#xe635;</i>代码生成</a>
	  </div>
	</fieldset>
  </div>
</body>
</html>