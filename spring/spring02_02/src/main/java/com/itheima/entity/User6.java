package com.itheima.entity;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class User6 {
    @Resource(name = "str2")
    private String name;

    @Override
    public String toString() {
        return "User6{" +
                "name='" + name + '\'' +
                '}';
    }
}
