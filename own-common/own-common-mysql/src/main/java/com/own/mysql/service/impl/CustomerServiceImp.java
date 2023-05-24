package com.own.mysql.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.own.mysql.mapper.CustomerMapper;
import com.own.mysql.model.Customer;
import com.own.mysql.service.CustomerService;
import org.springframework.stereotype.Service;

/**
 *  服务类实现类
 *
 * @author Mars
 * @since 2023-05-24
 */
@Service
public class CustomerServiceImp extends ServiceImpl<CustomerMapper, Customer> implements CustomerService {

}
