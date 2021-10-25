package com.mobile;

public class MobileMain extends Mobileproperties
{
	public void display()
	{
		System.out.println("Mobile costs 12000");
		System.out.println("Mobile was bought from amazon");
		System.out.println("Mobile belongs to Samsung company");
	}
	public static void main (String [] args)
	{
		MobileMain m = new MobileMain();
		m.show();
		m.display();
		
	}
}
	
