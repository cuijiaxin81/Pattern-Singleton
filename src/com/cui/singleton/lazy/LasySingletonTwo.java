package com.cui.singleton.lazy;
/**
 *  ����ģʽ1 
 * @author ASUS
 *
 */
public class LasySingletonTwo {
	
	private LasySingletonTwo() {};
	
	private static LasySingletonTwo lasySingletonTwo = null;
	
	public static synchronized LasySingletonTwo getInstance() {
		if(lasySingletonTwo == null){
			lasySingletonTwo = new LasySingletonTwo();
        }
        return lasySingletonTwo;

	}
}
