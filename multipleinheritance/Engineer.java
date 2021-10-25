package com.multipleinheritance;

import com.singleinheritance.Employee;

public class Engineer extends Employee1 {
	
	private String designation;

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public static void main (String [] args)
	{
		Engineer e1 = new Engineer();
		Engineer e2 = new Engineer();
		Engineer e3 = new Engineer();
		e1.setName("sharada");
		e1.setId (12);
		e1.setSalary(25000);
		e1.setDesignation("Frontend Engineer");
		e2.setName("sahana");
		e2.setId (13);
		e2.setSalary(25500);
		e2.setDesignation("Backend Engineer");
		e3.setName("aakarshan");
		e3.setId (14);
		e3.setSalary(26000);
		e3.setDesignation("Cloud Engineer");
		System.out.println(e1.getName()  + "  " + "|" + e1.getId() + "  "+"|"  + "|" +e1.getSalary()+ "   " + "|" + e1.getDesignation() + " ");
		System.out.println(e2.getName()  + "  " + "|" +e2.getId() + "  "+ "|"  + "|" +e2.getSalary()+ "   " + "|" + e2.getDesignation() + " "  );
		System.out.println(e3.getName()  + "  " +"|" + e3.getId() + "  "+ "|" + "|" +e3.getSalary()+ "   " + "|" + e3.getDesignation() + " ");
		
	}

}
