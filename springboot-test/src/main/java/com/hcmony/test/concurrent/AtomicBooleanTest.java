package com.hcmony.test.concurrent;

import java.util.concurrent.atomic.AtomicBoolean;

public class AtomicBooleanTest {
	private  static  AtomicBoolean atomicboolean = new AtomicBoolean(true);
	public static void main(String[] args) {
		System.out.println(atomicboolean.compareAndSet(true,false));
		System.out.println(atomicboolean.get());
		System.out.println(atomicboolean.compareAndSet(true,false));
		System.out.println(atomicboolean.get());
		System.out.println(atomicboolean.compareAndSet(false,true));
		System.out.println(atomicboolean.get());
		System.out.println(atomicboolean.get());
		System.out.println(atomicboolean.get());
	}
}
