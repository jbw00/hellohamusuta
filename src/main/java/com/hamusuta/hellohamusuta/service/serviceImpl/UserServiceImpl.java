package com.hamusuta.hellohamusuta.service.serviceImpl;

import com.hamusuta.hellohamusuta.dao.UserMapper;
import com.hamusuta.hellohamusuta.model.User;
import com.hamusuta.hellohamusuta.service.UserService;
import com.hamusuta.hellohamusuta.vo.requestVo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void insertNewUser(UserVo user) {
        User formatUser = formatUser(user);
        userMapper.insert(formatUser);
    }


    private User formatUser(UserVo user){
        User newUser = new User();
        newUser.setAccount(user.getAccount());
        newUser.setMail(user.getMail());
        newUser.setUserName(user.getUserName());
        newUser.setPassword(user.getPassword());
        newUser.setId(user.getId());
        return newUser;
    }
}
