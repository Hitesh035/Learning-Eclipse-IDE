package com.object_class;

class EmployeeCreation {
	String eName;
	int eId;
	int eAge;
	String dept;
	double salary;

	public EmployeeCreation(String eName, int eId, int eAge, String dept, double salary) {
		super();
		this.eName = eName;
		this.eId = eId;
		this.eAge = eAge;
		this.dept = dept;
		this.salary = salary;
	}

	public void employeeDetailsDisplay() {
		System.out.println("Employee Name:" + this.eName);
		System.out.println("Employee Id:" + this.eId);
		System.out.println("Employee Age:" + this.eAge);
		System.out.println("Employee Dept.:" + this.dept);
		System.out.println("Employee Salary:" + this.salary);
	}

}

public class EmployeeDetails {

	public static void partition() {
		System.out.println("_________________________________");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeCreation e1 = new EmployeeCreation("Balram", 1275, 24, "R&D", 120071.43);
		e1.employeeDetailsDisplay();
		partition();
		EmployeeCreation e2 = new EmployeeCreation("Mina", 1373, 24, "Finance", 130071.43);
		e2.employeeDetailsDisplay();
		partition();
		EmployeeCreation e3 = new EmployeeCreation("Sia", 1461, 24, "Production", 100342.43);
		e3.employeeDetailsDisplay();
		partition();
	}

}
