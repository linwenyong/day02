package com.itheima.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User4 {
    private String str1;
    private Integer name2;


    @Autowired
    public void setName(String str1,Integer name2){
        this.str1 = str1;
        this.name2 = name2;
    }

    @Override
    public String toString() {
        return "User4{" +
                "str1='" + str1 + '\'' +
                ", name2='" + name2 + '\'' +
                '}';
    }
}
