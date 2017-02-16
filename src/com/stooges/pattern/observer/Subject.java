package com.stooges.pattern.observer;

/**
 * 主题
 * @author 张超
 * @date 2017/2/16.
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removerObserver(Observer observer);
    // 当主题状态改变时。这个方法会被调用，以通知所有的观察者
    void notifyObservers();
}
