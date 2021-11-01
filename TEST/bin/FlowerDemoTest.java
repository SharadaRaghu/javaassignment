package com.test1;

public class FlowerDemoTest {

	public static void main (String[] args)
	{
		
		System.out.println("Continent + Country + National Flowers Name as Follows");
		System.out.println("--------------");
		FlowerDemo f1 =  new FlowerDemo();
		f1.setContinent("Asia");
		System.out.println("Continent Name: "+f1.getContinent());
		f1.displayFlower();
		f1.displayFlower1();
		f1.displayFlower2();
		
		System.out.println("--------------");
		System.out.println("🌺");
		
		
		FlowerDemo f2 = new FlowerDemo();
		f2.setContinent("Europe");
		System.out.println("Continent Name: "+f2.getContinent());
		f2.displayFlower3();
		f2.displayFlower4();
		f2.displayFlower5();
		
		System.out.println("--------------");
		System.out.println("🌺");
		
		FlowerDemo f3 = new FlowerDemo();
		f3.setContinent("Africa");
		System.out.println("Continent Name: "+f3.getContinent());
		f3.displayFlower6();
		f3.displayFlower7();
		f3.displayFlower8();
		
		System.out.println("--------------");
		System.out.println("🌺");
		
	}
}
