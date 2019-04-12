package com.itheima;


import com.itheima.entity.*;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    @Test
    public void anno1(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        User1 user1 = (User1) ac.getBean("user1");
        System.out.println(user1);
    }

    @Test
    public void anno2(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        User2 user2 = (User2) ac.getBean("user2");
        System.out.println(user2);
    }

    @Test
    public void anno3(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        User3 user3 = (User3) ac.getBean("user3");
        System.out.println(user3);
    }

    @Test
    public void anno4(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        User4 user4 = (User4) ac.getBean("user4");
        System.out.println(user4);
    }
    @Test
    public void anno5(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        User5 user5 = (User5) ac.getBean("user5");
        System.out.println(user5);
    }
    @Test
    public void anno6(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        User6 user = (User6) ac.getBean("user6");
        System.out.println(user);
    }
    @Test
    public void anno7(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        User7 user = (User7) ac.getBean("user7");
        System.out.println(user);
    }
    @Test
    public void anno8(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        User8 user = (User8) ac.getBean("user8");
        System.out.println(user);
        ac.close();
    }
}
