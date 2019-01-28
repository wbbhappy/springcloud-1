package com.hcmony.test;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.TYPE,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(Test.class)
public @interface MyTest1 {
	String name() default "";
}
