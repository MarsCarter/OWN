package com.own.project.service.impl;

import com.own.project.model.Customer;
import com.own.project.repository.CustomerMapper;
import com.own.project.service.ICustomerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author mars
 * @since 2023-05-22
 */
@Service
public class CustomerService extends ServiceImpl<CustomerMapper, Customer> implements ICustomerService {

}
