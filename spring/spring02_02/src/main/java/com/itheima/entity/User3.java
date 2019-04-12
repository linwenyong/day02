package com.itheima.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User3 {

    @Autowired
    private String str1;
    @Autowired
    private String str2;


    @Override
    public String toString() {
        return "User3{" +
                "str1='" + str1 + '\'' +
                ", str2='" + str2 + '\'' +
                '}';
    }
}
