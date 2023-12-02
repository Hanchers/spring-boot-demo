package com.hancher.demo.springbootopenapi.config;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    /**
     * 添加摘要信息
     */
    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(new Info().title("hancher demo open api")
                        .description("helloWorld接口文档")
                        .version("v3.0.0")
                        // 联系人
                        .contact(new Contact().name("寒澈").url("https://www.hancher.top/"))
                )
                // 其他文档信息
                .externalDocs(new ExternalDocumentation()
                        .description("寒澈笔记")
                        .url("https://www.hancher.top/"));
    }


    /**
     * 模式三： 自定义api分组
     *
     */
//    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
//                .group("helloWorld-api")
                .packagesToScan("com.hancher.demo.springbootopenapi.controller") // 扫描包
                .displayName("寒澈openapi")
                .addOpenApiMethodFilter(method -> method.isAnnotationPresent(Operation.class))
                .build();
    }
}
