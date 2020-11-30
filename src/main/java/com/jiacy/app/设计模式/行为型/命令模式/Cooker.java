package com.jiacy.app.设计模式.行为型.命令模式;

public class Cooker {

    public void cooking(Food food) {
        System.out.println("开始烹饪：" + food.getName());
    }

    public void repeal(Food food) {
        System.out.println("取消烹饪：" + food.getName());
    }

}
