package com.hancher.demo.webdemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("test")
@Slf4j
public class TestController {

    // 单纯的同步类
    @GetMapping("hello")
    public String hello(@RequestParam("redirect") String redirectUrl) throws InterruptedException {
        String s = Optional.ofNullable(redirectUrl).orElse("no url");
        log.info(s);
        return s;
    }
}
