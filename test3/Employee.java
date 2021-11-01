package com.test3;

import java.util.Scanner;
import java.util.*;

public class Employee
{
	private static double calculateNetSalary(double basicsalary, int tax)
	{
		double specialallowance ;
		double transportallowance;
		double hra;
		if (basicsalary<=10000)
		{
			hra = 0.2*basicsalary;
			transportallowance = 0.20*basicsalary;
			specialallowance = 0.80*basicsalary;
			return (basicsalary+hra+specialallowance+transportallowance)-tax;
		}
		else if (basicsalary>=10001 && basicsalary>=20000 )
		{
			hra = 0.25*basicsalary;
			transportallowance = 0.20*basicsalary;
			specialallowance = 0.90*basicsalary;
			return (basicsalary+hra+specialallowance+transportallowance)-tax;
		}
		else
		{
			hra = 0.3*basicsalary;
			transportallowance = 0.20*basicsalary;
			specialallowance = 0.95*basicsalary;
			return (basicsalary+hra+specialallowance+transportallowance)-tax;
		}
		
		
	}

public static void main (String[] args)
 
{
	int employeeid;
	String employeename;
	double  basicsalary;
	int tax=2500;
	
	Scanner scanner = new Scanner (System.in);
	System.out.println("Enter Employee ID: ");
	employeeid = scanner.nextInt();
	System.out.println("Enter Employee name : ");
	employeename = scanner.next();
	System.out.println("Enter Basic Salary :");
	basicsalary = scanner.nextDouble();
	
	double netsalary=calculateNetSalary(basicsalary, tax);
	System.out.println("Employee's ID is :" +employeeid);
	System.out.println("Employee's Name is :" +employeename);
	System.out.println("Employee's Basic Salary is :" +basicsalary);
	System.out.println("Employee's Net Salary is :" +netsalary);
			
	scanner.close();
	

}
	    

}