package com.cui.singleton.lazy;
/**
 *  ÀÁººÄ£Ê½1 
 * @author ASUS
 *
 */
public class LasySingletonOne {
	
	private LasySingletonOne() {};
	
	private static LasySingletonOne lasySingletonTwo = null;
	
	public static LasySingletonOne getInstance() {
		if(lasySingletonTwo == null){
			lasySingletonTwo = new LasySingletonOne();
        }
        return lasySingletonTwo;

	}
}
