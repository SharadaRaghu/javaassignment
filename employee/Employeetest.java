
package com.employee;

public class Employeetest {
	public static void main (String [] args)
	{
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		Employee e4 = new Employee();
		e1.setName("shizuka");
		e1.setAge(25);
		e1.setGender("female");
		e1.setSalary(25000);
		e2.setName("nobita");
		e2.setAge(24);
		e2.setGender("male");
		e2.setSalary(24000);
		e3.setName("suniyo");
		e3.setAge(21);
		e3.setGender("male");
		e3.setSalary(20000);
		e3.setName("jian");
		e3.setAge(27);
		e3.setGender("male");
		e3.setSalary(18000);
		System.out.println("Employee details are as follows:");
		System.out.println(e1.getName()  + "  " + "|" + e1.getAge() + "  "+"|" + e1.getGender()+ "  " + "|" +e1.getSalary()+ "   ");
		System.out.println(e2.getName()  + "  " + "|" +e2.getAge() + "  "+ "|" +e2.getGender()+ "  " + "|" +e2.getSalary()+ "   ");
		System.out.println(e3.getName()  + "  " +"|" + e3.getAge() + "  "+ "|" +e3.getGender()+ "  " + "|" +e3.getSalary()+ "   ");
		System.out.println(e4.getName()  + "  " + "|" +e4.getAge() + "  "+ "|" +e4.getGender()+ "  " + "|" +e4.getSalary()+ "   ");
	}

}
