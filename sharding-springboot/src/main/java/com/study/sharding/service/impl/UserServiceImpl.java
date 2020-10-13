package com.study.sharding.service.impl;

import com.study.sharding.dao.UserRepository;
import com.study.sharding.pojo.User;
import com.study.sharding.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void processUsers() throws SQLException {
		insertUsers();
	}

	private List<Long> insertUsers() throws SQLException {
		List<Long> result = new ArrayList<>(10);
		for (Long i = 1L; i <= 1; i++) {
			User user = new User();
			user.setUserId(i);
			user.setUserName("user_" + i);
			userRepository.addEntity(user);
			result.add(user.getUserId());
			log.error("Insert User:" + user.getUserId());
	        
		}
		return result;
	}

	@Override
	public List<User> getUsers() throws SQLException {
		return userRepository.findEntities();
	}
}
