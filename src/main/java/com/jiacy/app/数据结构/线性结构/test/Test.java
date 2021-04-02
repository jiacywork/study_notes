package com.jiacy.app.数据结构.线性结构.test;

import com.jiacy.app.设计模式.创建型.原型模式.Org;
import com.jiacy.app.设计模式.创建型.原型模式.User;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        User user = new User(1, 1, "aa", new Org(2, "bb"));

        User[] users = {user};
        System.out.println(users[0].hashCode());

        users = Arrays.copyOf(users, 2);
        System.out.println(users[0].hashCode());
    }
}
