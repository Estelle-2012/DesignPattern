package com.estelle.pattern.singleton;

import java.io.*;

public class Test {
    static final String FILENAME = "hungrySingleton_file";

    public static void main(String[] args) throws Exception {


        //LazySingleton lazySingleton = LazySingleton.getInstance();

        /**
         * 测试线程安全
         */
//        Thread t1 = new Thread(new T());
//        Thread t2 = new Thread(new T());
//        t1.start();
//        t2.start();


        //序列化与反序列化的影响
        HungrySingleton instance = HungrySingleton.getInstance();
        File file = new File(FILENAME);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        oos.writeObject(instance);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        HungrySingleton newInstance = (HungrySingleton) ois.readObject();

        System.out.println(instance);
        System.out.println(newInstance);
    }


}
