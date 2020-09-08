package com.study.sharding.dao;

import com.study.sharding.pojo.HealthLevel;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HealthLevelRepository extends BaseRepository<HealthLevel, Long> {

}
