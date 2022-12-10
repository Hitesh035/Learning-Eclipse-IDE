package com.patterns;

public class Pattern_G {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printG(15, 15);
	}

	public static void printG(int m, int n) {
		int firstEle = 5;
		for (int i = 1; i <= m; i++) {
			if (i == 1 || i == m) {
				for (int j = 1; j <= n; j++) {
					if (j >= 6) {
						System.out.print("*");
					} else
						System.out.print(" ");
				}
			} else if (i > 1 && i <= 6) {
				for (int j = 1; j <= n; j++) {
					if (j == firstEle) {
						System.out.print("*");
					} else
						System.out.print(" ");
				}
				firstEle--;
			} else if (i > 6 && i < m - 5) {

				if (i == m / 2 + 1) {
					for (int j = 1; j <= n; j++) {
						if (j == 1 || j >= n / 2 + 1) {
							System.out.print("*");
						} else
							System.out.print(" ");
					}
				} else if (i < m / 2 + 1) {
					for (int j = 1; j <= n; j++) {
						if (j == 1) {
							System.out.print("*");
						} else
							System.out.print(" ");
					}
				} else if (i > m / 2 + 1) {
					for (int j = 1; j <= n; j++) {
						if (j == 1 || j == n) {
							System.out.print("*");
						} else
							System.out.print(" ");
					}
				}

			} else if (i >= m - 5 && i < m) {
				for (int j = 1; j <= n; j++) {
					if (j == firstEle + 1 || j == n) {
						System.out.print("*");
					} else
						System.out.print(" ");
				}
				firstEle++;
			}
			System.out.println();
		}
	}

}
