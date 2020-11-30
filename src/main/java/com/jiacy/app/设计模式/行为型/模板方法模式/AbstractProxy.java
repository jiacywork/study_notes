package com.jiacy.app.设计模式.行为型.模板方法模式;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class AbstractProxy implements InvocationHandler {

    protected AbstractRoomOwner roomOwner;

    public AbstractProxy(AbstractRoomOwner roomOwner) {
        this.roomOwner = roomOwner;
    }

    public Object getProxyInstace() {
        Class clazz = roomOwner.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }


    protected void before(Room room) {
        System.out.println("默认before实现");
    };

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Room room = (Room) args[0];
        before(room);
        Object object = method.invoke(roomOwner, room);
        after(room);
        return object;
    }

    protected void after(Room room) {
        System.out.println("默认after实现");
    };

}
