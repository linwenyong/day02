package com.itheima.utils;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAspect {
    public void InsertLog(){
        System.out.println("执行对象的方法");
    }


    public void before(){
        System.out.println("【前置通知】执行对象方法之前执行");
    }

    public void afterReturning(){
        System.out.println("【后置通知】执行对象方法之后执行");
    }

    public void afterThrowing(){
        System.out.println("【异常通知】执行对象方法出现异常后才执行");
    }

    public void after(){
        System.out.println("【最终通知】执行对象方法之后一定执行");
    }


    public Object around(ProceedingJoinPoint pjp){
        try {
            Object[] args = pjp.getArgs();
            args[0]=168;

            System.out.println("获取当前执行的方法名称："+pjp.getSignature().getName());
            System.out.println("获取当前执行的方法所在的类全名："+pjp.getTarget().getClass().getName());

            System.out.println("【环绕前】");
            Object proceed = pjp.proceed(args);
            System.out.println("【环绕后】");

            return proceed;
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("【环绕异常】");
            return null;
        } finally {
            System.out.println("【环绕最终】");
        }
    }
}
