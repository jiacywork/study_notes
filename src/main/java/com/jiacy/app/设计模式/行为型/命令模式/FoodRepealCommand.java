package com.jiacy.app.设计模式.行为型.命令模式;

public class FoodRepealCommand implements Command {

    private Cooker cooker = new Cooker();
    private Food food;

    public FoodRepealCommand(Food food) {
        this.food = food;
    }

    @Override
    public void execute() {
        cooker.repeal(food);
    }

}
