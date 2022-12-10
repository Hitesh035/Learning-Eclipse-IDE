package com.patterns;

public class Pattern_B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printB(21,21);
	}

	public static void printB(int m, int n) {
		int secondEle = n - 3;
		int thirdEle = n - 3;

		for (int i = 1; i <= m; i++) {
			if (i == 1 || i == m / 2 || i == m) {
				for (int j = 1; j <= n; j++) {
					if (j >= 1 && j <= n - 4)
						System.out.print("*");
					else
						System.out.print(" ");
				}
			}

			else if (i > 1 && i < m / 2) {
				if (i > 1 && i <= 4) {
					for (int j = 1; j <= n; j++) {
						if (j == 1 || j == secondEle) {
							System.out.print("*");
						} else
							System.out.print(" ");
					}
					secondEle++;
				} else if (i > 4 && i <= m / 2 - 4) {
					for (int j = 1; j <= n; j++) {
						if (j == 1 || j == n) {
							System.out.print("*");
						} else
							System.out.print(" ");
					}

				}

				else if (i > m / 2 - 4 && i <= m / 2) {
					for (int j = 1; j <= n; j++) {
						if (j == 1 || j == secondEle) {
							System.out.print("*");
						} else
							System.out.print(" ");
					}
					secondEle--;

				}
			}

			else if (i > m / 2 && i < m) {
				if (i > m / 2 && i <= m / 2 + 4) {
					for (int j = 1; j <= n; j++) {
						if (j == 1 || j == thirdEle) {
							System.out.print("*");
						} else
							System.out.print(" ");
					}
					thirdEle++;
				} else if (i > m / 2 + 4 && i <= m - 4) {
					for (int j = 1; j <= n; j++) {
						if (j == 1 || j == n) {
							System.out.print("*");
						} else
							System.out.print(" ");
					}

				}

				else if (i > m - 4 && i <= m) {
					for (int j = 1; j <= n; j++) {
						if (j == 1 || j == (thirdEle-1)) {
							System.out.print("*");
						} else
							System.out.print(" ");
					}
					thirdEle--;

				}
			}
			System.out.println();
		}
	}
}
