package com.abstract_classes;
interface StudentServer{
	
	void name();
	void id();
	void age();
	void display();
}

class StudentForm implements StudentServer{
	
	private String name;
	private int id;
	private int age;
	
	public StudentForm(String a, int b, int c) {
		// TODO Auto-generated constructor stub
		this.name = a;
		this.id =b;
		this.age=c;
	}
	
	public StudentForm(String a, int b, StudentForm s) { //This is a copy constructor. This is used to copy data from one object to another.
		// TODO Auto-generated constructor stub          // in case of private states. The states of one object cannot be used in another. 
		this.name = a;                                   // For such situations a concept called copy constructor can be used.
		this.id =b;										// A copy constructor is an overloaded constructor that has reference(s) as parameters.
		this.age=s.age;
	}
	
	
	@Override
	public void name() {
		
		System.out.println("Student's name is "+ this.name);
		
	}
	@Override
	public void id() {
		
		
		System.out.println(this.name+"'s id is "+this.id);
	}
	@Override
	public void age() {
		
		
		System.out.println(this.name+"'s age is "+this.age);
		
	}
	@Override
	public void display() {
		this.name();
		this.id();
		this.age();
	}
}
public class StudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentForm s1 = new StudentForm("Raju", 1,18);
		s1.display();
		StudentForm s2 = new StudentForm("Bheem", 2, s1);
		s2.display();
		StudentServer s3 = new StudentForm("Chutki", 3, s2);
		s3.display();
		StudentServer s4 = new StudentForm("Monkkeee", 4, s2);
		s4.display();
		
		
	}

}
