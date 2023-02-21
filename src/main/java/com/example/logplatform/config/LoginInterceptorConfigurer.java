package com.example.logplatform.config;

import com.example.logplatform.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;

//注册拦截器
@Configuration
public class LoginInterceptorConfigurer implements WebMvcConfigurer {

    HandlerInterceptor interceptor = new LoginInterceptor();

    //配置拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        // 创建拦截器对象
        HandlerInterceptor interceptor = new LoginInterceptor();

        // 白名单
        List<String> patterns = new ArrayList<String>();
        patterns.add("/bootstrap3/**");
        patterns.add("/css/**");
        patterns.add("/images/**");
        patterns.add("/js/**");
        patterns.add("/web/register.html");
        patterns.add("/web/login.html");
        patterns.add("/web/index.html");
        patterns.add("/web/product.html");
        patterns.add("/users/reg");
        patterns.add("/users/login");
        patterns.add("/districts/**");
        patterns.add("/products/**");

        //注册拦截器
        //addPathPatterns表示拦截的url是什么
        registry.addInterceptor(interceptor).addPathPatterns("/**").excludePathPatterns(patterns);
        //WebMvcConfigurer.super.addInterceptors(registry);

    }
}
