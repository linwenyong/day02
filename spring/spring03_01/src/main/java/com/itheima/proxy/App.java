package com.itheima.proxy;

public class App {
    public static void main(String[] args) {
         IStar proxy = new LiuDeHuaProxy();
         proxy.sing(20000d);
         proxy.act(5000d);//不执行
    }
}
