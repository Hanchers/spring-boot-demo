package com.hancher.demo.webdemo.inteceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MyInteceptor())
                .addPathPatterns("/**") // 指定Interceptor应用的路径模式
                .excludePathPatterns("/exclude-path"); // 指定排除的路径模式
    }
}