package com.classTest;
import com.numbers.*;
import java.util.*;

public class SquaresOfNumbersWithDigitsAs1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter a range.");
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int j=1;
		for(int i=0; i<n ;i++,j= j*10+1) {
			
			System.out.println("Square of "+j+" is "+ExponentOfIntegers.getExponent(j,2)+".");
		}
	}

}
