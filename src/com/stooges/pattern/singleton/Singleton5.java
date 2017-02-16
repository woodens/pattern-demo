package com.stooges.pattern.singleton;

/**
 * 静态内部类实现
 *  内部类是延时加载的，也就是说只会在第一次使用时加载。不使用就不加载，
 * 所以只有
 * 优点：达到lazy loading的效果 即按需创建实例，
 * @author 张超
 * @date 2017/2/16.
 */
public class Singleton5 {
    private Singleton5(){}

    private static class SingletonHolder {
        private final static Singleton5 instance = new Singleton5();
    }

    public static Singleton5 getInstance(){
        return SingletonHolder.instance;
    }
}
