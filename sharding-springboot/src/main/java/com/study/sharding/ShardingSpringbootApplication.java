package com.study.sharding;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@MapperScan(basePackages = {"com.study.sharding.dao"})
@SpringBootApplication
public class ShardingSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingSpringbootApplication.class, args);
    }

}
