package it.tecnosphera.preventivi;

import java.util.Date;

public class Customer {
	private String name;
	private String surname;
	private Date dateOfBirth;
	
	public Customer() {}
	
	public Customer(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}
	
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
}
