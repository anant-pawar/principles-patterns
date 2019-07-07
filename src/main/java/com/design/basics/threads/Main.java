package com.design.basics.threads;

public class Main {
    public static void main(String[] args) {
        System.out.println(ThreadColor.ANSI_RED + "1. Executing in main thread");

        AnotherThread anotherThread = new AnotherThread();
        anotherThread.start();

        new Thread() {
            @Override
            public void run() {
                System.out.println(ThreadColor.ANSI_GREEN + "1. Executing in anonymous class thread");
            }
        }.start();

        Thread runnableThread = new Thread(new RunnableThread());
        runnableThread.start();

        new Thread(new Runnable(){
            @Override
            public void run(){
                System.out.println(ThreadColor.ANSI_BLUE +"1. Executing in anonymous runnable thread");
            }
        }).start();

        System.out.println(ThreadColor.ANSI_RED + "2. Executing in main thread");

    }
}
