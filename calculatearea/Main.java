package com.calculatearea;

public class Main {
	public static void main (String [] args)
	{
		Square s = new Square();
		s.sqArea(10);
		Rectangle r = new Rectangle();
		r.reArea(10,20);
		SquarePerimeter sp = new SquarePerimeter();
		sp.sqPerimeter(5);
		RectPeri rp =new RectPeri();
		rp.recPerimeter(20,30);
	}
	

}
