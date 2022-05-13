package org.springframework.one;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationTest {

	public static void main(String[] args) throws Exception {
		AnnotationConfigApplicationContext annotationConfigApplicationContext
				= new AnnotationConfigApplicationContext("org.springframework.one");
		BeanA beanA = annotationConfigApplicationContext.getBean(BeanA.class);
		beanA.invoke("lisi","lisi123");
		System.out.println(beanA);
		System.out.println(beanA.getEnvironmentAware());
	}
}
