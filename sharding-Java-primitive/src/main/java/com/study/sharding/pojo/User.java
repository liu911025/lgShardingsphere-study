package com.study.sharding.pojo;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@ToString
@Data
public class User implements Serializable {

    private int id;

    private String name;

    private int sex;

}
