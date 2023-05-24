package com.own.mongo.repository;

import com.own.mongo.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerRepository{

    @Autowired
    private MongoTemplate mongoTemplate;

    public Customer save(Customer customer) {
        return mongoTemplate.save(customer);
    }

    public List<Customer> list() {
        Query query = new Query(Criteria.where("account").is("cm06285"));
        return mongoTemplate.find(query, Customer.class);
    }

}
