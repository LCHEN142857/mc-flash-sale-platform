/**
 * Copyright (c) 2023 LCHEN
 * All rights reserved
 * Created on 2023-05-04
 */
package org.mc.fsp.service;

import org.mc.fsp.entity.User;
import org.mc.fsp.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * description
 *
 * @author LCHEN
 * @date 2023-05-04
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public List<User> getAllUsers(){
        return userMapper.getAllUsers();
    }

    public int deleteUser(String uid){
        return userMapper.deleteUser(uid);
    }
}

