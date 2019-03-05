package com.estelle.pattern.singleton;

/**
 * 懒汉式
 * 线程不安全(多线程执行的时候会创建多个实例 解决方案：加锁)
 * 延迟加载（使用时才会创建对象）
 */
public class LazySingleton {
    private static LazySingleton lazySingleton = null;//静态

    private LazySingleton() {
    }

    /**
     * synchronized 加锁是为了解决线程不安全的状态但是会消耗性能
     */

    public static synchronized LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

}
