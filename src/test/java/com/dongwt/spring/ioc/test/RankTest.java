package com.dongwt.spring.ioc.test;

import com.dongwt.spring.ioc.service.banks.InjectionService;
import com.dongwt.spring.ioc.service.banks.ResultsService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dongwt on 2017/9/8.
 */
public class RankTest {

    private ApplicationContext applicationContext;

    @Before
    public void before(){
        applicationContext =  new ClassPathXmlApplicationContext("spring-ioc.xml");
    }

    @Test
    public void testRank(){
        ResultsService resultsService = (ResultsService) applicationContext.getBean("resultsService");
        System.out.println(resultsService);
    }


    @Test
    public void testInjection(){
        InjectionService injectionService = (InjectionService) applicationContext.getBean("injectionService");
        injectionService.injection();
    }
}
