package com.jiacy.app.设计模式.行为型.备忘录模式;

/**
 * 备忘录
 */
public class Memento {

    private String name;
    private int id;

    public Memento(String state, int id) {
        this.name = state;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
