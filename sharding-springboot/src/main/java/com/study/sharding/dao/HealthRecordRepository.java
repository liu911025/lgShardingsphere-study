package com.study.sharding.dao;

import com.study.sharding.pojo.HealthRecord;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HealthRecordRepository extends BaseRepository<HealthRecord, Long> {

}
