package com.itheima.factory;

import com.itheima.User;

public class UserFactory {
    public static User createUserByStatic(){
        System.out.println("调用工厂的静态方法创建对象");
        return new User();
    }

    public User createUser(){
        System.out.println("调用工厂的实例方法创建对象");
        return new User();
    }
}
