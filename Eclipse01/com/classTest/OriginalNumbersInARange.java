package com.classTest;

import com.numbers.*;
import java.util.*;

public class OriginalNumbersInARange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int originalCount = 0;
		int nonOriginalCount=0;
		System.out.println("Enter a lower limit");
		Scanner scn = new Scanner(System.in);

		long a = scn.nextLong();
		System.out.println("Enter a upper limit.");
		long b = scn.nextLong();

		for (long i = a; i <= b; i++) {
			if (OriginalNumber.isOriginal(i)) {
				System.out.println(i + " is an original number.");
				originalCount++;
			} else {
				System.out.println(i + " is not an original number.");
				nonOriginalCount++;
			}
		}
		System.out.println("From "+a+" to "+b+" there are "+originalCount+" numbers of original numbers and "+nonOriginalCount+" number of non-original numbers.");
	}

}
