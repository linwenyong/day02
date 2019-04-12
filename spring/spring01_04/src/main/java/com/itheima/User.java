package com.itheima;

public class User {
    private void init() {
        System.out.println("初始化方法！！");
    }
    public User() {
        System.out.println("创建User对象！！");
    }

    private void predestroy() {
        System.out.println("释放资源！！！");
    }
}
