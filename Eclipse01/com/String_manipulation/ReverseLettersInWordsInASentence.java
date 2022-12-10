package com.String_manipulation;

public class ReverseLettersInWordsInASentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(reverse("Danger"));
		System.out.println(getReversedWordedSentenceUsingSplit("Hello sir"));
	}
	
	public static String reverse(String a) {
		String s = "";
		
		for(int i = a.length()-1; i>=0 ; i--) {
			
			if (i>=0) s = s+a.charAt(i);
		}
		return s;
	}
	
	public static String getReversedWordedSentenceUsingSplit(String s) {
		
		String a = "";
		
		String[] s1 = s.split(" ");
		
		for(int i =0 ; i<=s1.length-1; i++) {
			a= a+reverse(s1[i]);
			if(i<s1.length-1) a= a+" ";
			
		}
		
		return a;
	}

}
