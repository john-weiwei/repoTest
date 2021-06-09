package com.cn.allen.mapper;

import com.cn.allen.entity.Goods;
import com.cn.allen.entity.Person;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author:ZhangWeiWei
 * @Date:2021/6/9
 * @Description:
 */
@Repository
public interface CommonMapper {

    @Select("SELECT id,good_code,good_name FROM goods LIMIT 10")
    List<Goods> queryGoods();

    @Insert("INSERT INTO goods(good_code,good_name) values(#{goodCode},#{goodName})")
    int addGoods(Goods goods);

    @Insert("INSERT INTO person(name,age) values(#{name},#{age})")
    int addPerson(Person person);
}
