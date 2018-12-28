package com.cui.singleton.test;

import java.util.concurrent.CountDownLatch;

import com.cui.singleton.lazy.LasySingletonOne;

public class ThreadSaveTest {

	public static void main(String[] args) {
		int count = 200;
		
		CountDownLatch countDownLatch = new CountDownLatch(count);
		
		long start  = System.currentTimeMillis();
		
		for (int i = 0; i < count; i++) {
			new Thread() {

				@Override
				public void run() {
					try {
						countDownLatch.await();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					Object object = LasySingletonOne.getInstance();
					System.out.println(System.currentTimeMillis() + ":" + object);
				}
				
			}.start();
			countDownLatch.countDown();
		}
		long end = System.currentTimeMillis();
		System.out.println("×ÜºÄÊ±£º" + (end - start));
	}
}
