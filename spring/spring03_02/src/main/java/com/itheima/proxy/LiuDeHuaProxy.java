package com.itheima.proxy;

public class LiuDeHuaProxy implements IStar {

    private LiuDeHuaStar target = new LiuDeHuaStar();

    @Override
    public void sing(Double money) {
        if (money>10000){
            target.sing(money);
        }
    }

    @Override
    public void act(Double money) {
        if (money>10000){
            target.act(money);
        }
    }
}
