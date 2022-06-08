package com.address.addressservice.service;

import java.util.List;

import com.address.addressservice.entity.Address;

public interface AddressService {
	
	public List<Address> getAddress(Long uid);

}
