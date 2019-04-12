package com.itheima.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class User5 {

    @Autowired
    @Qualifier("str2")

    private String str1;

    @Override
    public String toString() {
        return "User5{" +
                "str1='" + str1 + '\'' +
                '}';
    }
}
