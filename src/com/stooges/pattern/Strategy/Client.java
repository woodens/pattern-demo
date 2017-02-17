package com.stooges.pattern.Strategy;

/**
 * 客户端验证策略
 * @author 张超
 * @date 2017/2/17.
 */
public class Client {
    public static void main(String[] args) {
        //选择策略
        Strategy strategy = new ConcreteStrategyA();
        //创建环境
        Context context = new Context(strategy);
        //根据策略处理相关事宜
        context.doSomething();

    }
}
