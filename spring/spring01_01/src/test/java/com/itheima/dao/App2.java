package com.itheima.dao;

import com.itheima.factory.BeanFactory;
import com.itheima.service.IUserService;

public class App2 {
    public static void main(String[] args)  {
       // UserServiceImpl userService = new UserServiceImpl();

        IUserService userService = BeanFactory.getBean("userService");
        userService.save();
    }
}
