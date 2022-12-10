package com.object_class;
class InstanceCreator{
	
	private InstanceCreator() {
		
		
	}
	
	public static InstanceCreator getInstance() {
		
		return new InstanceCreator();
		
		//This is the Factory method or the helper method that returns a new object of the class when called.
		//This method can be called from anywhere in the Java project because of the public visibility.
		//Objects of this class cannot be created outside the class as the visibility is private.
		//This method can be called using the class name and the returned object can be stored in a class reference.
	}
}
public class FactoryMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InstanceCreator i1 = InstanceCreator.getInstance();
		
		InstanceCreator i2 = InstanceCreator.getInstance();
		
		System.out.println(i1 == i2);
	}

}
