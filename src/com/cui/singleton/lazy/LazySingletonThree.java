package com.cui.singleton.lazy;

public class LazySingletonThree {

	private boolean initialized = false;
	
	private LazySingletonThree() {
		synchronized (LazySingletonThree.class) {
			if (initialized == false) {
				initialized = !initialized;
			} else {
				throw new RuntimeException("µ¥ÀýÒÑ±»ÇÖ·¸");
			}
		}
		
	}
	
	private static final LazySingletonThree getInstance() {
		return LazyHolder.LAZY;
	}
	
	private static class LazyHolder {
		private static final LazySingletonThree LAZY = new LazySingletonThree();
	}
	
}
