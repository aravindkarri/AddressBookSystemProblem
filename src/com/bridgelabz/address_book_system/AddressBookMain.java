package com.bridgelabz.address_book_system;

import java.util.Scanner;

public class AddressBookMain {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Address book program");
		
		System.out.println("How many contacts do you want to add : ");
		Scanner scanner = new Scanner(System.in);
		int numOfContacts = scanner.nextInt();
		addContacts(scanner, numOfContacts);
	}

	private static void addContacts(Scanner scanner, int numOfContacts) {
		Contacts contact [] = new Contacts[numOfContacts];
		String firstName,lastName,address,city,email,phoneNumber;
		int zip;
		for(int index=0;index<contact.length;index++)
		{
			System.out.println("Enter First name: ");
			firstName = scanner.next();
			System.out.println("Enter last name: ");
			lastName = scanner.next();
			System.out.println("Enter address : ");
			address = scanner.next();
			System.out.println("Enter city name: ");
			city = scanner.next();
			System.out.println("Enter email: ");
			email = scanner.next();
			System.out.println("Enter zip : ");
			zip = scanner.nextInt();
			System.out.println("Enter phone number: ");
			phoneNumber = scanner.next();
			contact[index] = new Contacts(firstName,lastName,address,city,zip,phoneNumber,email);
		}
		//display contacts
		for(int index =0;index<contact.length;index++)
		{
			System.out.println(contact[index]);
		}
	}
}
