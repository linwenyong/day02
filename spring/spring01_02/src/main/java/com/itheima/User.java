package com.itheima;

public class User {
    public User() {
        System.out.println("创建User对象！！！");
    }

    public void init() {
        System.out.println("开始初始化！！！");
    }

    public void preDestroy() {
        System.out.println("释放资源！！！");
    }
}
