package com.InheritanceEPAM;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EPAMRunnerComparable {
	public static void main(String[] args) {
		EPAMProgrammer ep1 = new EPAMProgrammer("1005", "Pravin");
		EPAMProgrammer ep2 = new EPAMProgrammer("1001", "Veena");
		EPAMProgrammer ep3 = new EPAMProgrammer("1004", "Bhavesh");
		EPAMProgrammer ep4 = new EPAMProgrammer("1003", "Anvi");
		EPAMProgrammer ep5 = new EPAMProgrammer("1002", "Anika");
//		ep.showIdentityCard();
//		ep.showCapabilities();
		
		List<EPAMEmployee> employeeList = new ArrayList<EPAMEmployee>();
		employeeList.add(ep1);
		employeeList.add(ep2);
		employeeList.add(ep3);
		employeeList.add(ep4);
		employeeList.add(ep5);
		System.out.println("Before sorting " +employeeList.toString());
		
		Collections.sort(employeeList);
		
		System.out.println("After sorting " +employeeList.toString());
	}

}
