package com.cg.learnregex;

import java.util.regex.Pattern;

public class LearnRegex {

	public static void main(String[] args) {
			System.out.println(Pattern.matches("[A-Z]{1}[a-z]{2,}", "Aditya"));
	}

}
