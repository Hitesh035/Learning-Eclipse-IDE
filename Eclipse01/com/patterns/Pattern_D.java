package com.patterns;

public class Pattern_D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printD(31, 31);
	}
	
	public static void printD(int m, int n) {
		int firstEle = n-5;
		for (int i = 1; i <= m; i++) {
			if (i == 1 || i == m) {
				for (int j = 1; j <= n; j++) {
					if (j >= 1 && j<= n-6) {
						System.out.print("*");
					} else
						System.out.print(" ");
				}
			} else if (i > 1 && i <= 6) {
				for (int j = 1; j <= n; j++) {
					if (j == firstEle || j==1) {
						System.out.print("*");
					} else
						System.out.print(" ");
				}
				firstEle++;
			} else if (i > 6 && i < m - 5) {
				for (int j = 1; j <= n; j++) {
					if (j == 1 ||j==n) {
						System.out.print("*");
					} else
						System.out.print(" ");
				}

			} else if (i >= m - 5 && i < m) {
				for (int j = 1; j <= n; j++) {
					if (j == firstEle -1 || j==1) {
						System.out.print("*");
					} else
						System.out.print(" ");
				}
				firstEle--;
			}
			System.out.println();
		}
	}

}
