package com.estelle.pattern.singleton;

/**
 * 我感觉没怎么懂这一块，要看看多线程的部分(把设计模式这里看完吧)
 *https://blog.csdn.net/yejingtao703/article/details/78806902
 */

public class ThreadLocalInstance {
    private static final ThreadLocal<ThreadLocalInstance> threadLocalInstance = new ThreadLocal<ThreadLocalInstance>() {
        @Override
        protected ThreadLocalInstance initialValue() {
            return new ThreadLocalInstance();
        }
    };

    private ThreadLocalInstance() {

    }

    public static ThreadLocalInstance getInstance() {
        return threadLocalInstance.get();
    }
}
