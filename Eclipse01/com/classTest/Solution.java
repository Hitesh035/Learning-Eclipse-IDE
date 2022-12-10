package com.classTest;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

	public static long arrayManipulation(int n, List<List<Integer>> queries) {
		// Write your code here
		int result = 0;
		int[] arr = new int[n];
		for (int i = 1; i<n; i++) {
			arr[i]=0;
		}
		for (int i = 1; queries.get(i) != null; i++) {
			for(int j = queries.get(i).get(0); j<=queries.get(i).get(1);j++ ) {
				arr[j] += queries.get(i).get(2);
			}
		}
		
		for (int i = 1; i<n; i++) {
			if(result < arr[i]) result = arr[i];
		}
		return result;
	}
}
