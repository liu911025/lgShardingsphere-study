package com.study.sharding.dao;

import com.study.sharding.pojo.HealthTask;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HealthTaskRepository extends BaseRepository<HealthTask, Long> {

}
