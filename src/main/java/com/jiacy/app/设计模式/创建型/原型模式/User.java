package com.jiacy.app.设计模式.创建型.原型模式;

public class User implements Cloneable {

    private Integer sex;
    private int id;
    private String name;
    private Org org;

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
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

    public Org getOrg() {
        return org;
    }

    public void setOrg(Org org) {
        this.org = org;
    }

    public User(Integer sex, int id, String name, Org org) {
        System.out.println("初始化原型对象");
        this.sex = sex;
        this.id = id;
        this.name = name;
        this.org = org;
    }

    @Override
    public String toString() {
        return "User{" +
                "sex=" + sex +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", org=" + org +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println("克隆对象");

        // 浅克隆，克隆简单数据类型
        return super.clone();
//
//        // 深克隆
//        User user = (User) super.clone();
//            // 对引用对象进行单独克隆
//        user.org = (Org) user.org.clone();
//        return user;
    }
}
