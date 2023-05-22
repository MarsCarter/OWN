package com.own.controller;

import com.own.client.ProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mars
 */
@RestController
public class SystemController {

    @Autowired
    private ProviderClient providerClient;

    @GetMapping("/health")
    public String health(){
        return providerClient.health("System API");
    }

}
