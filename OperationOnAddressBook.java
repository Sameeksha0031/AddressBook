package com.AddressBookSystem.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class OperationOnAddressBook {
	
	Scanner sc = new Scanner(System.in);
    ArrayList<Contacts> contactlist = new ArrayList<>();
    Contacts contact = new Contacts();
	
	//To add the entries
    public void add() {
    	System.out.println("Enter First Name :");
    	String fName = sc.next();
    	contact.setFirstName(fName);
    	
    	System.out.println("Enter Last Name :");
    	String lName = sc.next();
    	contact.setLastName(lName);
    	
    	System.out.println("Enter Address :");
    	String address = sc.next();
    	contact.setAddress(address);
    	
    	System.out.println("Enter City :");
    	String city = sc.next();
    	contact.setCity(city);
    	
    	System.out.println("Enter State:");
    	String state = sc.next();
    	contact.setState(state);
    	
    	System.out.println("Enter Zip Code :");
    	String zip = sc.next();
    	contact.setZip(zip);
    	
    	System.out.println("Enter Phone :");
    	String phoneno = sc.next();
    	contact.setPhoneNo(phoneno);
    	
    	System.out.println("Enter Email Id :");
    	String email = sc.next();
    	contact.setEmail(email);
    	contactlist.add(contact);
    	
    }
    
    //To Remove the entries
    public void delete() {
    	System.out.println("Enter the First and Last name of the Person to be deleted");
    	String fname = sc.next();
    	String lname = sc.next();
    	String Fname = contact.getFirstName();
		String Lname = contact.getLastName();
		if(fname.equalsIgnoreCase(Fname) && lname.equalsIgnoreCase(Lname)) {
			 contactlist.remove(contact);
			 System.out.println("Contact is deleted");
		}else {
			System.out.println("Contact does not exist");
		} 
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
		 String Fname = contact.getFirstName();
		 String Lname = contact.getLastName();
		 if(fname.equalsIgnoreCase(Fname) && lname.equalsIgnoreCase(Lname)) {
			    System.out.println("Edit First Name :");
		    	String fName = sc.next();
		    	contact.setFirstName(fName);
		    	
		    	System.out.println("Edit Last Name :");
		    	String lName = sc.next();
		    	contact.setLastName(lName);
		    	
		    	System.out.println("Edit Address :");
		    	String address = sc.next();
		    	contact.setAddress(address);
		    	
		    	System.out.println("Edit City :");
		    	String city = sc.next();
		    	contact.setCity(city);
		    	
		    	System.out.println("Edit State:");
		    	String state = sc.next();
		    	contact.setState(state);
		    	
		    	System.out.println("Edit Zip Code :");
		    	String zip = sc.next();
		    	contact.setZip(zip);
		    	
		    	System.out.println("Edit Phone :");
		    	String phoneno = sc.next();
		    	contact.setPhoneNo(phoneno);
		    	
		    	System.out.println("Edit Email Id :");
		    	String email = sc.next();
		    	contact.setEmail(email);
		 }else {
			 
			 System.out.println("Person does not exist");
		 }
	 }
 }