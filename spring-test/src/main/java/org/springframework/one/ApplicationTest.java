package org.springframework.one;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext
				= new AnnotationConfigApplicationContext(ApplicationConfig.class);
		BeanA beanA = annotationConfigApplicationContext.getBean(BeanA.class);
		System.out.println(beanA);
	}
}
