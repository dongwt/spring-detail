package com.dongwt.spring.transaction.test;

import com.dongwt.spring.tansaction.service.TransactionService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TransactionTest {

	private ApplicationContext applicationContext;
	
	@Before
	public void before(){
		applicationContext =  new ClassPathXmlApplicationContext("spring-mybatis.xml");
	}

	@Test
	public void add(){
		TransactionService transactionService = (TransactionService) applicationContext.getBean("transactionService");
		transactionService.add();
	}

}
