package com.patterns;

public class Pattern_W {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printW(12, 30);
		// Provided arguments, first argument should be approximately 1/3 of the second
		// argument.
	}

	public static void printW(int m, int n) {
		int firstElement = 2;
		int secondElement = n / 2 - 2;
		int thirdElement = n / 2 + 2;
		int fourthElement = n - 1;

		/*
		 * for (int i = 1; i <= m; i++) {
		 * 
		 * if (i >= 1 && i < m / 2) { for (int j = 1; j <= n; j++) { if (j ==
		 * firstElement || j == fourthElement) { System.out.print("*"); } else
		 * System.out.print(" ");
		 * 
		 * } firstElement++; fourthElement--; } else if (i == m / 2) { for (int j = 1; j
		 * <= n; j++) { if (j == firstElement || j == fourthElement || j == n / 2) {
		 * System.out.print("*"); } else System.out.print(" ");
		 * 
		 * } firstElement++; fourthElement--; } else if (i > m / 2 && i < (3 * m) / 4) {
		 * for (int j = 1; j <= n; j++) { if (j == firstElement || j == fourthElement ||
		 * j == secondElement || j == thirdElement) { System.out.print("*"); } else
		 * System.out.print(" ");
		 * 
		 * } firstElement++; secondElement--; thirdElement++; fourthElement--; }
		 * 
		 * System.out.println(); }
		 */

		for (int i = 1; i <= m; i++) {
			if (i == 1) {
				for (int j = 1; j <= n; j++) {
					if (j == 1 || j == n || j == n / 2) {
						System.out.print("*");
					} else
						System.out.print(" ");

				}
			}

			else if (i > 1 && i < (3 * m) / 4) {
				for (int j = 1; j <= n; j++) {
					if (j == firstElement || j == fourthElement || j == secondElement || j == thirdElement) {
						System.out.print("*");
					} else
						System.out.print(" ");

				}
				firstElement++;
				secondElement--;
				thirdElement++;
				fourthElement--;
			}

			System.out.println();
		}

	}

}
