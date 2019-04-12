package com.itheima;

import com.itheima.config.SpringConfiguration;
import com.itheima.service.IAccountService;
import com.itheima.service.impl.IAccountServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App2 {
    @Test
    public void save(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        IAccountService accountService = (IAccountService) ac.getBean("service");
        System.out.println("查看代理对象："+accountService.getClass());
        accountService.save();
    }


    @Test
    public void save2(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        IAccountServiceImpl accountService = (IAccountServiceImpl) ac.getBean("service");
        System.out.println("查看代理对象："+accountService.getClass());
        accountService.save();
    }
}
