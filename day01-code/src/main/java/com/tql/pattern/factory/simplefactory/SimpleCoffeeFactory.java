package com.tql.pattern.factory.simplefactory;

public class SimpleCoffeeFactory {
    public static Coffee createCoffee(String type){
        Coffee coffee;
        if(type.equalsIgnoreCase("american")){
           coffee = new AmericanCoffee();
        } else if (type.equalsIgnoreCase("latte")) {
            coffee = new LatteCoffee();
        }else {
            throw new RuntimeException("咖啡选择错误");
        }
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
