package com.patterns;

public class Pattern_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printA(20,40);
		//first argument must be approximately half of the second argument.

	}

	public static void printA(int m, int n) {
		int firstEle = n / 2 - 1;
		int secondEle = n / 2 + 1;

		for (int i = 1; i <= n; i++) {
			if (i == 1) {
				for (int j = 1; j <= n; j++) {
					if (j == n / 2)
						System.out.print("*");
					else
						System.out.print(" ");
				}
			} else if (i == m / 2) {
				for (int j = 1; j <= n; j++) {
					if (j >= firstEle && j <= secondEle)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				firstEle--;
				secondEle++;

			} else {
				for (int j = 1; j <= n; j++) {
					if (j == firstEle || j == secondEle)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				firstEle--;
				secondEle++;
			}
			System.out.println();
		}
	}

}
