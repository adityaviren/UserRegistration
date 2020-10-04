package com.cg.learnregex;

import java.util.*;
import java.util.regex.Pattern;

public class LearnRegex {
	
	public static boolean firstNameCheck(String f_name) {
		return Pattern.matches("[A-Z]{1}[a-z]{2,}", f_name);
		
	}
	public static boolean lastNameCheck(String l_name) {
		return Pattern.matches("[A-Z]{1}[a-z]{2,}", l_name);
		
	}
	public static boolean emailCheck(String email) {
		return Pattern.matches("[a-z]{1,}(\\.{1}[a-z]{1,})*@{1}[a-z]{1,}(.co){1}(\\.{1}[a-z]{1,})*", email);
		
	}
	public static boolean mobileCheck(String mobile) {
		return Pattern.matches("[0-9]{2}\s{1}[1-9]{1}[0-9]{9}", mobile);
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first name:");
		System.out.println(firstNameCheck(sc.nextLine()));
		System.out.println("Enter last name:");
		System.out.println(firstNameCheck(sc.nextLine()));
		System.out.println("Enter email:");
		System.out.println(emailCheck(sc.nextLine()));
		System.out.println("Enter mobile number");
		System.out.println(mobileCheck(sc.nextLine()));
		sc.close();
	}

}
