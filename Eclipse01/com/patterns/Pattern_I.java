package com.patterns;

public class Pattern_I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printI(15, 20);
	}

	public static void printI(int m, int n) {
		for (int i = 1; i <= m; i++) {
			if (i == 1 || i == m) {
				for (int j = 1; j <= 7; j++) {
					System.out.print("*");
				}
			} else {
				for (int j = 1; j <= n; j++) {
					if (j == 4) {
						System.out.print("*");
					} else
						System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
