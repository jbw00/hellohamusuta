package com.hamusuta.hellohamusuta.controller;

import com.hamusuta.hellohamusuta.service.UserService;
import com.hamusuta.hellohamusuta.vo.requestVo.UserVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value="新建用户", notes="创建一个新的用户")
    @PostMapping(value = "/newuser")
    public void insertUser(@RequestBody UserVo user){
        userService.insertNewUser(user);

    }

}
