package com.patterns;

public class Pattern_O {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printO(20, 30);
		Pattern_Q.printQ(25, 25);
	}

	public static void printO(int m, int n) {

		int firstEle = n / 2 - 7;
		int secondEle = n / 2 + 9;

		for (int i = 1; i <= m; i++) {
			if (i == 1 || i == m) {

				for (int j = 0; j <= n; j++) {
					if (j >= n / 2 - 7 && j <= n / 2 + 7) {
						System.out.print("*");
					} else
						System.out.print(" ");
				}
			}

			else if (i > 1 && i <= m - 1) {
				if (i > 1 && i <= 7) {
					for (int j = 1; j <= n; j++) {
						if (j == firstEle || j == secondEle) {
							System.out.print("*");
						} else
							System.out.print(" ");
					}
					firstEle--;
					secondEle++;
				} else if (i >= 8 && i <= m - 8) {
					for (int j = 1; j <= n; j++) {
						if (j == firstEle || j == secondEle) {
							System.out.print("*");
						} else
							System.out.print(" ");
					}

				} else {
					for (int j = 1; j <= n; j++) {
						if (j == firstEle || j == secondEle) {
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
