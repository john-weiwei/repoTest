package com.cn.allen.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Service;

/**
 * @Author:ZhangWeiWei
 * @Date:2021/6/4
 * @Description:
 * 自己实现的FactoryBean
 * 表示不会急于初始化这个bean（Desk），即使它是单例的
 * 只有实际调用getObject方法才会进行初始化
 * 总结：自己实现的FactoryBean<T> 中T对象的初始化动作不是spring来做，而是由开发人员处理。
 *
 * 为什么实现了FactoryBean的类不会执行getBean？
 *     如果一个bean实现了这个接口，它就会被当成一个对象工厂来使用，而不是普通的bean实例，它的生命周期不归spring管，
 *     调用getObject方法始终返回的是它创建的对象引用。
 */
//@Service
public class FactoryBeanDemo implements FactoryBean<Desk> , BeanFactoryAware {

    private Logger log = LoggerFactory.getLogger(FactoryBeanDemo.class);

    @Override
    public Desk getObject() throws Exception {
        return new Desk();
    }

    @Override
    public Class<?> getObjectType() {
        return Desk.class;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
//        Student student = (Student) beanFactory.getBean("student");
//        log.info("implement BeanFactoryAware invoke getBean：{}",student.toString());
    }
}
