package com.tql.pattern.proxycglib;

public class Client {
    public static void main(String[] args) {
        //创建代理工厂对象
        ProxyFactory proxyFactory = new ProxyFactory();
        //获取代理对象
        TrainStation proxyObject = proxyFactory.getProxyObject();
        //调用代理对象的sell卖票
        proxyObject.sell();

    }
}
