package com.dongwt.spring.ioc.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dongwt.spring.ioc.bean.User;
import com.dongwt.spring.ioc.service.UserService;
import com.dongwt.spring.ioc.service.XmlService;

public class IocTest {
	
	private ApplicationContext applicationContext;
	
	@Before
	public void before(){
		applicationContext =  new ClassPathXmlApplicationContext("spring-ioc.xml");
	}
	
	@Test
	public void iocAnnotation(){
		UserService userService = (UserService) applicationContext.getBean("userService");
		userService.saveUser(new User("tom","123"));
	}
	
	@Test
	public void iocXml(){
		XmlService xmlService = (XmlService) applicationContext.getBean("xmlService");
		System.out.println(xmlService);
		((ClassPathXmlApplicationContext) applicationContext).close();
	}

}
