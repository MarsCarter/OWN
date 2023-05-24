package com.own.mongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CommonMongoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommonMongoApplication.class, args);
    }

}
