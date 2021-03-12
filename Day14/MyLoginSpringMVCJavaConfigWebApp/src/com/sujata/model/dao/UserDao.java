package com.sujata.model.dao;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

	static HashMap<String, String> users=new HashMap();
	static {
		users.put("Sujata", "Batra");
		users.put("user1","user1");
		users.put("user2","user2");
		
	}
	
	public String getPassword(String username) {
		return users.get(username);
	}
}
