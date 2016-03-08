package com.dongwt.spring.ioc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.dongwt.spring.ioc.bean.User;
import com.dongwt.spring.ioc.dao.UserDao;

@Service
public class UserService {

	@Autowired
	private UserDao userdao;

	@Value("#{settings['userName']}")
	private String userName;
	
	@Value("#{settings['dbName']}")
	private String dbName;

	public void saveUser(User user) {
		System.out.println("@Value:userName " + userName );
		System.out.println("@Value:dbName " + dbName );
		userdao.saveUser(user);
	}

}
