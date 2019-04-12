package com.itheima;


import com.itheima.config.SpringConfiguration;
import com.itheima.service.IAccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfiguration.class)
public class App {

    @Autowired
    //@Resource(name = "service")
    private IAccountService accountService;

    @Test
    public void save(){
        System.out.println("查看代理对象："+accountService.getClass());
        accountService.save();
    }

}
