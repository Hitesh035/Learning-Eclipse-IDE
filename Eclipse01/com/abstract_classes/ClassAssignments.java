package com.abstract_classes;
interface Xyz{
	
	void m1();
	void m2();
	default void m3() {}
	static void m4() {}
}

interface Yyy{
	
	void m2();
}

class Rj implements Xyz{ // Multiple Inheritance is possible.
	
	@Override
	public void  m1() {
		System.out.println("m1() of interface Xyz implemented in class Rj ");
	}
	@Override
	public void  m2() {
		System.out.println("m2() of interface Xyz and interface Yyy implemented in class Rj. Multiple inheritance achieved. Can't fool me!...puny developer. ");
	}
	@Override
	public void  m3() {
		System.out.println("Default m3() of Interface Xyz");
	}
	
	static public void  m4() {
		System.out.println("Default m3() of Interface Xyz");
	}
}

class Dj implements Xyz{ // Multiple Inheritance is possible.
	
	@Override
	public void  m1() {
		System.out.println("m1() of interface Xyz implemented in class Dj ");
	}
	@Override
	public void  m2() {
		System.out.println("m2() of interface Xyz and interface Yyy implemented in class Dj. Multiple inheritance achieved. Can't fool me!...puny developer. ");
	}
}
public class ClassAssignments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Xyz x1 = new Rj();
		
		x1.m3();
	}

}
