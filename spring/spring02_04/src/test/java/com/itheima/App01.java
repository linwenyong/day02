package com.itheima;

import com.itheima.config.SpringConfiguration;
import com.itheima.entity.Account;
import com.itheima.service.impl.AccountServiceImpl;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App01 {
    @Test
    public void find(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        AccountServiceImpl accountService = (AccountServiceImpl) ac.getBean("accountService");
        System.out.println(accountService.findAll());
    }
    @Test
    public void save(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        AccountServiceImpl accountService = (AccountServiceImpl) ac.getBean("accountService");
        accountService.save(new Account());
    }
    @Test
    public void update(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        AccountServiceImpl accountService = (AccountServiceImpl) ac.getBean("accountService");
        accountService.update(new Account());
    }
    @Test
    public void delete(){
        // 创建容器
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        // 从容器中获取对象
        AccountServiceImpl accountService = (AccountServiceImpl) ac.getBean("accountService");
        // 调用方法
        accountService.delete(4);
    }

    @Test
    public void find2(){
        AnnotationConfigApplicationContext anno = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        AccountServiceImpl accountService = (AccountServiceImpl) anno.getBean("accountServiceImpl");
        System.out.println(accountService.findAll());
    }
}
