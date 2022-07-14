package com.InheritanceEPAM;

public class EPAMProgrammer extends EPAMEmployee{
	private String capabilities;
	public String getCapabilities() {
		return capabilities;
	}

	public void setCapabilities(String capabilities) {
		this.capabilities = capabilities;
	}

	public EPAMProgrammer(String employeeId, String employeeName) {
		super(employeeId, employeeName);
		this.capabilities = "Can code";
	}
	
	public void showCapabilities() {
		System.out.println("Capabilities are "+this.capabilities);
	}


}
