package com.patterns;

public class Pattern_U {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printU(25, 64);
	}

	public static void printU(int m, int n) {
		int firstEle = 2;
		int secondEle = n - 1;

		for (int i = 0; i <= m; i++) {
			if (i >= 1 && i <= m - 5) {
				for (int j = 0; j <= n; j++) {
					if (j == 1 || j == n)
						System.out.print("*");
					else
						System.out.print(" ");
				}
			}

			else if (i > m - 5 && i < m) {
				for (int j = 0; j <= n; j++) {
					if (j == firstEle || j == secondEle)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				firstEle++;
				secondEle--;
			} else if (i == m) {
				for (int j = 0; j <= n; j++) {
					if (j > firstEle && j < secondEle)
						System.out.print("*");
					else
						System.out.print(" ");
				}

			}

			System.out.println();
		}
	}

}
