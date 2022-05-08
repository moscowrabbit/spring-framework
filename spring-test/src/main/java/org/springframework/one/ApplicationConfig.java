package org.springframework.one;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

	@Bean
	public BeanA beanA(){
		BeanA beanA = new BeanA();
		beanA.setUserName("zhangsan");
		beanA.setPassword("zhangsan123");
		return beanA;
	}
}
