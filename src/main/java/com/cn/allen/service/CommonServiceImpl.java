package com.cn.allen.service;

import com.cn.allen.entity.Person;
import com.cn.allen.mapper.CommonMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author:ZhangWeiWei
 * @Date:2021/6/8
 * @Description:
 */
@Service
public class CommonServiceImpl implements CommonService {

    private Logger log = LoggerFactory.getLogger(CommonServiceImpl.class);

    @Autowired
    private CommonMapper commonMapper;

    @Transactional
    @Override
    public void conn() {
        log.info("连接数据库");
    }

    @Transactional(propagation = Propagation.MANDATORY)
    @Override
    public void addPerson(){
        log.info("添加人员");
        Person person = new Person();
        person.setName("Allen");
        person.setAge(23);
        int result = commonMapper.addPerson(person);
        log.info("添加人员成功:{}",result);
    }
}
