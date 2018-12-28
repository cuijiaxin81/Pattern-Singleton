package com.cui.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 注册式单例模式
 * (Spring中的做做法，就是用这种注册式单例)
 */
public class BeanFactory {


    private BeanFactory() {}

    private  static Map<String,Object> ioc = new ConcurrentHashMap<>();

    public static Object getBean(String className) {

        if (!ioc.containsKey(className)) {
            Object obj = null;

            try {
                obj = Class.forName(className).newInstance();
                ioc.put(className,obj);
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            return obj;
        } else {
            return ioc.get(className);
        }

    }
}
