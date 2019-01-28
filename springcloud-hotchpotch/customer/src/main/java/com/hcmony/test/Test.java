package com.hcmony.test;

import java.lang.annotation.Annotation;

public class Test {
	public Test(){

	}

	public static void main(String[] args) {
		Annotation annotation = MyTest1.class.getAnnotation(MyTest1.class);
		System.out.println();
	}
}
