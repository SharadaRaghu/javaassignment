package com.association1;

public class UndergradStudent extends Student {
	
	private int year;

	public void setYear(int year) {
		this.year = year;
	}
	public void UndergradStudentBranch()
	{
		Branch b = new Branch();
		b.studiesBranch();
	}
	public void UndergradStudentcollegeSociety()
	{
		Society s = new Society();
		s.collegeSociety();
	}

}
