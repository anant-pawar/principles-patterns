package com.design.basics.threads;

public class AnotherThread extends Thread {

    @Override
    public void run() {
        System.out.println(ThreadColor.ANSI_BLUE + "1. Executing in another thread");
    }

}
