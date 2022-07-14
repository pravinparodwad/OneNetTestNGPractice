package com.InheritanceEPAM;

public class EPAMEmployee implements Comparable<EPAMEmployee>{
	
	private String employeeId;
	private String employeeName;
	
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public EPAMEmployee(String employeeId, String employeeName) {
		System.out.println("EPAM Employee constructor called");
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}

	public void showIdentityCard() {
	System.out.println("Employee can show identity card.");	
	}
	@Override
	public int compareTo(EPAMEmployee o) {
		if(this.employeeId.compareTo(o.employeeId) > 0) {
			return -1;
		}
		else if(this.employeeId.compareTo(o.employeeId) < 0){
			return 1;
		}
		else {
			return 0;
		}
	}
	
	public String toString() {
		return this.employeeId+ " "+ this.employeeName;
	}
}
