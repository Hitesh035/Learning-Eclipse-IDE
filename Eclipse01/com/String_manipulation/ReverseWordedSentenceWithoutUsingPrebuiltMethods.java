package com.String_manipulation;

public class ReverseWordedSentenceWithoutUsingPrebuiltMethods {

	public static void main(String[] args) {

		getReverseLetteredWordSentenceBuiltUsingArrays("java is an oop lang. It is used by programmers");
	}

	public static char[] reverseCharArray(char[] a) {
		char[] b = new char[a.length];

		for (int i = a.length - 1; i >= 0; i--) {
			for (int j = 0; j < b.length; j++) {
				b[j] = a[i];
			}
		}
		return a;

	}

	public static boolean check() {

		char[] a = new char[3];

		if (a[1] == '\0')
			return true;
		else
			return false;

	}

	public static void getReverseLetteredWordSentenceBuiltUsingArrays(String s) {

		char[] c1 = s.toCharArray();
		String s1 = "";
		int i = 0;
		int j = i;

		while (i < c1.length) {

			if (c1[i] == ' ' || i == c1.length - 1) {
				int k = i;
				String s2 = "";

				if (c1[i] == ' ') {

					while (i > j && c1[i - 1] != ' ') {
						s2 = s2 + c1[i - 1];
						i--;
					}
				}

				else if (c1[i] != ' ' && i == c1.length - 1) {
					while (i >= 0 && i >= j && i != ' ') {
						s2 = s2 + c1[i];
						i--;
					}
				}

				if (i == 0)
					s1 = s1 + s2;
				else
					s1 = s1 + " " + s2;
				i = k;
				j = i;

			}

			i++;
		}
		System.out.print(s1);

	}

}
