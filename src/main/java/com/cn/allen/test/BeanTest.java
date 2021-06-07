package com.cn.allen.test;

import com.cn.allen.entity.Chair;
import com.cn.allen.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private Logger log = LoggerFactory.getLogger(BeanTest.class);

    @Test
    public void test1() {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext("com.cn.allen.entity");
//        Student student = (Student) applicationContext.getBean("student");
//        log.info(student.getName());
        Chair chair = (Chair) applicationContext.getBean("chair");
        System.out.println(chair.toString());
    }

    @Test
    public void test2() throws ClassNotFoundException {
        Class clazz = Student.class;
        Class refClazz = Class.forName(Student.class.getName());
        System.out.println(clazz);
        System.out.println(refClazz);
    }

}
