package com.abstract_classes;

interface Itr{
	public final static int i = 10;
	void m1();
	void m2();
	void m3();
	
}

class ItrTest implements Itr{
	@Override
	public void m1() {
		System.out.println("m1() overridden");
	}
	
	@Override
	public void m2() {
		System.out.println("m2() overridden");
	}
	
	@Override
	public void m3() {
		System.out.println("m3() overridden");
	}
}
public class InterfaceClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ItrTest i1 = new ItrTest();
		
		i1.m1();
		i1.m2();
		i1.m3();
		System.out.println(Itr.i);
		
		
	}

}
