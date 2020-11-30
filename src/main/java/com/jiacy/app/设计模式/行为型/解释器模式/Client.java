package com.jiacy.app.设计模式.行为型.解释器模式;

public class Client {

    public static void main(String[] args) {
        DefinedExpressionParser expressionParser = new DefinedExpressionParser();
        int result = expressionParser.parse("6 100 11 + *");
        System.out.println("解释器计算结果: "+result);
    }

}
