package com.AddressBookSystem.util;

import java.util.ArrayList;
import java.util.Iterator;
//import java.util.List;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Iterator;
//import java.util.List;
import java.util.Scanner;

public class AddressBook{

	//static Scanner sc = new Scanner(System.in);
	//static ArrayList<Contacts> contactlist = new ArrayList<>();
	
	public static void main(String[] args) {
    
		//AddressBook book = new AddressBook();
		//ArrayList<Contacts> con = new  ArrayList<>(); 
		OperationOnAddressBook book = new OperationOnAddressBook();
		System.out.println("Welcome to Address Book");
		System.out.println();
		book.add();
		book.printlist(book.contacts);
	}
		
}