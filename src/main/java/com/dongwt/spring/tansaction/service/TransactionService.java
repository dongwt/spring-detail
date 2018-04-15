package com.dongwt.spring.tansaction.service;


import com.dongwt.spring.model.Consumer;
import com.dongwt.spring.tansaction.mapper.ConsumerMapper;
import org.springframework.aop.framework.AopContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by dongwt on 2018/4/13.
 */
@Service
public class TransactionService {

    @Autowired
    private ConsumerMapper consumerMapper;


    @Transactional(propagation = Propagation.REQUIRED)
    public void add(){
        Consumer consumer = new Consumer();
        consumer.setName("tom");
        consumer.setPhone("110");
        consumer.setAge(1);
        consumer.setSex(1);
        consumerMapper.add(consumer);
        ((TransactionService)AopContext.currentProxy()).add1();
    }


    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void add1(){
        Consumer consumer = new Consumer();
        consumer.setName("tom2");
        consumer.setPhone("120");
        consumer.setAge(2);
        consumer.setSex(2);
        consumerMapper.add(consumer);
        int a = 1/0;
    }
}
