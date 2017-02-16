package com.stooges.pattern.singleton;

/**
 * 在第一种基础上加上同步锁，使得多线程情况下可以使用
 *
 * 缺点：每次getInstance方法获取singleton实例的时候都有一个试图去获取同步锁的过程，比较耗时
 * @author 张超
 * @date 2017/2/16.
 */
public class Singleton2 {
    private static Singleton2 instance;
    private Singleton2(){

    }

    public static synchronized Singleton2 getInstance(){
        if(instance!=null){
            instance = new Singleton2();
        }
        return instance;
    }
}
