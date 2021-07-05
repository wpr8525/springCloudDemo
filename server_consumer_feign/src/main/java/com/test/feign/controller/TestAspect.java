package com.test.feign.controller;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class TestAspect {


@Pointcut("execution(* com.test.feign.controller..*.*(..))")
    public void pointcut(){


    }

    @Before("pointcut()")
    public void beFore(){
        System.out.println("前置通知");

    }
}
