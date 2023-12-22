package com.hancher.demo.webdemo.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean<CommonFilter2> myFilterRegistration() {
        // filter 配置方法2
        FilterRegistrationBean<CommonFilter2> registration = new FilterRegistrationBean<>();
        registration.setFilter(new CommonFilter2());
        registration.addUrlPatterns("/*");
        registration.setName("commonFilter2");
//        registration.setOrder(1); // 设置过滤器的执行顺序

        return registration;
    }
}
