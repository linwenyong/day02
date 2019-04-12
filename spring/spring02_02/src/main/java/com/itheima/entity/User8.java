package com.itheima.entity;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("singleton")
@Lazy
public class User8 {
    public User8(){
        System.out.println("创建User8对象！！！");
    }
    @PostConstruct
    public void init(){
        System.out.println("初始化开始");
    }
    @PreDestroy
    public void release(){
        System.out.println("释放资源");
    }
}
