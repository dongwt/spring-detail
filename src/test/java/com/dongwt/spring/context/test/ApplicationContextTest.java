package com.dongwt.spring.context.test;

import com.dongwt.spring.model.Person;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextTest {
	
	private ApplicationContext applicationContext;
	
	@Before
	public void before(){
		applicationContext =  new ClassPathXmlApplicationContext("spring-context.xml");
	}

	@Test
	public void getBeanDefinitionNames(){
		String[] names = applicationContext.getBeanDefinitionNames();
		for (String item : names){
			System.out.println(item);
		}
	}
	
	@Test
	public void newBean(){
		Person person = (Person) applicationContext.getBean("person");
		System.out.println(person);
	}
	

}
