package com.jiacy.app.设计模式.行为型.解释器模式;

public class MultiInterpreter implements Interpreter {

    private Interpreter firstExpression,secondExpression;

    public MultiInterpreter(Interpreter firstExpression, Interpreter secondExpression){
        this.firstExpression=firstExpression;
        this.secondExpression=secondExpression;
    }

    @Override
    public int interpret(){
        return this.firstExpression.interpret()*this.secondExpression.interpret();
    }

    @Override
    public String toString(){
        return "*";
    }

}
