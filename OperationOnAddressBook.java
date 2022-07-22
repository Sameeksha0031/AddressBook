package com.AddressBookSystem.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class OperationOnAddressBook {
	
	Scanner sc = new Scanner(System.in);
    ArrayList<Contacts> contacts = new ArrayList<>();
    Contacts con = new Contacts();
	
	//To add the entries
    public void add() {
    	System.out.println("Enter First Name :");
    	String fName = sc.next();
    	con.setFirstName(fName);
    	
    	System.out.println("Enter Last Name :");
    	String lName = sc.next();
    	con.setLastName(lName);
    	
    	System.out.println("Enter Address :");
    	String address = sc.next();
    	con.setAddress(address);
    	
    	System.out.println("Enter City :");
    	String city = sc.next();
    	con.setCity(city);
    	
    	System.out.println("Enter State:");
    	String state = sc.next();
    	con.setState(state);
    	
    	System.out.println("Enter Zip Code :");
    	String zip = sc.next();
    	con.setZip(zip);
    	
    	System.out.println("Enter Phone :");
    	String phoneno = sc.next();
    	con.setPhoneNo(phoneno);
    	
    	System.out.println("Enter Email Id :");
    	String email = sc.next();
    	con.setEmail(email);
    	contacts.add(con);
    	
    }
	
	//To Print the entries
    public void printlist( ArrayList<Contacts> contactlist) {
		
		for(Contacts contact : contactlist) {
			
			System.out.println(contact.toString());
	    }	
	}
    
    //To Edit Entries
    public void edit() {
    	 System.out.println();
		 System.out.println("Enter the First and Last name of a Person");
		 String fname = sc.next();
		 String lname = sc.next();
		 String Fname = con.getFirstName();
		 String Lname = con.getLastName();
		 if(fname.equalsIgnoreCase(Fname) && lname.equalsIgnoreCase(Lname)) {
			    System.out.println("Edit First Name :");
		    	String fName = sc.next();
		    	con.setFirstName(fName);
		    	
		    	System.out.println("Edit Last Name :");
		    	String lName = sc.next();
		    	con.setLastName(lName);
		    	
		    	System.out.println("Edit Address :");
		    	String address = sc.next();
		    	con.setAddress(address);
		    	
		    	System.out.println("Edit City :");
		    	String city = sc.next();
		    	con.setCity(city);
		    	
		    	System.out.println("Edit State:");
		    	String state = sc.next();
		    	con.setState(state);
		    	
		    	System.out.println("Edit Zip Code :");
		    	String zip = sc.next();
		    	con.setZip(zip);
		    	
		    	System.out.println("Edit Phone :");
		    	String phoneno = sc.next();
		    	con.setPhoneNo(phoneno);
		    	
		    	System.out.println("Edit Email Id :");
		    	String email = sc.next();
		    	con.setEmail(email);
		 }else {
			 
			 System.out.println("Person does not exist");
		 }
	 }
 }