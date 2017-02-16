package com.stooges.pattern.singleton;

/**
 * 在第二种基础上，将同步锁加在方法体内，然后判断instance实例是否为空
 * 只有当instance为空时才需要同步锁，创建一次实例，当实例创建后则无需加锁
 *
 * 缺点：用双重if判断有点复杂，易出错
 * @author 张超
 * @date 2017/2/16.
 */
public class Singleton3 {
    private static Singleton3 instance;
    private Singleton3(){}

    public static Singleton3 getInstance(){
        if(instance==null){
            synchronized (Singleton3.class){
                if(instance==null){
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }
}
