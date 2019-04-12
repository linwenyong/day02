package com.itheima.person;

import java.util.*;

public class Person {
    private int id;
    private String name;

    // 集合属性
    private List<String> list;
    private Set<String> set;
    private String[] array;
    private Map<String,Object> map;
    private Properties properties;

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", list=" + list +
                ", set=" + set +
                ", array=" + Arrays.toString(array) +
                ", map=" + map +
                ", properties=" + properties +
                '}';
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Person() {
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
