package com.hancher.demo.reactive.webdemo.service.cyceldependency;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
//@AllArgsConstructor
public class CycleA implements InitializingBean {
    @Autowired
    private CycleB cycleB;


    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("初始化循环依赖 bean A");
    }

}
