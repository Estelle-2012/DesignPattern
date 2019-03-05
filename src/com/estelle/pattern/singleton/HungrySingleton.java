package com.estelle.pattern.singleton;

import java.io.Serializable;

/**
 * 饿汉式单例
 * 类加载时就完成初始化
 */
public class HungrySingleton implements Serializable {
    private final static HungrySingleton hungrySingleton;

    static {
        hungrySingleton = new HungrySingleton();
    }

    private HungrySingleton() {


    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

    /**
     * 防止序列化破坏(通过反射)（这里是个重点）
     */

    private Object readResolve() {
        return hungrySingleton;
    }
}
