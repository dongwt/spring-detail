package com.dongwt.spring.aop.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectAdvice {
	
	@Pointcut("execution(* com.dongwt.spring.aop.service.AspectService.*(..))")
	public void AspectAdvice(){}

	@Before("AspectAdvice()")
	public void before() {
		System.out.println("before");
	}

	@After("AspectAdvice()")
	public void after() {
		System.out.println("after");
	}

	@AfterReturning("AspectAdvice()")
	public void afterReturning() {
		System.out.println("afterReturning");
	}

	@AfterThrowing("AspectAdvice()")
	public void afterThrowing() {
		System.out.println("afterThrowing");
	}

//	@Around("AspectAdvice()")
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
