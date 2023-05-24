package com.own.mysql.service.impl;

import com.own.generate.model.Customer;
import com.own.generate.mapper.CustomerMapper;
import com.own.generate.service.CustomerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
