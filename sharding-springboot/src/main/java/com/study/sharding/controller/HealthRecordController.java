package com.study.sharding.controller;

import com.study.sharding.service.HealthRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

@RestController
@RequestMapping("health/record")
public class HealthRecordController {

    @Autowired
    private HealthRecordService healthRecordService;

    @RequestMapping("add")
    public String add() {
        try {
            healthRecordService.processHealthRecords();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return "success";
    }

}
