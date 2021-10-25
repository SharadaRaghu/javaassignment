package com.association1;

public class Student {
	
	private String name;
	private String city;
	private int rollno;
	public void setName(String name) {
		this.name = name;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public void StudentDetails()
	{
		System.out.println("Student's name is " + name  + " | Student's city is " + city + " | Student's rollno is " + rollno);
	}

}
