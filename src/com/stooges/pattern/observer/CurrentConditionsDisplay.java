package com.stooges.pattern.observer;

/**
 * 观察者实现类
 * 主题观察者-当主题数据发生改变时，订阅了主题的观察者可以获取相应改变
 * @author 张超
 * @date 2017/2/17.
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(){

    }
    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("current conditions:"+temperature+" F degrees and "+humidity);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
