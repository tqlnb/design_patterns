package com.tql.pattern.bulider.demo1;

public abstract class Builder {

    //声明bike变量并赋值
    protected Bike bike = new Bike();

    public abstract void buildFrame();

    public abstract void buildSeat();

    public abstract Bike createBike();
}
