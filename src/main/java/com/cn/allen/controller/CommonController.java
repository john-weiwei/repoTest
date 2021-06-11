package com.cn.allen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author:ZhangWeiWei
 * @Date:2021/3/5
 * @Description:
 */
@Controller
@RequestMapping("common")
public class CommonController {

    @RequestMapping("index")
    @ResponseBody
    public String index() {
        return "index";
    }


    @RequestMapping("success")
    @ResponseBody
    public String success() {
        return "success";
    }

}
