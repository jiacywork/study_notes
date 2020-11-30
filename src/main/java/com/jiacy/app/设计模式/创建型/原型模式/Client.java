package com.jiacy.app.设计模式.创建型.原型模式;

/**
 * 从已有对象再创建另一个可定制的对象
 *
 * 如果初始化信息不发生变化的情况下，使用克隆既可以隐藏创建对象的细节，又可以提升性能
 *
 * 不用重新初始化对象，可以动态的获取对象运行时状态
 *
 * 注意：对象的浅克隆和深克隆
 *
 * clone方法是浅克隆，对象内的引用对象只复制其引用，不复制引用的对象；如果需要实现深克隆，重写clone方法；
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        Org org = new Org(1, "动物合伙公司1");
        User user = new User(1, 1, "兔子", org);
        System.out.println(user.toString());

        User user1 = (User) user.clone();
        user1.setName("松鼠");
        user1.getOrg().setOrgId(2);
        user1.getOrg().setOrgName("动物合伙公司2");
        System.out.println(user1.toString());

        User user2 = (User) user.clone();
        user2.setId(3);
        System.out.println(user2.toString());

        System.out.println("-----------------------传说中的分割线-------------------------");
        System.out.println("最终结果：" + user);
        System.out.println("最终结果：" + user1);
        System.out.println("最终结果：" + user2);
    }

}
