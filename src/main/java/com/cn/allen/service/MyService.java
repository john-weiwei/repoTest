package com.cn.allen.service;

import ch.qos.logback.core.encoder.EchoEncoder;
import com.alibaba.fastjson.JSON;
import com.cn.allen.entity.Goods;
import com.cn.allen.mapper.CommonMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.List;

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

    @Autowired
    private CommonMapper commonMapper;

    @Autowired
    private TransactionService transactionService;

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void search() {
        //@Transactional(propagation = Propagation.REQUIRED)
        transactionService.add("X60");
        //@Transactional(propagation = Propagation.REQUIRES_NEW)
        commonService.addPerson();//addPerson 方法抛运行时异常
        log.info("查询数据");
        List<Goods> goods = commonMapper.queryGoods();
        log.info("返回的数据：{}",JSON.toJSONString(goods));
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void add(String msg) {
        log.info("添加数据：{}",msg);
        Goods goods = new Goods();
        goods.setGoodCode("1234456");
        goods.setGoodName("vivoX60");
        commonMapper.addGoods(goods);
        log.info("添加数据成功：{}",JSON.toJSONString(goods));
    }


}
