package com.hcmony.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest {
	public static void main(String[] args) {
		Map<Integer,String> map = new LinkedHashMap<Integer,String>();
		Map<Integer,String> map1 = new HashMap<Integer,String>();

		long a = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			map.put(i,i+"");
		}
		long b = System.currentTimeMillis();
		System.out.println("LinkedHashMap:" + (b-a));

		System.out.println("--------------------------------------------------------");

		long a1 = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			map1.put(i,i + "");
		}
		long b1 = System.currentTimeMillis();
		System.out.println("HashMap:" + (b1-a1));
	}
}
