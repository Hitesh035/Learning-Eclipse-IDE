package com.abstract_classes;
abstract class A{
	A(){
		System.out.println("constructor of class A");
	}
	
	abstract public void m1();
	public void m2() {
		System.out.println("m2() of class A");
	}
	
	abstract public void m3();
	 public static void m4() {
		System.out.println("Static method m4() of class A");
	}
	
	final public void m5(){
		
		System.out.println("final method m5() of class A");
	}
		
	
}

abstract class B extends A{
	
	B(){
		System.out.println("Constructor of class B");
	}
	
	@Override
	public void m1() {
		System.out.println("m1() of class A overriden by class B.");
	}
	
	
}

class C extends B{
	
	C(){
		System.out.println("constructor of C");
	}
	
	@Override
	public void m3() {
		System.out.println("m3() of class A overriden in class C");
	}
}

public class Abstract_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c1 = new C();
		
		c1.m1();
		c1.m2();
		c1.m3();
		c1.m4();
		c1.m5();
		
	}

}
