package com.dongwt.spring.ioc.dao;

import org.springframework.stereotype.Component;

import com.dongwt.spring.ioc.bean.User;

@Component
public class UserDao {
	
	
	public void saveUser(User user){
		System.out.println("userdao.saveUser:" + user);
	}
	

}
