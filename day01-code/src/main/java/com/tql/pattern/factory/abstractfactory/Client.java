package com.tql.pattern.factory.abstractfactory;

public class Client {
    public static void main(String[] args) {
        DessertFactory dessertFactory = new ItalyDessertFactory();

        Dessert dessert = dessertFactory.createDessert();
        Coffee coffee = dessertFactory.createCoffee();

        dessert.show();
        System.out.println(coffee.getName());
    }
}
