package com.menu_driven;
import com.patterns.*;

public class Play_with_letters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void printString(String a, int m) {
		
		int n;
		for(int i =0; i<a.length(); i++) {
			if(a.charAt(i)== 'a'|| a.charAt(i)== 'A') {
				 n = 2*m;
				 Pattern_A.printA(m, n);
			}
		}
	}

}
