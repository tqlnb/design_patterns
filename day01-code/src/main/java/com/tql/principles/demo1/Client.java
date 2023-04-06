package com.tql.principles.demo1;

public class Client {
    public static void main(String[] args) {
        //创建输入法对象
        SougouInput sougouInput = new SougouInput();
        //创建皮肤对象
        DefaultSkin defaultSkin = new DefaultSkin();
        //将皮肤设置到输入法中
        sougouInput.setSkin(defaultSkin);
        //显示皮肤
        sougouInput.display();

    }
}
