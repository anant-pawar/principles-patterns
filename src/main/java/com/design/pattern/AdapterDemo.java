package com.design.pattern;

interface Bird {
    void fly();

    void makeSound();
}

class Pigeon implements Bird {

    @Override
    public void fly() {
        System.out.println("Flying");
    }

    @Override
    public void makeSound() {
        System.out.println("Coo");
    }
}

interface ToyBird {
    void squeak();
}

class PlasticBird implements ToyBird {
    @Override
    public void squeak() {
        System.out.println("Squeak");
    }
}

class BirdAdapter implements ToyBird {
    private Bird bird;

    BirdAdapter(Bird bird) {
        this.bird = bird;
    }

    @Override
    public void squeak() {
        bird.makeSound();
    }
}

public class AdapterDemo {

    public static void main(String[] args) {
        Bird bird = new Pigeon();
        bird.makeSound();

        ToyBird toyBird = new PlasticBird();
        toyBird.squeak();

        ToyBird toyBird1 = new BirdAdapter(new Pigeon());
        toyBird1.squeak();

    }
}
