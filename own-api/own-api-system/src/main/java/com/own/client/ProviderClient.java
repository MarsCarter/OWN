package com.own.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "ms-provider" )
public interface ProviderClient {

    @GetMapping("/health")
    String health(@RequestParam(value = "name", defaultValue = "API-System", required = false) String name);

}
