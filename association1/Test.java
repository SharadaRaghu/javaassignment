package com.association1;

public class Test {

	
	public static void main (String[] args)
	{
		UndergradStudent ug = new UndergradStudent();
		ug.setName("Michael Scott");
		ug.setCity("Scranton");
		ug.StudentDetails();
		ug.setRollno(101);
		ug.setYear(2020);
		ug.UndergradStudentBranch();
		ug.UndergradStudentcollegeSociety();
		
		
		UndergradStudent ug1 = new UndergradStudent();
		ug1.setName("Dwight Schrute");
		ug1.setCity("Pennsylvania");
		ug1.StudentDetails();
		ug1.setRollno(102);
		ug1.setYear(2019);
		ug1.UndergradStudentBranch();
		
		
		UndergradStudent ug2 = new UndergradStudent();
		ug2.setName("Pam Halpert");
		ug2.setCity("Niagara");
		ug2.StudentDetails();
		ug2.setRollno(103);
		ug2.setYear(2021);
		ug2.UndergradStudentcollegeSociety();
		
	}
}
