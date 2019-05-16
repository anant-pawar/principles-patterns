package com.design.pattern;

import java.io.*;

class SuperClass implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class SingletonLazy {
    private static SingletonLazy instance;

    public static SingletonLazy getInstance() {
        if (instance == null)
            synchronized (SingletonLazy.class) {
                if (instance == null)
                    instance = new SingletonLazy();
            }

        return instance;
    }

    private SingletonLazy() {
    }
}

class SingletonEager extends SuperClass implements Serializable {
    public static SingletonEager instance = new SingletonEager();

    protected Object readResolve() {
        return instance;
    }

    @Override
    protected Object clone(){
        return instance;
    }

    private SingletonEager() {
    }
}

class SingletonThreadDemo implements Runnable {
    public void run() {
        SingletonLazy singletonLazy = SingletonLazy.getInstance();

        System.out.println("Thread : " + singletonLazy.hashCode());
    }
}

public class SingletonDemo {
    public static void main(String[] args) {
        try {

            // Eager
            System.out.println("\nEager");

            SingletonEager singletonEager1 = SingletonEager.instance;
            SingletonEager singletonEager2 = SingletonEager.instance;

            System.out.println(singletonEager1.hashCode());
            System.out.println(singletonEager2.hashCode());

            // Serialization Test

            ObjectOutput objectOutput = new ObjectOutputStream(new FileOutputStream("Singleton.txt"));
            objectOutput.writeObject(singletonEager1);
            objectOutput.close();

            ObjectInput objectInput = new ObjectInputStream(new FileInputStream("Singleton.txt"));
            SingletonEager singletonEager3 = (SingletonEager) objectInput.readObject();
            objectInput.close();

            System.out.println("Deserialized : " + singletonEager3.hashCode());

            SingletonEager singletonEager4 = (SingletonEager) singletonEager1.clone();
            System.out.println("Cloned : " + singletonEager4.hashCode());


            // Lazy
            System.out.println("\nLazy");

            Thread thread1 = new Thread(new SingletonThreadDemo());
            thread1.start();

            SingletonLazy singletonLazy1 = SingletonLazy.getInstance();
            SingletonLazy singletonLazy2 = SingletonLazy.getInstance();

            System.out.println(singletonLazy1.hashCode());
            System.out.println(singletonLazy2.hashCode());


        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}