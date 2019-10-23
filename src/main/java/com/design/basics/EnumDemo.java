package com.design.basics;

//Supported colors,will add orange and yello later.
enum Color{
    RED, GREEN;

    public void message() {
        System.out.println("Color Enum");
    }
}

//Traffic signal 
enum TrafficSignal{
    RED("Red Sinal"),
    YELLOW("Yellow Sinal");

    private String signal;

    public String getSignal() {
        return signal;
    }

    TrafficSignal(String signal){
        this.signal = signal;
    }
}

public class EnumDemo {
    public static void main(String[] args){
        System.out.println(Color.RED);
        System.out.println(Color.GREEN);

        System.out.println(TrafficSignal.RED.getSignal());
        System.out.println(TrafficSignal.YELLOW.getSignal());
    }
}

