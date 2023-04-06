package com.tql.pattern.proxyjdk;

public class Transtation implements SellTickets{
    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }
}
