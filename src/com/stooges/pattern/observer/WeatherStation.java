package com.stooges.pattern.observer;

/**
 * 测试类
 * @author 张超
 * @date 2017/2/17.
 */
public class WeatherStation {
    public static void main(String[] args) {
        //建立wheatherData对象---主题对象
        WheatherData wheatherData = new WheatherData();

        //建立目前状况布告板---观察者订阅者
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(wheatherData);

        // 模拟新的气象测量--主题对象有新变化，观察者会获得相应消息
        wheatherData.setMeasurements(80,75,4f);
        wheatherData.setMeasurements(70,65,4.4f);
    }
}
