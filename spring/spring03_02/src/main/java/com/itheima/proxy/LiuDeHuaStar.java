package com.itheima.proxy;

public class LiuDeHuaStar implements IStar {
    @Override
    public void sing(Double money) {
        System.out.println("刘德华唱歌，收取出场费："+money);
    }

    @Override
    public void act(Double money) {
        System.out.println("刘德华表演，收取出场费："+money);
    }
}
