package com.cn.allen.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author ZhangWeiWei
 * @date 2021/6/5 12:13
 * @description
 */
@Component
@Data
public class Teacher {

    private String name;

    private int age;

    @Autowired
    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Teacher(String name) {
        this.name = name;
    }
}
