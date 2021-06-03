package com.cn.allen.init;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * @Author:ZhangWeiWei
 * @Date:2021/3/5
 * @Description:
 */
@Component
public class FinishLoad implements ApplicationListener<ContextRefreshedEvent> {
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("spring加载完成");
    }
}
