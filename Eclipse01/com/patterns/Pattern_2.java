package com.patterns;
import java.util.*;

public class Pattern_2 {

	//12345
	//23451
	//34512
	//45123
	//51234
	
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int a = scn.nextInt();
		
		
		for(int i=1 ; i<=a; i++) {
			int count =1;
			for(int j =i; j<=a&&count<=a;j++ ) {
				System.out.print(j+" ");
				count++;
				
				if (j==a) {
					j=1;
					while(j<i && count<=a) {
						System.out.print(j+" ");
						j++;
						count++;
					}
					j++;
				}
			}
			System.out.println();
		}
	}
}
