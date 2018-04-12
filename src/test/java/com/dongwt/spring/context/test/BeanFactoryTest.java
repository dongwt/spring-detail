package com.dongwt.spring.context.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by dongwt on 2018/4/4.
 */
public class BeanFactoryTest {

    private ConfigurableBeanFactory beanFactory;

    @Before
    public void before(){
        beanFactory =  new XmlBeanFactory(new ClassPathResource("spring-context.xml"));
    }

    @Test
    public void getBeanDefinitionNames(){
        BeanDefinition beanDefinition = beanFactory.getMergedBeanDefinition("person");
        System.out.println(beanDefinition);
    }
}
