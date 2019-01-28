package com.hcmony.test.other;

public class SuperClass {
	public SuperClass(){
		System.out.println("SuperClass");
	}

	static  class Clazz extends SuperClass{
		public Clazz(){
			//super();
			System.out.println("Clazz");
		}
	}

	public static void main(String[] args) {
		Clazz clazz = new Clazz();
		//System.out.println();
	}
}
