package com.jiacy.app.设计模式.结构型.享元模式;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FlyweightFactory {

    private static final Map<String, AbstractObject> FLY_WEIGHT_MAP = new ConcurrentHashMap<>();

    public static AbstractObject getObject(String type) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        if(!FLY_WEIGHT_MAP.containsKey(type)) {
            synchronized (FLY_WEIGHT_MAP) {
                if(!FLY_WEIGHT_MAP.containsKey(type)) {
                    Class clazz = Class.forName(type);
                    FLY_WEIGHT_MAP.put(type, (AbstractObject) clazz.newInstance());
                }
            }
        }
        return FLY_WEIGHT_MAP.get(type);
    }

}
