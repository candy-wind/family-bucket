package com.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author candy-wind
 * @Data: 2020-04-14 15:49
 * @Version 1.0
 */

@SpringBootApplication
@MapperScan(basePackages = {"com.demo.mapper"})
public class SpringWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringWebApplication.class, args);

    }

}
