package com.jiacy.app.设计模式.行为型.备忘录模式;

import java.util.Stack;

/**
 * 修改为使用栈结构保存记录，可多次撤回
 */
public class Caretaker {

    private Stack<Memento> stack = new Stack();

    public Memento getMemento() {
        return stack.pop();
    }

    public void setMemento(Memento memento) {
        stack.push(memento);
    }
}
