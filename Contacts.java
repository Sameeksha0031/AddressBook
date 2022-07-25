package com.AddressBookSystem.util;

public class Contacts {

	private String firstName, lastName, address, city, state, zip, phoneNo, email ;
	
	public String getFirstName() {
		return this.firstName;
	}

	public Contacts(String firstName, String lastName, String address, String city, String state, String zip,
			String phoneNo, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNo = phoneNo;
		this.email = email;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return this.zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPhoneNo() {
		return this.phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public String toString() {
		return "Contacts \n"+
	           "-----------------------------\n"+
	           "First Name :\t" + firstName +
	           "\nLast Name  :\t" + lastName +
	           "\nAddress    :\t" + address +
	           "\nCity       :\t" + city +
	           "\nState      :\t" + state +
	           "\nZip        :\t" + zip +
	           "\nPhone No   :\t" + phoneNo+
	           "\nEmail Id   :\t" + email;
		
	}

}
