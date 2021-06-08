package com.cn.allen.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author:ZhangWeiWei
 * @Date:2021/6/8
 * @Description:
 */
@Service
public class CommonServiceImpl implements CommonService {

    private Logger log = LoggerFactory.getLogger(CommonServiceImpl.class);

    @Transactional
    @Override
    public void conn() {
        log.info("连接数据库");
    }
}
