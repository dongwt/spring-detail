package com.dongwt.spring.tansaction.mapper;


import com.dongwt.spring.model.Consumer;

/**
 * Created by dongwt on 2018/1/29.
 */
public interface ConsumerMapper {

    int add(Consumer consumer);

    int delete(Consumer consumer);

    int update(Consumer consumer);

}
