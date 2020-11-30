package com.jiacy.app.设计模式.行为型.策略模式;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class StrategyFactory {

    private static final Map<String, AbstractStrategy> STRATEGY_MAP = new ConcurrentHashMap<>();

    static {
        STRATEGY_MAP.put("1", new ConcreteStrategy1());
        STRATEGY_MAP.put("2", new ConcreteStrategy2());
        STRATEGY_MAP.put("3", new ConcreteStrategy3());
    }

    private static final AbstractStrategy STRATEGY_NON= new ConcreteStrategy4();

    private StrategyFactory() { }

    public static AbstractStrategy getStrategy(String type) {
        AbstractStrategy strategy = STRATEGY_MAP.get(type);
        return strategy == null ? STRATEGY_NON : strategy;
    }

}
