package com.tql.pattern.factory.simplefactory;

public class Client {
    public static void main(String[] args) {
        Coffee coffee = SimpleCoffeeFactory.createCoffee("latte");
        System.out.println(coffee.getName());
    }


}
