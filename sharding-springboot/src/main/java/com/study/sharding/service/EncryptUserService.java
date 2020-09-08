package com.study.sharding.service;


import com.study.sharding.pojo.EncryptUser;

import java.sql.SQLException;
import java.util.List;

public interface EncryptUserService {
	
	public void processEncryptUsers() throws SQLException;
	
	public List<EncryptUser> getEncryptUsers() throws SQLException;

}
