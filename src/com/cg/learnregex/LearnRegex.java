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
		return Pattern.matches("^[A-Za-z0-9]+(\\.[_A-Za-z0-9-])*@"
				+ "[A-Za-z0-9]+(\\.[A-Za-z0-9]+){0,1}(\\.[A-Za-z]{2,})$",email);

	}

	public static boolean mobileCheck(String mobile) {
		return Pattern.matches("[0-9]{2}\s{1}[1-9]{1}[0-9]{9}", mobile);

	}

	public static boolean passwordCheck(String password) {
		boolean passCheck = Pattern.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8,}$", password);
		passCheck = passCheck && Pattern.matches(".*[!@#$%]{1}.*", password);
		return passCheck;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name:");
		System.out.println(firstNameCheck(sc.nextLine()));
		System.out.println("Enter last name:");
		System.out.println(firstNameCheck(sc.nextLine()));
		System.out.println("Enter email:");
		System.out.println(emailCheck(sc.nextLine()));
		System.out.println("Enter mobile number");
		System.out.println(mobileCheck(sc.nextLine()));
		System.out.println("Enter password");
		System.out.println(passwordCheck(sc.nextLine()));

		sc.close();
	}

}
