package com.springbootmybatisplus.demo.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.springbootmybatisplus.demo.mapper.UserMapper;
import com.springbootmybatisplus.demo.model.dto.UserDto;
import com.springbootmybatisplus.demo.model.po.User;
import com.springbootmybatisplus.demo.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: UserServiceImpl
 * Function:  TODO
 * Date:      2020/1/5 14:25
 * version    V1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List <User> getUserList( UserDto record ) {
        List <User> list = new ArrayList <User>();
        if (record.getPage() != null && record.getLimit() != null) {
            PageHelper.startPage( record.getPage(), record.getLimit() );
            list = userMapper.selectList( null );
            PageInfo <User> pageInfo = new PageInfo <User>( list );
            record.setCount( pageInfo.getTotal() );
        } else {
            list = userMapper.selectList( null );
            record.setCount( Long.parseLong( String.valueOf( list.size() ) ) );
        }
        return list;
    }

    @Override
    @Transactional
    public Integer delUserById( Long id ) {
        return userMapper.deleteById( id );
    }

    @Override
    @Transactional
    public Integer insertUser( User user ) {
        return userMapper.insert( user );
    }

    @Override
    @Transactional
    public Integer updateUser( User user ) {
        return userMapper.updateById( user );
    }
}
