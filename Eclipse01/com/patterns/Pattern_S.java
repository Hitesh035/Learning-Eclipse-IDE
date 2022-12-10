package com.patterns;

public class Pattern_S {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printS(30, 30);
	}

	public static void printS(int m, int n) {
		int firstEle = 4;
		int secodEle = 2;
		int thirdEle = n - 4;
		int fourthEle = n - 1;

		for (int i = 1; i <= n; i++) {

			if (i == 1) {
				for (int j = 1; j <= n; j++) {
					if (j > 5)
						System.out.print("*");
					else
						System.out.print(" ");
				}
			} else if (i == m / 2 + 1) {
				for (int j = 1; j <= n; j++) {
					if (j > 5 && j < n - 4)
						System.out.print("*");
					else
						System.out.print(" ");
				}
			}

			else if (i > 1 && i < m / 2 + 1) {
				if (i > 1 && i <= 4) {
					for (int j = 1; j <= n; j++) {
						if (j == firstEle)
							System.out.print("*");
						else
							System.out.print(" ");
					}
					firstEle--;
				} else if (i > 4 && i <= m / 2 - 3) {
					for (int j = 1; j <= n; j++) {
						if (j == 1)
							System.out.print("*");
						else
							System.out.print(" ");
					}
					firstEle++;
				} else if (i > m / 2 - 3 && i < m / 2 + 1) {
					for (int j = 1; j <= n; j++) {
						if (j == secodEle)
							System.out.print("*");
						else
							System.out.print(" ");
					}
					secodEle++;
				}
			}

			else if (i > m / 2 + 1 && i < m) {
				if (i > m / 2 + 1 && i < m) {

					if (i > m / 2 + 1 && i <= m / 2 + 5) {
						for (int j = 1; j <= n; j++) {
							if (j == thirdEle)
								System.out.print("*");
							else
								System.out.print(" ");
						}
						thirdEle++;
					} else if (i > m / 2 + 5 && i <= m - 4) {
						for (int j = 1; j <= n; j++) {
							if (j == n)
								System.out.print("*");
							else
								System.out.print(" ");
						}

					} else if (i > m - 4 && i < m) {
						for (int j = 1; j <= n; j++) {
							if (j == fourthEle)
								System.out.print("*");
							else
								System.out.print(" ");
						}
						fourthEle--;
					}

				}
			} else {
				for (int j = 1; j <= n; j++) {
					if (j < fourthEle)
						System.out.print("*");
					else
						System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
