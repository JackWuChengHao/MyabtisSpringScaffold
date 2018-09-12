package com.oop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.oop.services.insertUser;

@Component
@Transactional
public class userHandler {
	
	@Autowired
	private insertUser iu;
	
	public void testOk() throws Exception {
		
		iu.testThreeUser();
		
		iu.testAddUser();

	}
	

}
