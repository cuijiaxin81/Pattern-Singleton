package com.cui.singleton.test;

import com.cui.singleton.lazy.LasySingletonOne;
import com.cui.singleton.lazy.LasySingletonTwo;

public class LazyTest {

	public static void main(String[] args) {
		long start  = System.currentTimeMillis();
		for (int i = 0; i < 2000000000; i++) {
			Object object = LasySingletonTwo.getInstance();
		}
		long end = System.currentTimeMillis();
		System.out.println("×ÜºÄÊ±£º" + (end - start));
	}
	
}
