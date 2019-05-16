package com.design.pattern;

class SingletonEager {
    public static SingletonEager instance = new SingletonEager();

    private SingletonEager() {
    }
}

public class SingletonDemo {
    SingletonEager singletonEager = SingletonEager.instance;
}
