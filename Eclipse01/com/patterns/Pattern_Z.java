package com.patterns;

public class Pattern_Z {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printZ(30, 30);
		//Provided parameters must be equal 
	}

	public static void printZ(int m, int n) {
		int firstEle = 1;
		int secondEle = n - 1;

		for (int i = 1; i <= m; i++) {
			if (i == 1 || i == m) {
				for (int j = 1; j <= n; j++) {

					System.out.print("*");

				}

			} else {
				for (int j = 1; j <= n; j++) {
					if (j == secondEle)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				secondEle--;

			}

			System.out.println();
		}
	}

}
