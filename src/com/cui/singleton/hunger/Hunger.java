package com.cui.singleton.hunger;

/**
 * 饿汉式单例模式
 *    它是在类加载的时候就立即初始化，并且创建单例对象
 *    优点:  1、 没有加任何的锁、执行效率比较高，
 *          2、在用户体验上来说，比懒汉式更好
 *
 *    缺点:  1、类加载的时候就初始化，不管你用还是不用，我都占着空间
 *          2、浪费了内存，有可能占着茅坑不拉屎
 *
 *    绝对线程安全，在线程还没出现以前就是实例化了，不可能存在访问安全问题
 *
 */
public class Hunger {

    private Hunger() {
    }

    private static final Hunger hunger = new Hunger();

    public static Hunger getInstance() {
        return hunger;
    }
}
