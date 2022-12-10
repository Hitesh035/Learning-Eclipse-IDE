package com.dtoClasses;

import java.io.Serializable;

public class EmployeeDTO implements Serializable{
	
	private String eName;
	private String dob;
	private String contactNo;
	private String dept;
	private String desgn;
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDesgn() {
		return desgn;
	}
	public void setDesgn(String desgn) {
		this.desgn = desgn;
	}
	@Override
	public String toString() {
		return this.eName+ " " +this.dob+" "+ this.contactNo+" "+this.dept+" "+this.desgn;
	}
}
