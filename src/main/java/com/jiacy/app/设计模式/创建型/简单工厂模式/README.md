# 定义
将对象创建逻辑封装在工厂内，由工厂决定创建哪个产品对象

# 适用场景
1、工厂类需要创建的对象数量比较少<p>
2、客户端只需传入参数，对于工厂如何创建对象不关心

# 优点：
1、工厂类包含了必要的判断逻辑，客户端根据不同的条件动态的获取实例化对象，不需要知道创建对象的细节;<p>

# 缺点
1、违反了开闭原则，不是GOF23中设计模式之一；对象可在不修改的基础上进行扩展，但是工厂需要增加相应的条件用于获取对象实例，导致工厂类职责过重；<p>