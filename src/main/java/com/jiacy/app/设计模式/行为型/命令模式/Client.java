package com.jiacy.app.设计模式.行为型.命令模式;

public class Client {

    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        waiter.addCommand(new FoodAddCommand(new Food("鱼香肉丝")));
        waiter.addCommand(new FoodAddCommand(new Food("土豆肉丝")));
        waiter.addCommand(new FoodAddCommand(new Food("红烧排骨")));
        waiter.addCommand(new FoodRepealCommand(new Food("红烧排骨")));
        waiter.executeCommands();
    }

}
