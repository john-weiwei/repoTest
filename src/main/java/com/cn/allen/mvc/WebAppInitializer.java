package com.cn.allen.mvc;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @Author:ZhangWeiWei
 * @Date:2021/3/5
 * @Description:
 */
public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringContainer.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{MvcContainer.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
