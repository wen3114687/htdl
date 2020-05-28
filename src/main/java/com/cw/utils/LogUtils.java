package com.cw.utils;

import java.util.Arrays;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogUtils {
	
	@Before("execution(* com.cw.controller.RoleController.*(..))")
	public static void logStart(JoinPoint joinPoint) {
		Object [] args=joinPoint.getArgs();
		//方法签名
		Signature signature= joinPoint.getSignature();
		System.out.println("【"+signature.getName()+"】开始执行，参数列表"+Arrays.asList(args));
	}

	@AfterReturning	(value="execution(* com.cw.controller.RoleController.*(..))",returning = "result")
	public static void logReturn(JoinPoint joinPoint,Object result) {
		Signature signature= joinPoint.getSignature();
		//System.out.println("【"+method.getName()+"】返回，结果"+result);
		System.out.println("【"+signature.getName()+"】返回，结果"+result);
	}
	
	@AfterThrowing(value="execution(* com.cw.controller.RoleController.*(..))",throwing ="exception"  )
	public static void logException (JoinPoint joinPoint,Exception exception) {
		Signature signature= joinPoint.getSignature();
		System.out.println("【"+signature.getName()+"】出错，错误为"+exception);
	}
	
	@After("execution(* com.cw.controller.RoleController.*(..))")
	public static void logEnd(JoinPoint joinPoint) {
		Signature signature= joinPoint.getSignature();
		System.out.println("【"+signature.getName()+"】结束，");
	}
}
