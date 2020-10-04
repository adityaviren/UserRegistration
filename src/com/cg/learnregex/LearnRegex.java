package com.cg.learnregex;

import java.util.*;
import java.util.regex.Pattern;

public class LearnRegex {
	
	public static boolean firstNameCheck(String f_name) {
		return Pattern.matches("[A-Z]{1}[a-z]{2,}", f_name);
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first name:");
		String f_name=sc.nextLine();
		System.out.println(firstNameCheck(f_name));
		sc.close();
	}

}
