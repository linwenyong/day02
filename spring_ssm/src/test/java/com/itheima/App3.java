package com.itheima;

import com.itheima.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class App3 {

    @Autowired
    private IUserService userService;

    @Test
    public void findAll(){
        System.out.println(userService.findAll());
        System.out.println("查看代理对象："+userService.getClass());
    }
}
