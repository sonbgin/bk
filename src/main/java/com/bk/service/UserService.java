package com.bk.service;

import com.bk.entity.User;

/**
 * @author songbin
 * @date 2020/10/9
 */
public interface UserService {

    User findUserByUsernameAndPassword(String username, String password);

    User findUserByUsername(String userbnme);
}
