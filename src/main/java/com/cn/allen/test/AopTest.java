package com.cn.allen.test;

import com.cn.allen.entity.ScanBeans;
import com.cn.allen.service.MyService;
import com.cn.allen.service.TransactionService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author:ZhangWeiWei
 * @Date:2021/3/29
 * @Description:
 */

public class AopTest {

    private ApplicationContext applicationContext;

    @Before()
    public void ready() {
        applicationContext = new AnnotationConfigApplicationContext(ScanBeans.class);
    }

    /*
    *  Caused by: java.lang.IllegalStateException: No ServletContext set
    *  需要关闭mvc功能，即去掉@EnableWebMvc注解
    * */
    @Test
    public void aopTest1() {
        TransactionService transactionService = applicationContext.getBean(TransactionService.class);
        transactionService.search();
    }
}
