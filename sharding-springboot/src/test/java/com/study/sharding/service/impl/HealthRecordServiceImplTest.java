package com.study.sharding.service.impl;

import com.study.sharding.service.HealthRecordService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.SQLException;


@RunWith(SpringRunner.class)
@SpringBootTest
public class HealthRecordServiceImplTest {

    @Autowired
    private HealthRecordService healthRecordService;

    @Test
    public void healthRecordTest() throws SQLException {
        healthRecordService.processHealthRecords();
    }
}