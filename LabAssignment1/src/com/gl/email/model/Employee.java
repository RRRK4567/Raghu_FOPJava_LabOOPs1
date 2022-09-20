package com.gl.email.model;

import java.util.Scanner;

public class Employee {
	
	Scanner sc = new Scanner(System.in);
	

	 String firstname ;
	 String Lastname;


	
	public Employee (String firstname , String Lastname){
		this.firstname = firstname;
		this.Lastname = Lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String geLastname() {
		return Lastname;
	}

	public void setLastname(String Lastname) {
		this.Lastname = Lastname;
	}
	
	
	
	
	 
	}


