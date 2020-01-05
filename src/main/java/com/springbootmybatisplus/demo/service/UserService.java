package com.springbootmybatisplus.demo.service;

import com.springbootmybatisplus.demo.model.dto.UserDto;
import com.springbootmybatisplus.demo.model.po.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * ClassName: UserService
 * Function:  TODO
 * Date:      2020/1/5 14:24
 * version    V1.0
 */
public interface UserService {

    List <User> getUserList( UserDto record );

    Integer delUserById( Long id );

    Integer insertUser( User user );

    Integer updateUser( User user );

}
