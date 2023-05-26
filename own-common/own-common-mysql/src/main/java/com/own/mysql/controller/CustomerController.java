package com.own.mysql.controller;

import com.own.mysql.model.Customer;
import com.own.mysql.service.CustomerService;
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
@RequestMapping("/mysql")
public class CustomerController {

    @Autowired
    private CustomerService service;

    @GetMapping("/save")
    public boolean save(){
        Customer customer = new Customer();
        customer.setAccount("cm06285");
        customer.setName("mars");
        customer.setPassword("123456");
        customer.setAge(20);
        customer.setCreateTs(new Date());
        customer.setUpdateTs(new Date());
        return  service.save(customer);
    }

    @GetMapping("/list")
    public String list(){
        return service.list().toString();
    }

}
