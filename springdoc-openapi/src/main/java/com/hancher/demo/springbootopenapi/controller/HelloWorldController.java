package com.hancher.demo.springbootopenapi.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/hello")
@Tag(name="openapi demo")
public class HelloWorldController {

    @GetMapping("/world")
    @Operation(summary = "helloWorld接口",description = "接口描述信息")
    @Parameter(name = "name", description = "名称", required = true,  in = ParameterIn.QUERY)
    public String helloWorld(String name) {
        return "Hello "+ Optional.of(name).orElse("world");
    }

    /**
     * 隐藏的api，不再swagger 显示
     */
    @GetMapping("/hidden")
    public String hiddenApi(String name) {
        return "Hello "+ Optional.of(name).orElse("world");
    }
}
