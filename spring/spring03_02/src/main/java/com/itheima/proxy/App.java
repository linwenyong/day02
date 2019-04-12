package com.itheima.proxy;

import com.itheima.factory.ProxyFactory;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;


public class App {
    public static void main(String[] args) {
        IStar target = new LiuDeHuaStar();
        LiuDeHuaStar proxy = (LiuDeHuaStar) Enhancer.create(LiuDeHuaStar.class, new MethodInterceptor() {
            @Override
            public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
                Double money = (Double) args[0];
                if (money > 10000) {
                    return method.invoke(target, args);
                }
                return null;
            }
        });

        System.out.println("查看代理对象："+proxy.getClass());
        proxy.sing(20000D);
    }
}
