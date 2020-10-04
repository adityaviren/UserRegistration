package com.cg.learnregex;

import java.util.*;
import java.util.regex.Pattern;

public class LearnRegex {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(Pattern.matches("[A-Z]{1}[a-z]{2,}", sc.nextLine()));
		sc.close();
	}

}
