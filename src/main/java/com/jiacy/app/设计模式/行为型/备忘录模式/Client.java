package com.jiacy.app.设计模式.行为型.备忘录模式;

/**
 * 在不破坏封装的前提下，捕获对象的内部状态，并在该对象之外保存这个状态
 *
 * 后续可将该对象恢复到原先保存的状态
 */
public class Client {

    public static void main(String[] args) {
        Originator originator = new Originator();

        // 初始状态
        originator.setId(1);
        originator.setName("兔子");
        System.out.println(originator.toString());

        // 备份
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());

        // 修改状态
        originator.setId(2);
        originator.setName("松鼠");
        System.out.println(originator.toString());

        // 再次备份
        caretaker.setMemento(originator.createMemento());

        // 再次修改状态
        originator.setId(3);
        originator.setName("小鸟");
        System.out.println(originator.toString());

        // 还原状态
        originator.setMemento(caretaker.getMemento());
        System.out.println(originator.toString());

        // 再次还原
        originator.setMemento(caretaker.getMemento());
        System.out.println(originator.toString());
    }

}
