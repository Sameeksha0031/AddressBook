package com.AddressBookSystem.util;

import java.util.ArrayList;
import java.util.Iterator;
//import java.util.List;
import java.util.Scanner;

public class AddressBook{

	static Scanner sc = new Scanner(System.in);
	static ArrayList<Contacts> contactlist = new ArrayList<>();
	
	public static void main(String[] args) {
    
		AddressBook book = new AddressBook();
		Contacts con = new Contacts(); 
		
		System.out.println("Welcome to Address Book");
		System.out.println();
		con.setFirstName("Sameeksha");
		
		con.setLastName("Vinodiya");
		
		con.setAddress("hno 1209 gorakhpur");
		
		con.setCity("Jabalpur");
		
		con.setState("MP");
		
		con.setZip("482001");
		
		con.setPhoneNo("9423556900");
		
		con.setEmail("Sameeksha@gmail.com");
		contactlist.add(con);
		
	    book.print(contactlist);
	    System.out.println(" ");
	}
	
	public void print( ArrayList<Contacts> contactlist) {
		
		for(Contacts contact : contactlist) {
			
			System.out.println(contact.toString());
	    }	
		
     }
}
