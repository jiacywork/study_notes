package com.jiacy.app.设计模式.行为型.命令模式;

public class FoodAddCommand implements Command {

    private Cooker cooker = new Cooker();
    private Food food;

    public FoodAddCommand(Food food) {
        this.food = food;
    }

    @Override
    public void execute() {
        cooker.cooking(food);
    }

}
