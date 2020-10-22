package com.bk.service.Impl;

import com.bk.mapper.UserMapper;
import com.bk.entity.User;
import com.bk.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author songbin
 * @date 2020/10/9
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User findUserByUsernameAndPassword(String username, String password) {
        return userMapper.selectUserByUsernameAndPassword(username,password);
    }

    @Override
    public User findUserByUsername(String userbnme) {
        return userMapper.findUserByUsername(userbnme);
    }
}
