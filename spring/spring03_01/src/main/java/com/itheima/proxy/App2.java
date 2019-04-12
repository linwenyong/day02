package com.itheima.proxy;

import com.itheima.factory.ProxyFactory;



public class App2 {
    public static void main(String[] args) {
        IStar target = new LiuDeHuaStar();
        IStar proxy = new ProxyFactory<IStar>(target).getProxy();
        proxy.sing(20000d);
    }
}
