package com.jiacy.app.设计模式.创建型.原型模式.product;

public class ConcreteUser extends User {

    public ConcreteUser(int id, String name) {
        super(id, name);
    }

    // 浅克隆
    public User clone() {
        User user = null;
        try {
            user = (User) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return user;
    }

}
