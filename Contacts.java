package com.AddressBookSystem.util;

public class Contacts {

	private String firstName, lastName, address, city, state, zip, phoneNo, email ;
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmail() {
		return email;
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
