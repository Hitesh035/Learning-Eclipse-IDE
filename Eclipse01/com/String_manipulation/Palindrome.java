package com.String_manipulation;

public class Palindrome {

	static String s1;

	public static void main(String[] args) {

		getSameLengthPalindromeAsString("ssddffggtteeuun");
		System.out.println(isPalindrome("arga"));
		getAvailableSubstringPalindromes("arartt",1);
	}

	public static boolean isPalindrome(String a) {
		boolean flag = true;
		int j = a.length() - 1;
		for (int i = 0; i <= a.length() / 2 && j >= a.length() / 2; i++, j--) {
			if (a.charAt(i) != a.charAt(j)) {
				flag = false;
			}

		}
		return flag;

	}

	@SuppressWarnings("unused")
	public static boolean canBeASameLengthPalindrome(String a) {
		boolean flag = true;
		char[] b = a.toCharArray();
		char[] c = new char[a.length()];
		int m = 0;
		int n = a.length() - 1;
		int charChecker = 0;
		boolean trigger = false;

		if (b.length % 2 == 0) {
			for (int i = 0; i < b.length; i++) {
				for (int j = b.length - 1; j > 0; j--) {
					if (b[i] == b[j] && b[i] != '\0' && b[j] != '\0' && i != j) {
						c[m] = b[i];
						c[n] = b[j];
						m++;
						n--;
						b[i] = '\0';
						b[j] = '\0';

					}
				}

			}
			for (int i = 0; i < c.length; i++) {
				if (c[i] == '\0') {
					System.out.println(c);
					return false;
				}

			}
			System.out.println(c);
			String temp = new String(c);
			s1 = temp;
			return true;

		} else if (b.length == 1) {

			s1 = a;
			return true;

		} else {
			for (int i = 0; i < b.length; i++) {
				for (int j = b.length - 1; j > 0; j--) {
					if (b[i] == b[j] && b[i] != '\0' && b[j] != '\0' && i != j) {
						c[m] = b[i];
						c[n] = b[j];
						m++;
						n--;
						b[i] = '\0';
						b[j] = '\0';
						trigger = true;

					}
				}

			}
			for (int i = 0; i < c.length; i++) {
				if (c[i] == '\0') {
					charChecker++;
					if (charChecker > 1)
						return false;
				}

			}
			for (int i = 0; i < b.length; i++) {
				if (b[i] != '\0') {
					c[c.length / 2] = b[i];
				}
			}

			System.out.println(c);
			String temp = new String(c);
			s1 = temp;
			return true;

		}

	}

	public static void getSameLengthPalindromeAsString(String s) {

		if (canBeASameLengthPalindrome(s))
			System.out.println("A possible same length palindrome of \"" + s + "\" can be \"" + s1 + "\".");
		else
			System.out.println("No same length palindrome of \"" + s + "\" is possible.");

	}

	public static void getAvailableSubstringPalindromes(String s,int a) {
		// This method is extremely limited in scope.
		// This method will only return a palindromic substring in a string iff it is a palindrome.
		// This method won't check for all possible palindromic substrings.
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + a; j < s.length(); j++) {
				String temp = s.substring(i, j);

				if (isPalindrome(temp))
					System.out.println(temp);
			}
		}

	}
}
