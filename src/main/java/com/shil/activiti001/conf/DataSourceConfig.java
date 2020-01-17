package com.shil.activiti001.conf;


import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import com.alibaba.druid.pool.DruidDataSource;

@ComponentScan
@Configuration
public class DataSourceConfig {
	
	@Autowired
	private Environment environment;
	
	@Bean
	public DataSource getDataSource()
	{
		DruidDataSource dataSource = new DruidDataSource();
		dataSource.setUrl(environment.getProperty("spring.datasource.url"));
		dataSource.setUsername(environment.getProperty("spring.datasource.username"));
		dataSource.setPassword(environment.getProperty("spring.datasource.password"));
		dataSource.setDriverClassName(environment.getProperty("spring.datasource.driver-class-name"));
		
		return dataSource;
	}

}
