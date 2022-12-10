package com.classTest;

import com.numbers.*;
import java.util.*;

public class AbundantOrDeficient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int abundantCount= 0;
		int deficientCount = 0;
		System.out.println("Enter a lower limit.");

		Scanner scn = new Scanner(System.in);

		int a = scn.nextInt();

		System.out.println("Enter an upper limit.");
		int b = scn.nextInt();

		for (int i = a; i <= b; i++) {
			if (AbundantOrDeficientNumber.isAbundantorDeficient(i)) {
				System.out.println(i + " is an abundant number.");
				abundantCount++;
			} else {
				System.out.println(i + " is a deficient number.");
				deficientCount++;
			}
		}
		System.out.println("From "+a+" to "+b+" there are "+abundantCount+" abundant numbers and "+deficientCount+" deficient numbers.");
		

	}

}
