package com.patterns;

public class Pattern_V {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printV(20, 40);
	}

	public static void printV(int m, int n) {
		int firstEle = 1;
		int secondEle = n;

		for (int i = 1; i <= m; i++) {
			if (i >= 1 && i <= m) {
				for (int j = 1; j <= n; j++) {
					if (j == firstEle || j == secondEle)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				firstEle++;
				secondEle--;
			}

			System.out.println();
		}
	}

}
