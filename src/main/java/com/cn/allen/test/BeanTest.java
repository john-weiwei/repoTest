package com.cn.allen.test;

import com.cn.allen.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author:ZhangWeiWei
 * @Date:2021/6/3
 * @Description:
 */
//此注解慎用，在执行测试会调用到指定的类，SpringJUnit4ClassRunner是spring提供测试上下文的框架，基于JUnit实现
//@RunWith(SpringJUnit4ClassRunner.class)
public class BeanTest {

    @Test
    public void test1() {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext("com.cn.allen.entity");
        Student student = (Student) applicationContext.getBean("student");
        System.out.println(student.getName());
    }

}
