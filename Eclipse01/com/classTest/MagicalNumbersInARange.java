package com.classTest;
import com.numbers.*;
import java.util.*;

public class MagicalNumbersInARange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int magicalCount=0;
		int nonMagicalCount=0;
		System.out.println("Enter a lower limit");
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		
		System.out.println("Enter a upper limit");
		int b = scn.nextInt();
		
		for(int i=a; i<=b; i++) {
			if(MagicalNumber.isMagical(i)) {
				magicalCount++;
				System.out.println(i+" is a magical number.");
			}
			else {
				nonMagicalCount++;
				System.out.println(i+" is a non magical number.");
			}
		}
		System.out.println("From "+a+" to "+b+" there are "+magicalCount+" magical numbers and "+nonMagicalCount+" non-magical numbers.");
	}

}
