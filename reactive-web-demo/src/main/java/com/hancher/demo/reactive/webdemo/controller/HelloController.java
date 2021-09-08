package com.hancher.demo.reactive.webdemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * hello
 * @author hancher
 * @date 2021/9/6 16:47
 */
@RestController
@RequestMapping("/hello")
@Slf4j
public class HelloController {

    @GetMapping("/{name}")
    public String hello(@PathVariable String name) {
        if (StringUtils.isEmpty(name)) {
            name = "webflex";
        }

        String s = "hello " + name;
        log.info(s);
        return s;
    }
}
