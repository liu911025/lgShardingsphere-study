package com.study.sharding.dao;

import com.study.sharding.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserRepository extends BaseRepository<User, Long> {

}
