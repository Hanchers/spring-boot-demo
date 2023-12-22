package com.hancher.demo.webdemo.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
/**
 * 通用filter
 * @author hancher
 * @date 2023/12/22 11:45
 */
@Slf4j
@WebFilter(filterName = "commonFilter",urlPatterns = "/*" )  // filter配置方法1
public class CommonFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("CommonFilter doFilter");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        // 销毁过滤器
        System.out.println("Filter1: Destroy");
    }
}
