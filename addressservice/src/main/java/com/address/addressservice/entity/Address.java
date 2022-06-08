package com.address.addressservice.entity;

public class Address {
	
	private Long addid;
	private String city;
	private String state;
	
	private Long userid;

	public Long getAddid() {
		return addid;
	}

	public void setAddid(Long addid) {
		this.addid = addid;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Long getUserid() {
		return userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	public Address(Long addid, String city, String state, Long userid) {
		super();
		this.addid = addid;
		this.city = city;
		this.state = state;
		this.userid = userid;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
}
