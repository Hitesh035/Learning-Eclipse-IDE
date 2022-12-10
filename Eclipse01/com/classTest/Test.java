package com.classTest;

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

class Result {

	/*
	 * Complete the 'arrayManipulation' function below.
	 *
	 * The function is expected to return a LONG_INTEGER. The function accepts
	 * following parameters: 1. INTEGER n 2. 2D_INTEGER_ARRAY queries
	 */

	public static long arrayManipulation(int n, List<ArrayList<Integer>> queries) {
//    TRY 1
//    int result = 0;
//        int[] arr = new int[n];
//        for (int i = 0; i<n; i++) {
//            arr[i]=0;
//        }
//        for (int i = 0; i<queries.size()&&queries.get(i) != null; i++) {
//            for(int j = queries.get(i).get(0)-1; j<n&&j<=queries.get(i).get(1)-1;j++ ) {
//                arr[j] += queries.get(i).get(2);
//            }
//        }
//        
//        for (int i = 0; i<n; i++) {
//            if(result < arr[i]) result = arr[i];
//        }
//        return result;

//		TRY 2
//		long result = 0;
//		TreeSet<Long> sortedSet = new TreeSet<Long>();
//		long[] arr = new long[n];
//		for (int i = 0; i < n; i++) {
//			arr[i] = 0;
//		}
//		for (int i = 0; i < queries.size() && queries.get(i) != null; i++) {
//			for (int j = queries.get(i).get(0) - 1; j < n && j <= queries.get(i).get(1) - 1; j++) {
//				arr[j] = arr[j] + queries.get(i).get(2);
//				sortedSet.add(arr[j]);
//			}
//		}
//
//		return sortedSet.last();

//		TRY 3
//		long result=0;
//        long count =0;
//        int smallestIndex = 0;
//        int largestIndex = n-1;
//        long [] arr = new long[n];
//        
//        
//        
//        for (int i=0; i<queries.size(); i++){
//            if(smallestIndex <= queries.get(i).get(0)) smallestIndex = queries.get(i).get(0);
//            if(largestIndex >= queries.get(i).get(1)) largestIndex = queries.get(i).get(1);
//        }
//        if(smallestIndex > largestIndex){
//            int i=smallestIndex;
//            
//            smallestIndex=largestIndex;
//            largestIndex=i;
//        }
//        
//        for (int i=0; i<queries.size(); i++){
//            if(queries.get(i).get(0)>= smallestIndex && queries.get(i).get(1)<= largestIndex ) {
//                result+= queries.get(i).get(2);
//            }
//            
//        }
//        return result;

// 		  TRY 4
//		long indexValue = 0;
//		long count = 1;
//		long result = 0;
//		long indexFreq = 0;
//		long freqIndex = 0;
//		long[] arr = new long[n];
//		Map<Long, Long> tempMap = new HashMap<>();
//		Map<Long, Long> valMap = new HashMap<>();
//		for (int i = 0; i < queries.size(); i++) {
//			long index = queries.get(i).get(0) - 1;
//			for (int j = 0; j < (queries.get(i).get(1)) - (queries.get(i).get(0)); j++) {
//
//				if (index < queries.get(i).get(1)) {
//					if (tempMap.containsKey(index)&& valMap.containsKey(index)) {
//						count = tempMap.get(index);
//						indexValue = valMap.get(index);
//						
//						count++;
//						indexValue += queries.get(i).get(2) ;
//						
//						if (count >= indexFreq) {
//							freqIndex = index;
//							indexFreq = count;
//						}
//						if (indexValue >= result) {
//							result = indexValue;
//						}
//						tempMap.put(index, count);
//						valMap.put(index, indexValue);
//					} else {
//						tempMap.put(index, count);
//						valMap.put(index, (long)queries.get(i).get(2));
//						
//						freqIndex = index;
//						indexFreq = count;
//						if(result <= result+queries.get(i).get(2)) result += queries.get(i).get(2) ;
//					}
//				}
//				index++;
//			}
//
//		}
//		return result;

// 		TRY 5

//		long indexValue = 0;
//
//		long result = 0;
//		long queryresult=0;
//
//		Map<Long, Long> valMap = new HashMap<>();
//		
//		
//		for (int i = 0; i < queries.size(); i++) {
//			long index = queries.get(i).get(0) - 1;
//			for (int j = 0; j <= (queries.get(i).get(1)) - (queries.get(i).get(0)); j++) {
//
//				if (index < queries.get(i).get(1)) {
//					if (valMap.containsKey(index)) {
//
//						indexValue = valMap.get(index);
//
//						indexValue += queries.get(i).get(2);
//
//						if (indexValue >= result) {
//							result = indexValue;
//						}
//
//						valMap.put(index, indexValue);
//					} else {
//
//						valMap.put(index, (long) queries.get(i).get(2));
//						if (result <= queries.get(i).get(2))
//							result = queries.get(i).get(2);
//
//					}
//				}
//				index++;
//			}
//
//		}
//		return result;

//      TRY 6

		long result = 0;

		long[] arr = new long[n];

		for (int i = 0; i < queries.size(); i++) {
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

public class Test {

	public static void main(String[] args) {
		ArrayList<Integer> n = new ArrayList<>();
		ArrayList<Integer> m = new ArrayList<>();
		ArrayList<Integer> o = new ArrayList<>();
		ArrayList<ArrayList<Integer>> queries = new ArrayList<>();
		n.add(2);
		n.add(3);
		n.add(603);
		m.add(1);
		m.add(1);
		m.add(286);
		o.add(4);
		o.add(4);
		o.add(882);
		queries.add(n);
		queries.add(m);
		queries.add(o);

		System.out.println(Result.arrayManipulation(10, queries));
	}

}
