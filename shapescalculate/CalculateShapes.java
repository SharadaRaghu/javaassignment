package com.shapescalculate;

public class CalculateShapes {
	public static void main(String[] args)
	{
	SquareMethod s = new SquareMethod();
	s.area();
	System.out.println("integer : " + s.area(15));
	System.out.println("double : " + s.area(10.96));
	System.out.println("float : " + s.area(5.57f, 4.5f));
}

}
