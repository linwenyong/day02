package com.itheima.dao;

import com.itheima.User;
import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class App02 {
    @Test
    public void ioc1(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println(ac);
    }

    @Test
    public void ioc2(){
        FileSystemXmlApplicationContext fc = new FileSystemXmlApplicationContext("E:\\IdeaProjects\\spring\\spring01_02\\src\\main\\resources\\applicationContext.xml");
        System.out.println(fc);
    }

    @Test
    public void ioc3(){
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(App02.class);
        System.out.println(ac);
    }

    @Test
    public void ioc4(){
        ClassPathResource resource = new ClassPathResource("applicationContext.xml");
        XmlBeanFactory factory = new XmlBeanFactory(resource);
        User user = (User) factory.getBean("user");
        System.out.println(user);
    }

}
