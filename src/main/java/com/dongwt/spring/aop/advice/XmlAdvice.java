package com.dongwt.spring.aop.advice;

import org.aspectj.lang.ProceedingJoinPoint;

public class XmlAdvice {

	public void before() {
		System.out.println("before");
	}

	public void after() {
		System.out.println("after");
	}

	public void afterReturning() {
		System.out.println("afterReturning");
	}

	public void afterThrowing() {
		System.out.println("afterThrowing");
	}

	public Object around(ProceedingJoinPoint pjp) {
		System.out.println("before");
		Object  obj = null;
		try {
			obj = pjp.proceed();
		} catch (Throwable throwable) {
			System.out.println("afterThrowing");
		} finally {
			System.out.println("after");
		}
		System.out.println("afterReturning");
		return obj;
	}

}
