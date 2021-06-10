package com.cn.allen.entity;

import lombok.Data;

import java.sql.Date;

/**
 * @Author:ZhangWeiWei
 * @Date:2021/6/9
 * @Description:
 */
@Data
public class Person {

    private Integer id;

    private String name;

    private Integer age;

    private Date gmtCreate;

}
