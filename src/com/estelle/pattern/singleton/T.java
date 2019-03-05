package com.estelle.pattern.singleton;

//在多线程中创建实例
public class T implements Runnable {
    @Override
    public void run() {
        LazySingleton lazySingleton = LazySingleton.getInstance();
    }
}
