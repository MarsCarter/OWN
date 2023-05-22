package com.own.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mars
 */
@RestController
public class HealthController {

    @Value("${server.port}")
    String port;

    @GetMapping("/health")
    public String health(@RequestParam(value = "name", defaultValue = "MS-Provider",required = false) String name) {
        return "hello " + name + ", i'm ms-provider ,my port:" + port;
    }
}
