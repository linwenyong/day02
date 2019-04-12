package com.itheima;

import com.itheima.service.UserServiceImpl;

public class App02 {
    public static void main(String[] args) {
        UserServiceImpl userservice = new UserServiceImpl();
        userservice.save();
    }
}
