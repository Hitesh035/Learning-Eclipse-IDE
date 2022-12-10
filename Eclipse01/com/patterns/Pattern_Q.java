package com.patterns;

public class Pattern_Q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printQ(40, 35);
		printQ(30, 35);
		printQ(30, 25);
	}

	public static void printQ(int n, int m) {

		int firstEle = (m / 2) + 1 - 7;
		int secondEle = ((m / 2) + 1) + 7;
		int qBar = m / 2 + 1;

		for (int i = 1; i <= n; i++) {

			if (i == 1 || i == n - 10) {

				for (int j = 1; j <= m; j++) {
					if (j >= ((m / 2) + 1) - 6 && j <= ((m / 2) + 1) + 6 || (j == qBar)) {
						System.out.print("*");
					} else
						System.out.print(" ");
				}
				if (i >= n / 2)
					qBar++;

			}

			else if (i >= 2 && i <= n - 11) {

				if (i >= 2 && i <= 7) {
					for (int j = 1; j <= m; j++) {
						if (j == firstEle || j == secondEle) {
							System.out.print("*");
						} else
							System.out.print(" ");
					}
					firstEle--;
					secondEle++;
				}

				else if (i >= 2 && i <= n - 18) {
					for (int j = 1; j <= m; j++) {
						if (j == firstEle || j == secondEle || (i >= n / 2 && j == qBar)) {
							System.out.print("*");

						} else
							System.out.print(" ");

					}
					if (i >= n / 2)
						qBar++;
				}

				else {
					for (int j = 1; j <= m; j++) {
						if (j == firstEle || j == secondEle || (i >= n / 2 && j == qBar)) {
							System.out.print("*");
						} else
							System.out.print(" ");
					}
					if (i >= n / 2)
						qBar++;
					firstEle++;
					secondEle--;
				}
			}

			else if (i > n - 10) {
				for (int j = 1; j <= m; j++) {
					if (j == qBar)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				if (i >= n / 2)
					qBar++;
			}

			System.out.println();
		}

	}
}
