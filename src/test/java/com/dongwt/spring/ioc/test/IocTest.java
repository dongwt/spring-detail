package com.dongwt.spring.ioc.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dongwt.spring.ioc.bean.User;
import com.dongwt.spring.ioc.service.UserService;

public class IocTest {
	
	@Test
	public void ioc(){
		ApplicationContext applicationContext =  new ClassPathXmlApplicationContext("spring-ioc.xml");
		UserService userService = (UserService) applicationContext.getBean("userService");
		userService.saveUser(new User("tom","123"));
	}

}
