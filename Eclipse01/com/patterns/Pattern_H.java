package com.patterns;

public class Pattern_H {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printH(20, 20);
	}

	public static void printH(int m, int n) {
		for (int i = 1; i <= n; i++) {
			if (i == m / 2 + 1) {
				for (int j = 1; j <= n; j++) {
					System.out.print("*");
				}
			} else {
				for (int j = 1; j <= n; j++) {
					if (j == 1 || j == n) {
						System.out.print("*");
					} else
						System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
