package com.tql.pattern.proxyjdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {

    private Transtation station = new Transtation();

    public SellTickets getProxyObject(){
        //使用Proxy获取代理对象
        /*
            newProxyInstance()方法参数说明：
                ClassLoader loader ： 类加载器，用于加载代理类，使用真实对象的类加载器即可
                Class<?>[] interfaces ： 真实对象所实现的接口，代理模式真实对象和代理对象实现相同的接口
                InvocationHandler h ： 代理对象的调用处理程序
         */
        SellTickets sellTickets = (SellTickets)Proxy.newProxyInstance(
                station.getClass().getClassLoader(),
                station.getClass().getInterfaces(),
                new InvocationHandler() {
                    /*
                        InvocationHandler中invoke方法参数说明：
                            proxy ： 代理对象,和proxyObject是同一个对象,在invoke方法中基本不用
                            method ： 对应于在代理对象上调用的接口方法的 Method 实例(对接口中的方法进行封装)
                            args ： 代理对象调用接口方法时传递的实际参数
                            返回值 : 方法的返回值
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("增强");
                        return method.invoke(station,args);
                    }
                }
        );
        return sellTickets;
    }

}
