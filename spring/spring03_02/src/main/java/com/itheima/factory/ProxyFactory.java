package com.itheima.factory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory<T> {

    private T target;

    public ProxyFactory(T target) {
        this.target = target;
    }

    public T getProxy(){
        return (T) Proxy.newProxyInstance(
                ProxyFactory.class.getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        Double money = (Double) args[0];
                        if (money > 10000) {
                            return method.invoke(target, args);
                        }
                        return null;
                    }
                }

        );
    }
}
