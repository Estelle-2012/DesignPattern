package com.estelle.pattern.singleton;

/**
 * 枚举单例
 * 1、可以预防序列化与反序列化破坏
 * 2、预防反射攻击（枚举对象不能被反射创建）
 * 3、线程安全
 */
public enum EnumInstance {
    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumInstance getInstance() {
        return INSTANCE;
    }
}
