package com.own.mysql;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.own.mysql.mapper")
public class CommonMysqlApplication {
    public static void main(String[] args) {
        SpringApplication.run(CommonMysqlApplication.class, args);
    }

}