package com.own.redis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/redis")
public class TempController {

    @Autowired
    private RedisTemplate redisTemplate;

//    redisTemplate.opsForValue();　　//操作字符串
//    redisTemplate.opsForHash();　　 //操作hash
//    redisTemplate.opsForList();　　 //操作list
//    redisTemplate.opsForSet();　　  //操作set
//    redisTemplate.opsForZSet();　 　//操作有序set

    @GetMapping("/test")
    public String save(){
        redisTemplate.opsForValue().set("this key", "this value");
        return "success";
    }

}
