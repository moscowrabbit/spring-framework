package org.springframework.one.annotation;

import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface BeanAProxy {

	String userName() default "zhangsan";

	String password() default "zhangsan123";
}
