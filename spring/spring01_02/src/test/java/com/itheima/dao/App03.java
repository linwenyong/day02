package com.itheima.dao;

import com.itheima.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App03 {
    @Test
    public void createBean(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        User user = (User) ac.getBean("user1");
        System.out.println(user);
    }
}
