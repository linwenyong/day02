package com.itheima;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App01 {
    @Test
    public void getBean(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user1 = (User) ac.getBean("user");
        User user2 = (User) ac.getBean("user");
        System.out.println(user1);
        System.out.println(user2);
        ac.close();
    }
}
