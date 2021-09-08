package com.hancher.demo.reactive.webdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ReactiveWebDemoApplication extends SpringApplication {

    public static void main(String[] args) {
        new ReactiveWebDemoApplication(ReactiveWebDemoApplication.class).run(args);
    }


    public ReactiveWebDemoApplication(Class<?>... primarySources) {
        super( null, primarySources);
    }

    @Override
    protected ConfigurableApplicationContext createApplicationContext() {
        ConfigurableApplicationContext applicationContext = super.createApplicationContext();
        AnnotationConfigReactiveWebServerApplicationContext context = (AnnotationConfigReactiveWebServerApplicationContext) applicationContext;

        // 循环依赖开关
        context.setAllowCircularReferences(true);

        return context;
    }
}
