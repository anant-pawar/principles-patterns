package com.design.basics.threads;

import java.lang.Runnable;

public class RunnableThread implements Runnable {
    @Override
    public void run(){
        System.out.println(ThreadColor.ANSI_BLUE +"1. Executing in runnable thread");
    }
}
