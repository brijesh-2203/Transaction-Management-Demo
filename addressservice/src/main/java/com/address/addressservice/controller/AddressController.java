package com.address.addressservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.address.addressservice.entity.Address;
import com.address.addressservice.service.AddressService;

@RestController
@RequestMapping("/address")
public class AddressController {
	
	
	@Autowired
	AddressService addressservice;
	@RequestMapping("/user/{userid}")
	public List<Address> getContacts(@PathVariable("userid") Long userid)
	{
		return this.addressservice.getAddress(userid);
	}
	
	
}
