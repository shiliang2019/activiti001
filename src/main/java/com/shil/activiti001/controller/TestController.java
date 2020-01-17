package com.shil.activiti001.controller;

import javax.sql.DataSource;

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
	
	@RequestMapping(value="/")
	@ResponseBody
	public String test()
	{
		System.out.println(dataSourceConfig);
		System.out.println("-----");
		System.out.println(dataSource);
		return "分享牛";
	}
}
