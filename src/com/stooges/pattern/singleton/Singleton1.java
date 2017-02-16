package com.stooges.pattern.singleton;

/**
 * 静态属性
 * 私有构造函数
 * 只有属性为null时才会创建一个实例，确保每次只创建一个，避免重复创建
 *
 * 适用：单线程
 * 缺点：仅限单线程，多线程就会出现问题。当两个线程同时运行到判断instance是否为空的if语句时，并且instance确实没有创建好的时候，
 * 那么两个线程都会创建一个实例
 *
 * @author 张超
 * @date 2017/2/16.
 */
public class Singleton1 {
    private static Singleton1 instance;

    private Singleton1() {

    }

    public static Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }
}
