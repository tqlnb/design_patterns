package com.tql.pattern.factory.factory;

public class LatteCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        Coffee coffee = new LatteCoffee();
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
