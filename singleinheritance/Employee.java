package com.singleinheritance;

public class Employee extends Human {
	
	private int id;
	private double salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public static void main (String [] args)
	{
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		e1.setName("sharada");
		e1.setId (12);
		e1.setSalary(25000);
		e2.setName("sahana");
		e2.setId (13);
		e2.setSalary(25500);
		e3.setName("aakarshan");
		e3.setId (14);
		e3.setSalary(26000);
		System.out.println(e1.getName()  + "  " + "|" + e1.getId() + "  "+"|"  + "|" +e1.getSalary()+ "   ");
		System.out.println(e2.getName()  + "  " + "|" +e2.getId() + "  "+ "|"  + "|" +e2.getSalary()+ "   ");
		System.out.println(e3.getName()  + "  " +"|" + e3.getId() + "  "+ "|" + "|" +e3.getSalary()+ "   ");
		
	}

}
