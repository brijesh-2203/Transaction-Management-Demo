package com.user.userservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.user.userservice.entity.Address;
import com.user.userservice.entity.User;
import com.user.userservice.service.UserService;

@RestController
@RequestMapping("/user")
public class Controller {

	@Autowired
	UserService userservice;
	
	
	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping("/{userid}")
	public User getUSer(@PathVariable("userid") Long userid)
	{
		 User user = userservice.getUser(userid);
		 List<Address> list = this.restTemplate.getForObject("http://addressService/address/user/"+user.getUserid(), List.class);
		 user.setAddress(list);
		 return user;
	}
	
	
}
