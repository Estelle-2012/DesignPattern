package com.estelle.pattern.singleton;

public class LazyDoubleCheckSingleton {
    private static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;//静态
    private LazyDoubleCheckSingleton() {
    }
    /**
     * 与懒汉相比锁放在方法体中降低性能开销
     */

    public static LazyDoubleCheckSingleton getInstance() {
        if (lazyDoubleCheckSingleton == null) {
            //不允许2，3重排序
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazyDoubleCheckSingleton == null) {
                    //1、配内存
                    //2、设置lazyDoubleCheckSingleton指向刚分配的地址内存
                    //3、初始化对象
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}
