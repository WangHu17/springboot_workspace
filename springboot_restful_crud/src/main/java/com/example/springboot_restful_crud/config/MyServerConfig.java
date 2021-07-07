package com.example.springboot_restful_crud.config;

import com.example.springboot_restful_crud.filter.HelloFilter;
import com.example.springboot_restful_crud.listener.HelloListener;
import com.example.springboot_restful_crud.servlet.HelloServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author wanghu
 * @discrption：
 * @create 2021-06-08 11:27
 */
@Configuration
public class MyServerConfig {

    //注册三大组件
    @Bean
    public ServletRegistrationBean myServlet(){
        ServletRegistrationBean<HelloServlet> bean = new ServletRegistrationBean<>(new HelloServlet(), "/helloServlet");
        return bean;
    }

    @Bean
    public FilterRegistrationBean myFilter(){
        FilterRegistrationBean<Filter> bean = new FilterRegistrationBean<>();
        bean.setFilter(new HelloFilter());
        bean.setUrlPatterns(Arrays.asList("/hello"));
        return bean;
    }

    @Bean
    public ServletListenerRegistrationBean myListener(){
        ServletListenerRegistrationBean<HelloListener> bean = new ServletListenerRegistrationBean<>(new HelloListener());
        return bean;
    }

}
