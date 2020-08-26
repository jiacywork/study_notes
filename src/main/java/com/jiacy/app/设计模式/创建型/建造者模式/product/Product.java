package com.jiacy.app.设计模式.创建型.建造者模式.product;

import java.util.ArrayList;
import java.util.List;

public class Product {

    private List<String> parts = new ArrayList<>();

    public void add(String part) {
        parts.add(part);
    }

    public void show() {
        for (String part : parts) {
            System.out.println("组成部分：" + part);
        }
    }

}
