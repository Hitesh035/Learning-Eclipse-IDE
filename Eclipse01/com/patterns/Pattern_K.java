package com.patterns;

public class Pattern_K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printK(25, 25);
	}

	public static void printK(int m, int n) {
		int firstEle = n;
		for (int i = 1; i <= m; i++) {
			if (i >= 1 && i <= m / 2) {
				for (int j = 1; j <= n; j++) {
					if (j == 1 || j == firstEle) {
						System.out.print("*");
					} else
						System.out.print(" ");
				}
				firstEle = firstEle - 2;
			} else {
				for (int j = 1; j <= n; j++) {
					if (j == 1 || j == firstEle) {
						System.out.print("*");
					} else
						System.out.print(" ");
				}
				firstEle = firstEle + 2;

			}
			for (int j = 1; j <= n; j++) {

			}
			System.out.println();
		}
	}
}
