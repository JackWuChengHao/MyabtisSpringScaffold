package com.oop.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oop.eksp.user.data.UserMapper;
import com.oop.eksp.user.model.User;

@Service
@Transactional
public class insertUser {


   @Autowired
	private UserMapper usermap;
	
	public void testAddUser() {
		User user = new User();
		user.setAge(2);
		user.setUsername("xiaohuang");
		usermap.insert(user);
	}

	public void testTwoUser() {
		User user = new User();
		user.setAge(2);
		user.setUsername("xiaoli");
		usermap.insert(user);
	}
	
	public void testThreeUser() {
		User user = new User();
		user.setAge(2);
		user.setUsername("xiaobai");
		usermap.insert(user);
	}
	
}
