package com.hancher.demo.sharding.jdbc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = {"com.hancher.demo.sharding.jdbc.repository.dao"})
public class ShardingJdbcDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShardingJdbcDemoApplication.class,args);
    }
}
