package com.estelle.pattern.prototype.clone;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

/**
 * 测试深克隆/浅克隆写法
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        Date birthday = new Date(0L);
        Pig pig1 = new Pig("佩琦", birthday);

        Pig pig2 = (Pig) pig1.clone();
        System.out.println(pig1);
        System.out.println(pig2);

        pig1.getBirthday().setTime(6666666666L);

        System.out.println(pig1);
        System.out.println(pig2);


        /**
         * 为了防止clone破话单例,在单例clone方法中调用getInstance();
         */

//        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
//        Method method = hungrySingleton.getClass().getDeclaredMethod("clone");
//        method.setAccessible(true);
//        HungrySingleton clonehungrySingleton = (HungrySingleton) method.invoke(hungrySingleton);
//        System.out.println(hungrySingleton);
//        System.out.println(clonehungrySingleton);


    }
}
