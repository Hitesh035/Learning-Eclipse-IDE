package com.hackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class A extends Thread {
	static long result;
	static int arrSize;
	static int lower;
	static int upper;
	static List<List<Integer>> queries;

	public void run() {
		result = Result.arrayManipulation(arrSize, lower, upper, queries);
	}
}

class B extends Thread {
	static long result;
	static int arrSize;
	static int lower;
	static int upper;
	static List<List<Integer>> queries;

	public void run() {
		result = Result.arrayManipulation(arrSize, lower, upper, queries);
	}
}

class C extends Thread {
	static long result;
	static int arrSize;
	static int lower;
	static int upper;
	static List<List<Integer>> queries;

	public void run() {
		result = Result.arrayManipulation(arrSize, lower, upper, queries);
	}
}

class D extends Thread {
	static long result;
	static int arrSize;
	static int lower;
	static int upper;
	static List<List<Integer>> queries;

	public void run() {
		result = Result.arrayManipulation(arrSize, lower, upper, queries);
	}
}

class Result {

	/*
	 * Complete the 'arrayManipulation' function below.
	 *
	 * The function is expected to return a LONG_INTEGER. The function accepts
	 * following parameters: 1. INTEGER n 2. 2D_INTEGER_ARRAY queries
	 */

	public static long arrayManipulation(int o, int n, int m, List<List<Integer>> queries) {
		// Write your code here

		long result = 0;

		long[] arr = new long[o];

		for (int i = n; i < m; i++) {
			int index = queries.get(i).get(0) - 1;
			for (int j = 0; j <= (queries.get(i).get(1)) - (queries.get(i).get(0)); j++) {

				if (index < queries.get(i).get(1)) {
					if (arr[index] != 0) {

						arr[index] += queries.get(i).get(2);

						if (arr[index] >= result) {
							result = arr[index];
						}

					} else {

						arr[index] = queries.get(i).get(2);
						if (result <= queries.get(i).get(2))
							result = queries.get(i).get(2);

					}
				}
				index++;
			}

		}
		return result;
	}

}

class Solution {

}

public class DataStructureArrayManipulation {
	public static void main(String[] args) throws IOException {
		String fileName = "C:\\Programming\\JAVA programs\\Eclipse_01\\src\\com\\hackerRank\\DataStructureArrayManipulationTestCase7.txt";
		File file = new File(fileName);
		FileReader fr = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fr);
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int n = Integer.parseInt(firstMultipleInput[0]);

		int m = Integer.parseInt(firstMultipleInput[1]);

		List<List<Integer>> queries = new ArrayList<>();

		IntStream.range(0, m).forEach(i -> {
			try {
				queries.add(Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
						.map(Integer::parseInt).collect(toList()));
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});
		long result = 0;
		if (m > 100) {
			Thread a = new A();
			A.lower = 0;
			A.upper = m / 4;
			A.arrSize = n;
			Thread b = new B();
			B.lower = m / 4;
			B.upper = m / 2;
			B.arrSize = n;
			Thread c = new C();
			C.lower = m / 4;
			C.upper = (3 * m) / 4;
			C.arrSize = n;
			Thread d = new D();
			D.lower = (3 * m) / 4;
			D.upper = m;
			D.arrSize = n;

			a.start();
			b.start();
			c.start();
			d.start();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println(result = Math.max(Math.max(A.result, B.result), Math.max(C.result, D.result)));
		} else {
			System.out.println(result = Result.arrayManipulation(n, 0, m, queries));
		}

//		bufferedWriter.write(String.valueOf(result));
//		bufferedWriter.newLine();
//
//		bufferedReader.close();
//		bufferedWriter.close();
	}
}
