package com.hamusuta.hellohamusuta.controller;

import com.hamusuta.hellohamusuta.service.UserService;
import com.hamusuta.hellohamusuta.vo.requestVo.UserVo;
import com.hamusuta.hellohamusuta.vo.responseVo.ResponseResult;
import com.hamusuta.hellohamusuta.vo.responseVo.ResultGenerator;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value="新建用户", notes="创建一个新的用户")
    @PostMapping(value = "/newuser")
    public ResponseResult insertUser(@RequestBody UserVo user){
        userService.insertNewUser(user);
        return ResultGenerator.generatorSuccess();
    }

}
