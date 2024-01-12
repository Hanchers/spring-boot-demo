package com.hancher.demo.webdemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("test")
@Slf4j
public class TestController {

    @Value("${hancher.test.empty}")
    private String emptyCofig;

    // 单纯的同步类
    @GetMapping("hello")

    public String hello(@RequestParam("redirect") String redirectUrl) throws InterruptedException {
        String s = Optional.ofNullable(redirectUrl).orElse("no url");
        log.info(s);
        return s;
    }

    // 单纯的同步类
    @GetMapping("config")
    public String config() throws InterruptedException {
        // ${hancher.test.empty} + 配置只要存在，以配置为准。hancher.test.empty= 为空字符串。 没有配置报错
        return "config="+emptyCofig;
    }

}
