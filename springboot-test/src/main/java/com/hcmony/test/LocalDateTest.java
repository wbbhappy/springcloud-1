package com.hcmony.test;

import java.util.concurrent.atomic.AtomicLong;

public class LocalDateTest {
	private static AtomicLong atomicLong = new AtomicLong();
	public static void main(String[] args)throws Exception {
		for (int i = 0; i < 100; i++) {
			new Thread(new Runnable() {
				public void run() {
					try {
						long a = System.currentTimeMillis();
						Thread.sleep(100);
						long b = System.currentTimeMillis();
						atomicLong.getAndSet(b-a);
					}catch (Exception e){

					}
				}
			}).start();
		}
		System.out.println(atomicLong.intValue());
	}
}
