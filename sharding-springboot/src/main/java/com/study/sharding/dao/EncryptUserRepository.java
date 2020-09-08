package com.study.sharding.dao;

import com.study.sharding.pojo.EncryptUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EncryptUserRepository extends BaseRepository<EncryptUser, Long> {

}
