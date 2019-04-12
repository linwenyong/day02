package com.itheima.dao;

import com.itheima.User;
import com.itheima.person.Person;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App04 {
    @Test
    public void createBean1(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean1.xml");
        Person person = (Person) ac.getBean("person");
        System.out.println(person);
    }


    @Test
    public void createBean2(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean2.xml");
        Person person = (Person) ac.getBean("person");
        System.out.println(person);
    }

    @Test
    public void createBean3(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean3.xml");
        Person person = (Person) ac.getBean("person");
        System.out.println(person);
    }

    @Test
    public void createBean4(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean4.xml");
        Person person = (Person) ac.getBean("person");
        System.out.println(person);
    }

    @Test
    public void createBean5(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean5.xml");
        Person person = (Person) ac.getBean("person");
        System.out.println(person);
    }
}
