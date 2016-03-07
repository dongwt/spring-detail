package com.dongwt.spring.ioc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dongwt.spring.ioc.bean.User;
import com.dongwt.spring.ioc.dao.UserDao;

@Service
public class UserService {
	
	@Autowired
	private UserDao userdao;
	
	
	public void saveUser(User user){
		userdao.saveUser(user);
	}

}
