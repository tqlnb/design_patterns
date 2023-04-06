package com.tql.pattern.factory.factory;

public class Client {
    public static void main(String[] args) {
        CoffeeFactory factory = new LatteCoffeeFactory();
        Coffee coffee = factory.createCoffee();
        System.out.println(coffee.getName());
    }
}
