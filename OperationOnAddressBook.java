package com.AddressBookSystem.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class OperationOnAddressBook {

	Scanner sc = new Scanner(System.in);
	ArrayList<Contacts> contactlist = new ArrayList<>();

	int flag = 0;
	int duplicate = 0;

	// To add the entries
	public void add() {

		if (flag == 0) {
			entries();
			flag++;
		} else {
			System.out.println("Checking for duplicates");
			System.out.println("Enter First Name :");
			String fName = sc.next();
			try {
				for (Contacts list : this.contactlist) {
					if (fName.equals(list.getFirstName())) {
						System.out.println("it is duplicate Entry");
						break;
					} else {
						entries();
					}
				}
			} catch (Exception e) {

				// entries();
			}
		}
	}

	public void entries() {
		System.out.println("Enter First Name :");
		String fName = sc.next();

		System.out.println("Enter Last Name :");
		String lName = sc.next();

		System.out.println("Enter Address :");
		String address = sc.next();

		System.out.println("Enter City :");
		String city = sc.next();

		System.out.println("Enter State:");
		String state = sc.next();

		System.out.println("Enter Zip Code :");
		String zip = sc.next();

		System.out.println("Enter Phone :");
		String phoneno = sc.next();

		System.out.println("Enter Email Id :");
		String email = sc.next();

		Contacts contact = new Contacts(fName, lName, address, city, state, zip, phoneno, email);

		this.contactlist.add(contact);
	}

	/*
	 * public void checkDuplicates() {
	 * 
	 * System.out.println("Enter the first name"); String fname = sc.next(); for
	 * (Contacts list : this.contactlist) { if (fname.equals(list.getFirstName())) {
	 * // System.out.println("it is duplicate Entry"); } else { add(); } } }
	 */

	// To find the person
	public int indexOfPerson() {

		System.out.println();
		System.out.println("Enter the Person Full Name");
		String fname = sc.next();
		String lname = sc.next();
		int index = 0;
		for (Contacts contact : this.contactlist) {

			if (contact.getFirstName().equalsIgnoreCase(fname) && contact.getLastName().equalsIgnoreCase(lname)) {
				return index;
			}
			index++;
		}

		return -1;
	}

	// To Remove the entries
	public void delete() {

		int index = this.indexOfPerson();
		if (index != -1) {
			Contacts contact = this.contactlist.remove(index);
			System.out.println("Person details deleted");
		} else {
			System.out.println("Person does not exist");
		}
	}

	// To Print the entries
	public void printlist(ArrayList<Contacts> contactlist) {

		for (Contacts contact : this.contactlist) {

			System.out.println(contact.toString());
		}
	}

	// To Edit Entries
	public void edit() {
		System.out.println();
		int index = this.indexOfPerson();
		if (index != -1) {
			System.out.print("Enter the field name want to update\n 1. FirstName \n 2. LastName "
					+ "\n 3. Address \n 4. City \n 5. State \n 6. Zip \n 7. PhoneNumber \n 8. Email");
			int option = sc.nextInt();
			switch (option) {

			case 1:
				System.out.println("Update the First Name");
				this.contactlist.get(index).setFirstName(sc.next());
				break;

			case 2:
				System.out.println("Update the Last Name");
				this.contactlist.get(index).setLastName(sc.next());
				break;

			case 3:
				System.out.println("Update the Address");
				this.contactlist.get(index).setAddress(sc.next());
				break;

			case 4:
				System.out.println("Update the City Name");
				this.contactlist.get(index).setCity(sc.next());
				break;

			case 5:
				System.out.println("Update the State Name");
				this.contactlist.get(index).setState(sc.next());
				break;

			case 6:
				System.out.println("Update the Zip Code");
				this.contactlist.get(index).setZip(sc.next());
				break;

			case 7:
				System.out.println("Update Phone Number ");
				this.contactlist.get(index).setPhoneNo(sc.next());
				break;

			case 8:
				System.out.println("Update the Email");
				this.contactlist.get(index).setEmail(sc.next());
				break;

			default:
				System.out.println("Please enter correct Field");

			}

		} else {

			System.out.println("Person does not exist");
		}
	}

	public void search() {
		System.out.println("Enter the city or state to search the person");
		String varcity = sc.next();
		String varstate = sc.next();
		System.out.println();
		for (Contacts contact : this.contactlist) {

			if (contact.getCity().equalsIgnoreCase(varcity) && contact.getState().equalsIgnoreCase(varstate)) {
				System.out.println(contact.getFirstName() + " " + contact.getLastName());
			}
		}
	}

}