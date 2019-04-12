package com.itheima;

import com.itheima.service.IUserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    @Test
    public void save(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        IUserService userService = (IUserService) ac.getBean("userService");
        System.out.println("查看代理对象："+userService.getClass());
        //userService.save();
        userService.update(100);
    }
}
