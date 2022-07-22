package com.AddressBookSystem.util;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook{
	
	Scanner sc = new Scanner(System.in);
	
	private int select() {
		int selection;
		do {
	 	    System.out.println("Enter 1. To Add the contacts");
	    	System.out.println("Enter 2. To Print the contacts");
		    System.out.println("Enter 3. To Edit the contacts");
		    System.out.println("Enter 4. To Exit");
		    System.out.println("Enter your choice");
		    selection = sc.nextInt(); 
		}while(selection<1 || selection >4);
			
		return selection;
	}
	
	public static void main(String[] args) {

		AddressBook addBook = new AddressBook();   
		OperationOnAddressBook book = new OperationOnAddressBook();
		int choice;
		System.out.println("Welcome to Address Book");
		System.out.println();
        do {		
        	choice = addBook.select();
		    switch(choice) {
		
		         case 1 :book.add();
		            break;
		         case 2 :book.printlist(book.contacts);
		            break;
		         case 3 :book.edit();
		            break;
		        case 4: System.out.println("End");
		  }
	   }while(choice!=4);
	}		
}