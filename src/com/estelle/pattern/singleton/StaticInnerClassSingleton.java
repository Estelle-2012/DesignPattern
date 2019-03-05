package com.estelle.pattern.singleton;

/**
 * 静态内部类
 */
public class StaticInnerClassSingleton {
    private static class InnerClass {
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance() {
      return InnerClass.staticInnerClassSingleton;
    }

}
