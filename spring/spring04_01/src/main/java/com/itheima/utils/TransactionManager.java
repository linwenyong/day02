package com.itheima.utils;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TransactionManager {
    @Around("execution(* com.itheima.service.impl.*.*(..))")
    public Object transactionManager(ProceedingJoinPoint pjp){
        try {
            System.out.println("开启事务");
            Object proceed = pjp.proceed();
            System.out.println("提交事务");
            return proceed;
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("回滚事务");
        } finally {
            System.out.println("释放资源");
        }
        return null;
    }
}
