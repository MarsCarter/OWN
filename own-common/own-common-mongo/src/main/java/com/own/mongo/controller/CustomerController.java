package com.own.mongo.controller;

import com.own.mongo.model.Customer;
import com.own.mongo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * CustomerController 前端控制器
 *
 * @author Mars
 * @since 2023-05-24
 */
@RestController
@RequestMapping("/mongo")
public class CustomerController {

    @Autowired
    private CustomerRepository repository;

    @GetMapping("/save")
    public String save(){
        Customer customer = new Customer();
        customer.setAccount("cm06285");
        customer.setName("mars");
        customer.setPassword("123456");
        customer.setAge(20);
        customer.setCreateTs(new Date());
        customer.setUpdateTs(new Date());
        return  repository.save(customer).toString();
    }

    @GetMapping("/list")
    public String list(){
        return repository.list().toString();
    }

}
