package com.patterns;

public class Pattern_X {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printX(21, 21);
	}

	public static void printX(int m, int n) {
		/*
		 * int firstEle = 1; int secondEle = n;
		 * 
		 * for (int i = 1; i <= m; i++) { if (i >= 1 && i <m/2+1) { for (int j = 1; j <=
		 * n; j++) { if (j == firstEle || j == secondEle) System.out.print("*"); else
		 * System.out.print(" "); } firstEle++; secondEle--; } else if (i == m/2+1) {
		 * for (int j = 1; j <= n; j++) { if (j == n/2+1) System.out.print("*"); else
		 * System.out.print(" "); }
		 * 
		 * } else if (i >m/2+ 1 && i <=m) { for (int j = 1; j <= n; j++) { if (j ==
		 * firstEle || j == secondEle) System.out.print("*"); else
		 * System.out.print(" "); } firstEle++; secondEle--; }
		 * 
		 * 
		 * 
		 * System.out.println(); }
		 */
		int a = n;
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == i || j == a)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
			a--;
		}
	}

}
