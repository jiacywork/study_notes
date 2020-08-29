package com.jiacy.app.设计模式.结构型.门面模式;

public class Gift {

    private String name; // 礼物名称
    private int count; //库存数量

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
