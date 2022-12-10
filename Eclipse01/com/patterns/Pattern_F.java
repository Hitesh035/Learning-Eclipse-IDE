package com.patterns;

public class Pattern_F {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printF(20, 20);
	}
	public static void printF(int m, int n) {
		for(int i =1; i<=n; i++) {
			if(i == 1|| i== m/2 ) {
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
