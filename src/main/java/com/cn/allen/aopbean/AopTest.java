package com.cn.allen.aopbean;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @Author:ZhangWeiWei
 * @Date:2021/3/11
 * @Description:
 */
@Component
@Aspect
public class AopTest {

    private Logger log = LoggerFactory.getLogger(AopTest.class);
    /**
     * 拦截所有的controller
     */
    @Pointcut("execution(* com.cn.allen.controller.*.*(..))")
    public void commonPoint() {

    }

    @After("commonPoint()")
    public void afterAdvisor() {
        log.info("执行到了aop的after增强");
    }

    @Before("commonPoint()")
    public void beforeAdvisor() {
        log.info("业务执行前被增强了");
    }

    /**
     * 拦截所有的业务调用
     */
//    @Pointcut("execution(* com.cn.allen.service.*.*(..))")
//    public void interceptorService() {
//
//    }
//
//    @After("interceptorService()")
//    public void afterAdvisorService() {
//        log.info("拦截service的after增强");
//    }
//
//    @Before("interceptorService()")
//    public void beforeAdvisorService() {
//        log.info("拦截service业务前被增强了");
//    }
}
