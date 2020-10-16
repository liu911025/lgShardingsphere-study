package com.study.sharding.controller;

import com.study.sharding.pojo.User;
import com.study.sharding.service.EncryptUserService;
import com.study.sharding.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@RequestMapping("user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private EncryptUserService encryptUserService;

    @RequestMapping("addUser")
    public String initUser() {
        try {
            userService.processUsers();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "success";
    }

    @RequestMapping("addEncryptUser")
    public String addEncryptUser() {
        try {
            encryptUserService.processEncryptUsers();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "success";
    }

    @RequestMapping("getUser")
    public List<User> getUser() {
        try {
            List<User> users = userService.getUsers();
            return users;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
