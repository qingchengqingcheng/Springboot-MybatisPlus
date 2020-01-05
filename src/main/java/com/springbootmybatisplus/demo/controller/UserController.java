package com.springbootmybatisplus.demo.controller;

import java.util.HashMap;

import com.springbootmybatisplus.demo.common.web.RestResponse;
import com.springbootmybatisplus.demo.common.web.RestResponseHelper;
import com.springbootmybatisplus.demo.model.dto.UserDto;
import com.springbootmybatisplus.demo.model.po.User;
import com.springbootmybatisplus.demo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * ClassName: UserController
 * Function:  TODO
 * Date:      2020/1/5 14:26
 * version    V1.0
 */
@Api(tags = "用户信息管理")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "用户信息查询", notes = "用户信息查询")
    @GetMapping(value = "/getUserList", produces = "application/json;charset=UTF-8")
    public RestResponse <Map> getUserList( @RequestBody UserDto record ) {
        try {
            Map map = new HashMap();
            List <User> userList = userService.getUserList( record );
            map.put( "rows", userList );
            map.put( "total", record.getCount() );
            return RestResponseHelper.success( map );
        } catch (Exception e) {
            e.printStackTrace();
            return RestResponseHelper.error( "用户信息查询出错" );
        }
    }

    @ApiOperation(value = "新增用户信息", notes = "新增用户信息")
    @PostMapping(value = "/insertUser", produces = "application/json;charset=UTF-8")
    public RestResponse <Map> insertUser( @RequestBody User record ) {
        try {
            Integer i = userService.insertUser( record );
            return RestResponseHelper.success( i );
        } catch (Exception e) {
            e.printStackTrace();
            return RestResponseHelper.error( "新增用户信息出错" );
        }
    }

    @ApiOperation(value = "更新用户信息", notes = "更新用户信息")
    @PutMapping(value = "/updateUser", produces = "application/json;charset=UTF-8")
    public RestResponse <Map> updateUser( @RequestBody User record ) {
        try {
            Integer i = userService.updateUser( record );
            return RestResponseHelper.success( i );
        } catch (Exception e) {
            e.printStackTrace();
            return RestResponseHelper.error( "更新用户信息出错" );
        }
    }

    @ApiOperation(value = "删除用户信息", notes = "用户信息查询")
    @DeleteMapping(value = "/delUser/{id}", produces = "application/json;charset=UTF-8")
    public RestResponse delUser( @PathVariable("id") Long id ) {
        try {
            Integer i = userService.delUserById( id );
            return RestResponseHelper.success( i );
        } catch (Exception e) {
            e.printStackTrace();
            return RestResponseHelper.error( "删除用户信息出错" );
        }
    }

}
