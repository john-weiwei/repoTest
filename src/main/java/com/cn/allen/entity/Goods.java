package com.cn.allen.entity;

import lombok.Data;
import lombok.ToString;

import java.sql.Date;

/**
 * @Author:ZhangWeiWei
 * @Date:2021/6/9
 * @Description:
 */
@Data
@ToString
public class Goods {

    private Integer id;

    private String goodCode;

    private String goodName;

    private Integer goodCount;

    private Date gmtCreate;
}
