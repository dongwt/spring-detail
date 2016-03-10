package com.dongwt.spring.aop.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dongwt.spring.aop.service.AspectService;
import com.dongwt.spring.aop.service.XmlService;

public class AopTest {

	private ApplicationContext applicationContext;

	@Before
	public void before() {
		applicationContext = new ClassPathXmlApplicationContext("spring-aop.xml");
	}

	@Test
	public void aopXml() {
		XmlService xmlService = (XmlService) applicationContext.getBean("xmlService");
		xmlService.doString();
	}
	
	@Test
	public void aopAspect() {
		AspectService aspectService = (AspectService) applicationContext.getBean("aspectService");
		aspectService.doString();
	}

}
