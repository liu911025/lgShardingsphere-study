package com.study.sharding.controller;

import com.study.sharding.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

@RequestMapping("user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("initUser")
    public String initUser() {
        try {
            userService.processUsers();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "success";
    }

}
