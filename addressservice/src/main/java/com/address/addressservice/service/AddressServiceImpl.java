package com.address.addressservice.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.address.addressservice.entity.Address;

@Service
public class AddressServiceImpl implements AddressService{
	
	List<Address> addlist = List.of(
			new Address(1l,"Ahmedabad","Gujarat",1l),
			new Address(2l,"Ahmedabad","Gujarat",3l),
			new Address(3l,"Udaipur","Rajasthan",2l)
			);

	@Override
	public List<Address> getAddress(Long uid) {
		// TODO Auto-generated method stub
		return this.addlist.stream().filter(address -> address.getUserid().equals(uid)).collect(Collectors.toList());	}

	
}
