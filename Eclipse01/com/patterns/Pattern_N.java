package com.patterns;

public class Pattern_N {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printN(30, 32);
	}
	
	public static void printN(int m, int n) {
		int firstEle = 2;
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				if(j==1|| j==n || j==firstEle) {
					System.out.print("*");
				}
				else System.out.print(" ");
			}
			firstEle++;
			System.out.println();
		}
	}

}
