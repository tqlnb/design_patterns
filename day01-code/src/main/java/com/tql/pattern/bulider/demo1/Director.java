package com.tql.pattern.bulider.demo1;

public class Director {

    //声明builder类型变量
    private final Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    //组装自行车
    public Bike construct(){
        builder.buildFrame();
        builder.buildSeat();
        return builder.createBike();
    }
}
