package com.association;

public class CarTest {
	
	public static void main (String [] args)
	{
		Honda hondaAmaze = new Honda();
		hondaAmaze.setColor("Black");
		hondaAmaze.setSpeed(150);
		hondaAmaze.CarDetails();
		hondaAmaze.HondaMusicPlayer();
		hondaAmaze.HondaStartEngine();
		
		
		Honda hondaCivic = new Honda();
		hondaCivic.setColor("Red");
		hondaCivic.setSpeed(200);
		hondaCivic.CarDetails();
		hondaCivic.HondaStartEngine();
		
		
				
	}

}