package com.cn.allen.entity;

import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @Author:ZhangWeiWei
 * @Date:2021/6/7
 * @Description:
 */
@Component
@Data
@ToString
public class Chair {

    private Integer height = 110;

    private Integer width;

    private Student student;

    public Chair(Student student) {
        this.student = student;
    }

    //在构造函数的使用@Autowired注解，入参必须是引用类型，基本类型包装类
//    @Autowired
    public Chair(Integer height,Student student) {
        this.height = height;
        this.student = student;
    }
//    @Autowired
    public Chair() {
    }
}
