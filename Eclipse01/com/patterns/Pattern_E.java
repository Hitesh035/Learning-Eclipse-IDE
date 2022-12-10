package com.patterns;

public class Pattern_E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printE(20, 20);
	}
	public static void printE(int m, int n) {
		for(int i =1; i<=n; i++) {
			if(i == 1|| i== m/2 || i==m) {
				for(int j=1; j<=n;j++) {
					System.out.print("*");
				}
			}
			else {
				for(int j=1; j<=n;j++) {
					if(j==1) {
						System.out.print("*");
					}
				}
			}
			System.out.println();
		}
	}

}
