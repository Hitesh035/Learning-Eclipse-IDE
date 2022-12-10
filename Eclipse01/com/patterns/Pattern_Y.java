package com.patterns;

public class Pattern_Y {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printY(20, 21);
	}

	public static void printY(int m, int n) {
		int firstEle = 1;
		int secondEle = n;

		for (int i = 1; i <= m; i++) {
			if (i >= 1 && i <= m / 2) {
				for (int j = 1; j <= n; j++) {
					if (j == firstEle || j == secondEle)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				firstEle++;
				secondEle--;
			} else {
				for (int j = 1; j <= n; j++) {
					if (j == n / 2 + 1)
						System.out.print("*");
					else
						System.out.print(" ");
				}
			}

			System.out.println();
		}
	}

}
