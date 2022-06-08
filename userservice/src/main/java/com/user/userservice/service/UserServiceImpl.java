package com.user.userservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.userservice.entity.User;

@Service
public class UserServiceImpl implements UserService{
	
	List<User> userlist = List.of(
			new User(1l,"Yash","9898787845"),
			new User(2l,"Nikhil","7878989865"),
			new User(3l,"Jaydeep","6369856974")
			);

	@Override
	public User getUser(Long uid) {
		return this.userlist.stream().filter(user -> user.getUserid().equals(uid)).findAny().orElse(null);
	}

}
