/**
 * Copyright (c) 2023 LCHEN
 * All rights reserved
 * Created on 2023-05-04
 */
package org.mc.fsp.controller;

import org.mc.fsp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description
 *
 * @author LCHEN
 * @date 2023-05-04
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/all")
    public String getAllUsers(){
        return userService.getAllUsers().toString();
    }

    @RequestMapping("/del/{uid}")
    public int deleteUser(@PathVariable("uid") String uid){
        return userService.deleteUser(uid);
    }
}
