package com.patterns;

public class Pattern_T {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printT(20, 20);
	}
	public static void printT(int m , int n) {
		for(int i=1; i<=m; i++) {
			if(i==1) {
				for(int j = 1; j<=n; j++) {
					System.out.print("*");
				}
			}
			else {
				for(int j = 1; j<=n; j++) {
					if(j==n/2+1) System.out.print("*");
					else System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
