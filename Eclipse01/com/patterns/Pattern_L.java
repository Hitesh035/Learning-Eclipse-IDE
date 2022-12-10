package com.patterns;

public class Pattern_L {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printL(20, 70);
	}

	public static void printL(int m, int n) {
		
		for (int i = 1; i <= m; i++) {
			if (i ==m) {
				for (int j = 1; j <= n; j++) {
					System.out.print("*");
				}
				
			}
			else {
				for (int j = 1; j <= n; j++) {
					if(j==1) System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
