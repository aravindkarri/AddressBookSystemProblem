package com.bridgelabz.address_book_system;

public class AddressBookMain {

	public static void main(String[] args) {

		System.out.println("Welcome to Address Book Program");
	}
	class Contact {
		//instance variables
		private String firstName;
		private String lastName;
		private String address;
		private String city;
		private String email;
		private int zip;
		private int phoneNumber;

		//constructor
		public Contact(String firstName, String lastName, String address,String city,int zip,int phoneNumber,String email)
		{
			this.firstName = firstName;
			this.lastName = lastName;
			this.address = address;
			this.zip = zip;
			this.phoneNumber = phoneNumber;
			this.email= email;
			this.city = city;
		}

		public void setFirstName(String firstName) 
		{
			this.firstName = firstName;
		}
		public void setLirstName(String lastName)
		{
			this.lastName = lastName;
		}
		public void setAddress(String address)
		{
			this.address = address;
		}
		public void setZip(int zip)
		{
			this.zip = zip;
		}
		public void setPhoneNumber(int phoneNumber)
		{
			this.phoneNumber = phoneNumber;
		}
		public void setEmail(String email)
		{
			this.email = email;
		}
		public String getfirstName()
		{
			return firstName;
		}
		public String getLastName(String lastName)
		{
			return lastName;
		}
		public String getAddress()
		{
			return address;
		}
		public String getCity()
		{
			return city;
		}
		public void setCity(String city)
		{
			this.city = city;
		}
		public int getZip() 
		{
			return zip;
		}
		public int getPhoneNumber()
		{
			return phoneNumber;
		}
		public String getEmail()
		{
			return email;
		}

		@Override
		public String toString() {
			return "Contact[FirstName =" +firstName+ "LastName =" +lastName+ "Address ="
					+address+ "city= "+city+ "zip = "+zip+ "phoneNumber= "+phoneNumber+ "email = "+email+"]";
		}

	}
}
