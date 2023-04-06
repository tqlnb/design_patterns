package com.tql.pattern.bulider.demo1;

public class OfoBuilder extends Builder{
    @Override
    public void buildFrame() {
        bike.setFrame("车架2");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("车座2");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
