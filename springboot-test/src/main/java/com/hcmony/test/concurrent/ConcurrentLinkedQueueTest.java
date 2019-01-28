package com.hcmony.test.concurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueueTest {
	public static void main(String[] args) {
		ConcurrentLinkedQueue queue = new ConcurrentLinkedQueue();
		List list = new ArrayList();
		for (int i = 0; i <1000 ; i++) {
			queue.add("" + i);
			list.add("" + i);
		}
		for (int i = 0; i < 1000; i++) {
			System.out.println(queue.poll());
		}
		for (Object li:list) {
			System.out.println(li);
		}
	}
}
