package org.springframework.one;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {

	/**
	 * 根据注解的方式切入
	 */
	@Pointcut("@annotation(org.springframework.one.annotation.BeanAProxy)") // the pointcut expression
	private void anyOldTransfer() {}

	/**
	 * 前置通知
	 * @param joinPoint
	 */
	@Before("anyOldTransfer()")
	public void beanABefore(JoinPoint joinPoint){
		System.out.println("BeanA invoke before.....");
		//System.out.println(joinPoint);
	}

	/**
	 * 后置增强
	 * @param joinPoint
	 */
	@After("anyOldTransfer()")
	public void beanAfter(JoinPoint joinPoint){
		System.out.println("BeanA imvoke after......");
		//System.out.println(joinPoint);
	}

	/**
	 * 异常增强
	 * @param ex
	 */
	@AfterThrowing(throwing = "ex",pointcut = "anyOldTransfer()")
	public void beanAfterThrows(Exception ex){
		System.out.println("BeanA invoke is error!");
		System.out.println(ex);
	}

	/**
	 * 返回增强
	 */
	@AfterReturning(pointcut = "anyOldTransfer()", returning = "result")
	public void beanAfterReturn(Object result){
		System.out.println("BeanA invoke is after return!");
		System.out.println(result);
	}

	/**
	 * 环绕增强
	 * @param proceedingJoinPoint
	 * @return
	 */
	@Around("anyOldTransfer()")
	public Object beanARound(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		System.out.println("执行开始前....");
        Object obj = proceedingJoinPoint.proceed(new Object[]{"zhangsan","lisi"});
		System.out.println("执行后.......");
		return obj;
	}

}
