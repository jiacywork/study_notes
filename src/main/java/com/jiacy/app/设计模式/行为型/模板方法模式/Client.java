package com.jiacy.app.设计模式.行为型.模板方法模式;

/**
 * 将算法骨架在抽象类内实现，变化的部分在具体子类内进行实现
 *
 * 使得子类在不改变算法结构的前提下，对某些特定的步骤重定义
 */
public class Client {

    public static void main(String[] args) {
        AbstractClass abstractClass = new ImplementClassA();
        abstractClass.method();

        abstractClass = new ImplementClassB();
        abstractClass.method();

        Room room = new Room();
        room.setRoomId(301);
        room.setAddress("上丰路1111号");

//        AbstractProxy proxy = new RoomDynamicProxy2(new RoomOwnerChuzhu());
//        AbstractProxy proxy = new RoomDynamicProxy(new RoomOwnerChuzhu());
//        AbstractProxy proxy = new RoomDynamicProxy2(new RoomOwnerSale());
//        AbstractProxy proxy = new RoomDynamicProxy(new RoomOwnerSale());
//        AbstractProxy proxy = new AbstractProxy(new RoomOwnerChuzhu());
        AbstractProxy proxy = new RoomDynamicProxy3(new RoomOwnerSale());
        AbstractRoomOwner owner = (AbstractRoomOwner) proxy.getProxyInstace();
        owner.operate(room);
    }

}
