package com.own.mysql.controller;

import com.own.generate.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.own.generate.service.CustomerService;

import java.util.Date;

/**
 * CustomerController 前端控制器
 *
 * @author Mars
 * @since 2023-05-24
 */
@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService service;

    @PostMapping("/save")
    public boolean save(){
        Customer customer = new Customer();
        customer.setAccount("cm06285");
        customer.setName("mars");
        customer.setAge(20);
        customer.setCreateTs(new Date());
        customer.setUpdateTs(new Date());
        return  service.save(customer);
    }

}
