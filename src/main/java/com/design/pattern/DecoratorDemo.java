package com.design.pattern;

class Pizza {
    public String getDescription() {
        return "Pizza";
    }
}

class ChickenPizza extends Pizza {
    public String getDescription() {
        return "Chicken" + " " + super.getDescription();
    }
}

class LambPizza extends Pizza {
    public String getDescription() {
        return "Lamb" + " " + super.getDescription();
    }
}

abstract class PizzaDecorator extends Pizza {
    protected Pizza pizza;

    PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    public abstract String getDescription();
}

class WithCheez extends PizzaDecorator {

    WithCheez(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return this.pizza.getDescription() + " With Cheez";
    }
}

class WithPepper extends PizzaDecorator {

    WithPepper(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return this.pizza.getDescription() + " With Pepper";
    }
}

public class DecoratorDemo {
    public static void main(String[] args) {
        Pizza pizza = new WithCheez(new WithPepper(new ChickenPizza()));
        System.out.println(pizza.getDescription());
    }
}
