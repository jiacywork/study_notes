package com.jiacy.app.设计模式.结构型.桥梁模式.abs;

import com.jiacy.app.设计模式.结构型.桥梁模式.implement.ImplementClass;

/**
 * 实现部分
 */
public abstract class AbstractClass {

    protected ImplementClass implementClass;

    public void setImplementClass(ImplementClass implementClass) {
        this.implementClass = implementClass;
    }

    public abstract void operation();
}
