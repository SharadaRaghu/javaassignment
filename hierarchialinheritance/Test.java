package com.hierarchialinheritance;

public class Test {

	
	public static void main (String [] args) 
	{
		Restaurant rs = new Restaurant();
		Chinese c =new Chinese();
		Mexican m = new Mexican();
		Italian i = new Italian();
		
		rs.ingredient();
		rs.vegetable();
		c.noodles();
		m.nacho();
		i.pasta();
	}
}
