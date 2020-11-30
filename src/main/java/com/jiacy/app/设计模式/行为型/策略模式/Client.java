package com.jiacy.app.设计模式.行为型.策略模式;

public class Client {

    public static void main(String[] args) {
//        StrategyContext context = new StrategyContext(new ConcreteStrategy1());
//        context.show();
//        context = new StrategyContext(new ConcreteStrategy2());
//        context.show();
//        context = new StrategyContext(new ConcreteStrategy3());
//        context.show();

//        String type = "1";
//        StrategyContext context = null;
//        if("1".equals(type)) {
//            context = new StrategyContext(new ConcreteStrategy1());
//        } else if("2".equals(type)) {
//            context = new StrategyContext(new ConcreteStrategy2());
//        } else {
//            //...
//        }
        AbstractStrategy context = StrategyFactory.getStrategy("1");
        context.operate();
    }
}
