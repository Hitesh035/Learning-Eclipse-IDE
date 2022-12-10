package com.object_class;
class StudentDetailsEnter{
	String name;
	int age;
	int id;
	public StudentDetailsEnter(String name, int age, int id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Name of the student is "+ this.name+ ". Age is "+ this.age+ ". Id is "+this.id+".";
		// This method is a method of the Object class. Return type is String.
		//The superclass(Object class) method implementation returns the address of the object as a string.
		// Over here I tried to override the superclass implementation to return the object details instead of the address.
	}
	
}
public class StudentInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDetailsEnter s1 = new StudentDetailsEnter("Ram",12,1);
		
		System.out.println(s1.toString());
	}

}
