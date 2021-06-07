package com.cn.allen.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @Author:ZhangWeiWei
 * @Date:2021/3/29
 * @Description:
 */
@Service
public class MyService implements TransactionService{

    private Logger log = LoggerFactory.getLogger(MyService.class);

    @Override
    public void search() {
        log.info("查询数据");
    }
}
