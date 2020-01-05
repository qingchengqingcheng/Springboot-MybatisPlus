package com.springbootmybatisplus.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.springbootmybatisplus.demo.model.po.User;
import org.springframework.stereotype.Component;

/**
 * ClassName: UserMapper
 * Function:  TODO
 * Date:      2020/1/5 14:08
 * version    V1.0
 */
@Component
public interface UserMapper extends BaseMapper <User> {
}
