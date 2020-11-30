package com.jiacy.app.设计模式.行为型.策略模式;

public class StrategyContext {

    private AbstractStrategy strategy;

    public StrategyContext(AbstractStrategy strategy) {
        this.strategy = strategy;
    }

    public void show() {
        strategy.operate();
    }

}
