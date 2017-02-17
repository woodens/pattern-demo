package com.stooges.pattern.observer;

/**
 * 观察者接口
 * @author 张超
 * @date 2017/2/16.
 */
public interface Observer {
    // 当气象观测值改变时，主题会把温度、湿度、气压的状态值当作方法的参数，传送给观察者
    public void update(float temp, float humidity, float pressure);
}
