package com.classroom_assignments;

class StudentForm {

	private String name;
	private int id;
	private int age;
	private String gender;

	public StudentForm(String a, int b, int c, String gender) {
		
		this.name = a;
		this.id = b;
		this.age = c;
		this.gender = gender;
	}

	public StudentForm(String a, int b, int c, StudentForm s) {
		// This is a copy constructor. This is used to copy data from
		// one object to another.
		// in case of private states. The states
		// of one object cannot be used in another.
		// For such situations a concept called copy constructor can be used.
		// A copy constructor is an overloaded constructor that has reference(s) as
		// parameters.
		this.gender = s.gender;
		this.name = a;
		this.id = b;
		this.age = c;

	}

	public StudentForm(String a, int b, StudentForm s, StudentForm s1) {

		this.name = a;
		this.id = b;
		this.age = s.age;
		this.gender = s1.gender;

	}

	public void name() {

		System.out.println("Student's name is " + this.name);

	}

	public void id() {

		System.out.println(this.name + "'s id is " + this.id);
	}

	public void age() {

		System.out.println(this.name + "'s age is " + this.age);

	}

	public void gender() {
		System.out.println(this.name + "'s gender is " + this.gender);

	}

	public void display() {
		this.name();
		this.id();
		this.age();
		this.gender();

	}

}

public class CopyConstructor {

	public static void separation() {
		System.out.println("____________________________________");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentForm s1 = new StudentForm("Raju", 1, 4, "Male");
		s1.display();
		separation();
		StudentForm s2 = new StudentForm("Bheem", 2, 17, s1);
		s2.display();
		separation();
		StudentForm s3 = new StudentForm("Chutki", 3, 17, "Female");
		s3.display();
		separation();
		StudentForm s4 = new StudentForm("Monika", 4, s2, s3);
		s4.display();
		separation();

	}

}
