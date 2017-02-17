package com.stooges.pattern.Strategy;

/**
 * 环境角色类
 * @author 张超
 * @date 2017/2/17.
 */
public class Context {
    //持有一个策略对象
    private Strategy strategy;
    public Context(){}

    /**
     * 构造函数传入一个具体的策略对象
     * @param strategy 策略
     */
    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    //
    public void doSomething(){
        strategy.strategyInterface();
    }
}
