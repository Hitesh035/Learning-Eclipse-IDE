package com.String_manipulation;

import java.util.regex.Pattern;

public class Possible_palindromes_biggest_to_smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "adfrg";
		System.out.println(s.length());
		System.out.println(s);
		
		String s1 = s.replace('f', '\0');
		System.out.println(s1.length());
		System.out.println(s1);
		
		Pattern p1 = Pattern.compile(s1);
	}
	
	public static void possiblePalindromesBiggestToSmallest(String s) {
		if(Palindrome.canBeASameLengthPalindrome(s))
			Palindrome.getSameLengthPalindromeAsString(s);
		
		
	}
	
	

}
