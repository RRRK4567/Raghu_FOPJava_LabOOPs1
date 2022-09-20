package com.gl.email.service;
import java.util.Random;

import com.gl.email.model.Employee;

public class CredentialService {

	public char[] generatePassword() {
		String caps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowercase = "abcdefghijklmnopqrstuvwxyz";
		String number = "0123456789";
		String special = "!@#$%^&*()_+";
		String bigstring =caps+lowercase+number+special;
		Random random = new Random() ;
		char[] password = new char[8];
		for(int i=0;i<8;i++)
		{
			password[i]=bigstring.charAt(random.nextInt(bigstring.length()));
		}
		
	
		return password;
	}
		
	public String generateEmailAddress (String Firstname, String Lastname , String department){
		return Firstname+Lastname+ "@" +department+ "_greatlearning.com";
		
	}
		
	public void showCredentails(Employee emp , String Email ,char[] password) {
		System.out.println("Dear " + emp.getFirstname()+", your generated credentials are as follows:- ");
		System.out.println("Email :"+ Email);
		System.out.println("password :"+ password);
		
	}

}

