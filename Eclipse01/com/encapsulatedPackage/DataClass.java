package com.encapsulatedPackage;

public class DataClass {
	private int x = 20;
	
	
	public int accessor_method() {
		return this.x;
	}
	
	public void mutator_method(int x) {
		
		this.x =x;
	}

	public static void main(String[] args) {
		
		DataClass d1 = new DataClass();
		
		d1.mutator_method(34);
		d1.accessor_method();
		System.out.println(d1.accessor_method());
		
		DataClass d2 = new DataClass();
		System.out.println(d2.accessor_method());
		
		

	}

}
