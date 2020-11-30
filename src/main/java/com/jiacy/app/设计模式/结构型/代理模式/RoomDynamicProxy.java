package com.jiacy.app.设计模式.结构型.代理模式;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class RoomDynamicProxy implements InvocationHandler {

    private AbstractRoomOwner roomOwner;

    public RoomDynamicProxy(AbstractRoomOwner roomOwner) {
        this.roomOwner = roomOwner;
    }

    public Object getProxyInstace() {
        Class clazz = roomOwner.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    private void before(Room room) {
        System.out.println("动态-草拟合同：" + room.getRoomId());
    }

    private void after(Room room) {
        System.out.println("动态-缴费："+ room.getRoomId());
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Room room = (Room) args[0];
        before(room);
        Object object = method.invoke(roomOwner, room);
        after(room);
        return object;
    }
}
