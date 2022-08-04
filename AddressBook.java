package com.AddressBookSystem.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class AddressBook /* extends Contacts */ {

	Scanner sc = new Scanner(System.in);
	static HashMap<String, AddressBook> map = new HashMap<>();
	// AddressBook addBook = new AddressBook();
	OperationOnAddressBook book = new OperationOnAddressBook();

	private int select() {
		int selection;
		do {
			System.out.println();
			System.out.println("Enter 1. To Add the contacts");
			System.out.println("Enter 2. To Print all contacts");
			System.out.println("Enter 3. To Edit the contacts");
			System.out.println("Enter 4. To Delete the contacts");
			System.out.println("Enter 5. To Search the contacts");
			System.out.println("Enter 6. To Exit");
			System.out.println("Enter your choice");
			selection = sc.nextInt();
		} while (selection < 1 || selection > 6);

		return selection;
	}

	int choice;

	private void showAddressBook() {
		do {
			choice = select();
			switch (choice) {

			case 1:
				book.add();
				break;
			case 2:
				book.printlist(book.contactlist);
				break;
			case 3:
				book.edit();
				break;
			case 4:
				book.delete();
				break;
			case 5:
				book.search();
				break;

			case 6:
				System.out.println("End");
			}
		} while (choice != 6);
	}

	public static void main(String[] args) {

		AddressBook addBookOne = new AddressBook();
		AddressBook addBookTwo = new AddressBook();
		AddressBook addBookThree = new AddressBook();
		map.put("Sameeksha", addBookOne);
		map.put("Ruchi", addBookTwo);
		map.put("Krishna", addBookThree);

		System.out.println("---------------Address Book----------------");
		System.out.println();
		while (true) {
			System.out.println("Enter the 1,2,3 for Address Book and 4 for exist ");
			Scanner sc = new Scanner(System.in);
			int option = sc.nextInt();
			String key = null;
			switch (option) {
			case 1:
				key = "Sameeksha";
				System.out.println("Welcome " + key);
				addBookOne.showAddressBook();

				break;
			case 2:
				key = "Ruchi";
				System.out.println("Welcome " + key);
				addBookTwo.showAddressBook();
				break;
			case 3:
				key = "Krishna";
				System.out.println("Welcome " + key);
				addBookThree.showAddressBook();
				break;
			}
			if (option == 4) {
				break;
			}
		}

	}
}