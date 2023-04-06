package com.tql.pattern.bulider.demo1;

public class Client {
    public static void main(String[] args) {
        //创建指挥者对象
        Director director = new Director(new OfoBuilder());
        //让指挥者组装自行车
        Bike bike = director.construct();

        System.out.println(bike);
    }
}
