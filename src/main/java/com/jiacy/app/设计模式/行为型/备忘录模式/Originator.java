package com.jiacy.app.设计模式.行为型.备忘录模式;

/**
 * 备忘发起类
 */
public class Originator {

    private String name;
    private int id;

    public void setMemento(Memento memento) {
        this.name = memento.getName();
        this.id = memento.getId();
    }

    public Memento createMemento() {
        return new Memento(name, id);
    }

    @Override
    public String toString() {
        return "Originator{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
