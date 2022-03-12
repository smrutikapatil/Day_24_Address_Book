package com.addressbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookMainClass {

	private static Scanner sc = new Scanner(System.in);
	private AddressBook addressbook = new AddressBook();
	private List<Contact> contacts = new ArrayList<>();

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program\n");

		AddressBookMainClass addressbook = new AddressBookMainClass();
		addressbook.addContacts();

	}

	public void addContacts() {

		System.out.println("Enter the First Name");
		String firstName = sc.next();

		System.out.println("Enter the Last Name");
		String lastName = sc.next();

		System.out.println("Enter the Address Name");
		String address = sc.next();

		System.out.println("Enter the City Name");
		String city = sc.next();

		System.out.println("Enter the State Name");
		String state = sc.next();

		System.out.println("Enter the Zip Name");
		int zip = sc.nextInt();

		System.out.println("Enter the PhoneNumber");
		long phoneNumber = sc.nextInt();

		System.out.println("Enter the email");
		String email = sc.next();
		Contact contact = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);
		contacts.add(contact);
		addressbook.setContacts(contacts);
	}
}
