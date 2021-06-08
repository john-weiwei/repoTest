package com.cn.allen.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author:ZhangWeiWei
 * @Date:2021/3/29
 * @Description:
 */
@Service
public class MyService implements TransactionService{

    private Logger log = LoggerFactory.getLogger(MyService.class);

    @Autowired
    private CommonService commonService;

    @Override
    public void search() {
        commonService.conn();
        log.info("查询数据");
    }

    @Transactional
    @Override
    public void add(String msg) {
        commonService.conn();
        log.info("添加数据：{}",msg);
    }

}
