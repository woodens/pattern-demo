package com.stooges.pattern.singleton;

/**
 * 类加载的时候创建一次实例
 *
 * 缺点：不管用不用都会创建一次实例，加载在内存中，从而降低内存利用率
 * @author 张超
 * @date 2017/2/16.
 */
public class Singleton4 {
    private static Singleton4 instance = new Singleton4();
    private Singleton4(){}
    public static Singleton4 getInstance(){
        return instance;
    }
}
