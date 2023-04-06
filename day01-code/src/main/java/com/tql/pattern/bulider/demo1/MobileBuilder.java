package com.tql.pattern.bulider.demo1;

public class MobileBuilder extends Builder{
    @Override
    public void buildFrame() {
        bike.setFrame("车架1");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("车座1");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
