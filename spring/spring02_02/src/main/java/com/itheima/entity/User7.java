package com.itheima.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class User7 {
    @Value("30")
    private int id;
    @Value("rose")
    private String name;

    @Override
    public String toString() {
        return "User7{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
