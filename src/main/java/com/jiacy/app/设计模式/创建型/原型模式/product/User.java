package com.jiacy.app.设计模式.创建型.原型模式.product;

public class User implements Cloneable {

    protected Integer sex;
    protected int id;
    protected String name;
    protected Org org;

    public void setOrg(Org org) {
        this.org = org;
    }

    public Org getOrg() {
        return org;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

//    public User clone() {
//        try {
//            return (User) super.clone();
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }

    @Override
    public String toString() {
        return "User{" +
                "sex=" + sex +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", org=" + org.toString() +
                '}';
    }
}
