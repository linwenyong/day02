package com.itheima.factory;

import java.security.Key;
import java.util.ResourceBundle;

public class BeanFactory {
    private static ResourceBundle bundle;
    static {
        bundle = ResourceBundle.getBundle("bean");
    }

    public static <T> T getBean(String key) {
        try {
            String className = bundle.getString(key);
            return (T) Class.forName(className).newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
