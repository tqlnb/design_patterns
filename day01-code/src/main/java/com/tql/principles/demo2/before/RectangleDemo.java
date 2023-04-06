package com.tql.principles.demo2.before;

public class RectangleDemo {
    public static void main(String[] args) {
        //创建长方形
        Rectangle r = new Rectangle();

        //设置长和宽
        r.setWidth(20);
        r.setLength(10.5);

        //扩宽
        resize(r);

        printLengthAndWidth(r);

        System.out.println("=================");
        //创建正方形对象
        Square square = new Square();
        square.setLength(10.5);
        //扩宽
        resize(square);

        printLengthAndWidth(square);

    }

    //扩宽方法
    public static void resize(Rectangle rectangle){
        //判断长如果比宽小-扩宽
        while (rectangle.getLength() <= rectangle.getWidth()){
            rectangle.setLength(rectangle.getLength() + 1);
        }
    }

    //打印长和宽
    public static void printLengthAndWidth(Rectangle rectangle){
        System.out.println("长:"+rectangle .getLength() + " 宽:"+rectangle.getWidth());
    }
}
