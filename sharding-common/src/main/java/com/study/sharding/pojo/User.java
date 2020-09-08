package com.study.sharding.pojo;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@ToString
@Data
public class User implements Serializable {

    Long userId;
    String userName;

}
