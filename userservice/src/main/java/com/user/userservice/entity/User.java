package com.user.userservice.entity;

import java.util.List;

public class User {

	private Long userid;
	private String name;
	private String phone;
	
	List<Address> address;

	public Long getUserid() {
		return userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public User(Long userid, String name, String phone, List<Address> address) {
		super();
		this.userid = userid;
		this.name = name;
		this.phone = phone;
		this.address = address;
	}

	public User(Long userid, String name, String phone) {
		super();
		this.userid = userid;
		this.name = name;
		this.phone = phone;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
