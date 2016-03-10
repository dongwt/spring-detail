package com.dongwt.spring.aop.service;

import org.springframework.stereotype.Service;

@Service
public class AspectService {

	public void doString() {
		System.out.println("doString");
		int result = 1/0;
	}

}
