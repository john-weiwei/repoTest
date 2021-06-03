package com.cn.allen.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @Author:ZhangWeiWei
 * @Date:2021/6/3
 * @Description:
 */
@Component
@Data
public class Student {

    private String name = "lisi";

    private int age = 11;
}
