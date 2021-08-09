package com.hancher.demo.webdemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StopWatch;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/**
 * 测试controller 接口超时主动断开方式
 *
 * https://www.baeldung.com/spring-rest-timeout
 */
@RestController
@RequestMapping("timeout")
@Slf4j
public class TimeoutController {

    // 单纯的同步类
    @GetMapping("hello")
    public String hello() throws InterruptedException {
//        StopWatch stopWatch = new StopWatch();
        sleep(10);

        log.info("ok");
        return "hello world:" + System.currentTimeMillis();
    }

    // 测试异步请求超时
    // 即使超时中断了，如果没有抛异常，程序还会继续跑
    @GetMapping("helloAsync")
    public Callable<String> helloAsync() {
        return ()->{
            sleep(10);
            log.info("ok");
            return "hello world async:" + System.currentTimeMillis();
        };
    }


    private void sleep(int second) {
        for (int i = 0; i < 10; i++) {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            log.info("" + i);
        }
    }

    // 扑街 ，貌似有数据库才行
    @GetMapping("helloTrans")
    @Transactional(timeout = 1)
    public String helloTrans() {
        sleep(10);
        log.info("ok");
        return "hello world async:" + System.currentTimeMillis();

    }

}
