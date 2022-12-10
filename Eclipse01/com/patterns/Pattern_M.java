package com.patterns;

public class Pattern_M {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print_M(30, 31);
	}

	public static void print_M(int m, int n) {
		int firstEle = 2;
		int secondEle = n - 1;

		for (int i = 1; i <= m; i++) {
			if (i == 1 || i > m / 2) {
				for (int j = 1; j <= n; j++) {
					if (j == 1 || j == n) {
						System.out.print("*");
					} else
						System.out.print(" ");
				}
			}

			else if (i > 1 && i <= m / 2) {
				if (i == m / 2) {
					for (int j = 1; j <= n; j++) {
						if (j == 1 || j == n || j == n / 2 + 1) {
							System.out.print("*");

						} else
							System.out.print(" ");
					}
				} else {
					for (int j = 1; j <= n; j++) {
						if (j == 1 || j == n || j == firstEle || j == secondEle) {
							System.out.print("*");
						} else
							System.out.print(" ");
					}
					firstEle++;
					secondEle--;
				}
			}
			System.out.println();
		}
	}

}
