package com.hancher.demo.webdemo.filter;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * 通用filter
 * @author hancher
 * @date 2023/12/22 11:45
 */
@Slf4j
public class CommonFilter2 implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        // filter 配置方法2
        log.info("CommonFilter2 doFilter");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        // 销毁过滤器
        System.out.println("Filter2: Destroy");
    }
}
