package com.itheima;

import com.itheima.config.SpringConfiguration;
import com.itheima.entity.Account;
import com.itheima.service.IAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    @Test
    public void save(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        IAccountService accountService = ac.getBean(IAccountService.class);
        System.out.println("查看代理："+accountService.getClass());
        accountService.save(new Account());
    }
}
