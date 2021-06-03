package com.cn.allen.mvc;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:ZhangWeiWei
 * @Date:2021/3/5
 * @Description:
 */
@ComponentScan(value = "com.cn.allen",includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class, RestController.class})})
public class MvcContainer {
}
