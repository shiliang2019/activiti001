package com.shil.activiti001.controller;

import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;

import org.activiti.engine.IdentityService;
import org.activiti.engine.impl.persistence.entity.UserEntityImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.shil.activiti001.conf.DataSourceConfig;

@RestController
@RequestMapping
public class TestController {
	
	@Autowired
	private DataSourceConfig dataSourceConfig;

	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private IdentityService identityService;
	
	@RequestMapping(value="/")
	@ResponseBody
	public String test()
	{
		System.out.println(dataSourceConfig);
		System.out.println("-----");
		System.out.println(dataSource);
		return "分享牛";
	}
	
	@RequestMapping(value="/user")
	@ResponseBody
	public UserEntityImpl user(HttpServletRequest request)
	{
		String id = request.getParameter("id");
		UserEntityImpl user = new UserEntityImpl();
		user.setId(id);
		user.setRevision(0);
		identityService.saveUser(user);
		return user;
	}
}
