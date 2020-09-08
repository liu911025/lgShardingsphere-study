package com.study.sharding.service;


import com.study.sharding.pojo.User;

import java.sql.SQLException;
import java.util.List;

public interface UserService {
	
	void processUsers() throws SQLException;
	
	List<User> getUsers() throws SQLException;

}
