package com.telusko.currConverter.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class currConverterAspect {

	@Before(value="execution(* com.telusko.currConverter.rest.*.*(..))")
	public void beforeMethodExec(JoinPoint jp) {
		System.out.println("Before Signature = "+jp.getSignature());
	}
	
	@After(value="execution(* com.telusko.currConverter.rest.*.*(..))")
	public void afterMethodExec(JoinPoint jp) {
		System.out.println("After Signature = "+jp.getSignature());
	}
	
//	@Around(value="execution(* com.telusko.currConverter.rest.*.*(..))")
//	public void aroundMethodExec(JoinPoint jp) {
//		System.out.println("Around Signature = "+jp.getSignature());
//	}
	
}
