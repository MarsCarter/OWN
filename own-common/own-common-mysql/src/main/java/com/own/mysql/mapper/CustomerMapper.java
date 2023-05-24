package com.own.mysql.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.own.mysql.model.Customer;
import org.apache.ibatis.annotations.Mapper;

/**
 *  Mapper 接口
 *
 * @author Mars
 * @since 2023-05-24
 */
@Mapper
public interface CustomerMapper extends BaseMapper<Customer> {

}
