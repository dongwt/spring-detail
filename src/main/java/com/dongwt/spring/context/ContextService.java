package com.dongwt.spring.context;

import com.dongwt.spring.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by dongwt on 2018/5/30.
 */
@Service
public class ContextService {

    @Autowired
    private Person person;


    public void printObject(){
        System.out.println(person.getName());
    }
}
