package com.String_manipulation;

import java.util.*;

public class Anagram {

	public static void main(String[] args) {

		System.out.println("Enter the number of strings you need to compare.");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		String[] a = new String[n];

		for (int i = 0; i <= n + 1; i++) {
			if (i < n) {
				System.out.println("Press '1' to enter a new string.");
				System.out.println("Press '2' to check if your strings are anagrams.");
				System.out.println("Press '3' to end the application.");

				int choice = scn.nextInt();

				if (choice == 1) {
					System.out.println("Enter string");
					String b = scn.next();
					a[i] = b;
					System.out.println(b);

				} else if (choice == 2) {
					isAnagram(a);
				} else if (choice == 3)
					return;
				else
					System.out.println("Invalid choice!");
			} else {
				isAnagram(a);
			}
		}

	}

	public static void isAnagram(String... a) {
		int i = 0;
		for (i = 0; i < a.length; i++) {
			/*
			 * if(i<a.length-1 && a[i] != null && a[i+1]!=null) { if(a[i].equals(a[i+1]))
			 * System.out.println("'"+a[i]+"'"+" and "+"'"+
			 * a[i+1]+"'"+" are anagrams of each other"); else
			 * System.out.println("'"+a[i]+"'"+" and "+"'"+
			 * a[i+1]+"'"+" are not anagrams of each other"); }
			 */

			if (a[i] != null) {
				for (int j = i + 1; j < a.length - 1; j++) {
					if (a[j] != null) {
						if (isAnagram(a[i], a[j])) {
							System.out.println(
									"'" + a[i] + "'" + " and " + "'" + a[j] + "'" + " are anagrams of each other");
						} else {
							System.out.println(
									"'" + a[i] + "'" + " and " + "'" + a[j] + "'" + " are not anagrams of each other");
						}
					}
				}
			} else {
				System.out.println("You must enter atleast two strings to compare.");
				break;
			}
		}
	}

	public static boolean isAnagram(String a, String b) {

		a = a.toLowerCase();
		b = b.toLowerCase();

		boolean flag = true;
		if (a.length() != b.length()) {
			flag = false;
			System.out.println(a + " " + b);
			return flag;
		} else {
			for (int i = 0; i < a.length(); i++) {
				for (int j = 0; j < b.length(); j++) {
					if (a.charAt(i) == b.charAt(j)) {
						a = a.replaceFirst(a.charAt(i) + "", "`");
						b = b.replaceFirst(b.charAt(j) + "", "`");

					}
				}
			}

			if (a.equals(b)) {
				flag = true;
				System.out.println(a + " " + b);
				return flag;

			} else {
				flag = false;
				System.out.println(a + " " + b);
				return flag;
			}
		}

	}

}
