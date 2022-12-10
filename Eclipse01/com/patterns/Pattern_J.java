package com.patterns;

public class Pattern_J {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printJ(10, 15);
	}

	public static void printJ(int m, int n) {
		int firstEle = n / 2;
		for (int i = 1; i <= m; i++) {
			if (i == 1) {
				for (int j = 1; j <= n; j++) {
					System.out.print("*");
				}
			} else if (i > 1 && i < m - 3) {
				for (int j = 1; j <= n; j++) {
					if (j == n / 2 + 1) {
						System.out.print("*");
					} else
						System.out.print(" ");
				}
			} else if (i >= m - 3 && i < m) {
				for (int j = 1; j <= n; j++) {
					if (j == firstEle) {
						System.out.print("*");
					} else
						System.out.print(" ");
				}
				firstEle--;
			} else {
				for (int j = 1; j <= n; j++) {
					if (j >= 1 && j < firstEle + 1) {
						System.out.print("*");
					} else
						System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
