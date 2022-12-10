package com.patterns;
import java.util.*;

public class Pattern_3 {
	
	//*0000
	//1*000
	//11*00
	//111*0
	//1111*

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner  scn = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int a = scn.nextInt();
		
		for(int i= 0 ; i<a; i++) {
			
			for (int j =0 ; j<a; j++) {
				if(j==i)System.out.print("*");
				else if(j<i)System.out.print("1");
				else System.out.print("0");
			}
			System.out.println();
		}
		
	}

}
