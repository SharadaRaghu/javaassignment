package com.calculate;
import java.util.Scanner;

import java.lang.reflect.Array;

public class MaxArray {
	
	public int max (int[] a )
	{
		int max =0;
		for (int i =0; i<a.length; i++)
		{
			if (a[i] > max)
			{
				max = a[i];
			}
		}
		return max;
	}
	
 public int min (int [] a )
{
	int min = a[0];
	for (int i =0; i<a.length; i++)
	{
		if (a[i] < min)
		{
			min = a[i];
		}
	}
	return min;
	
}
	public static void main(String [] args)
	{
		Scanner sc = new Scanner (System.in);
		int a[] = {5,10,12,15,25,35,105};
		MaxArray math = new MaxArray();
		
		System.out.println("Max element : " +  math.max(a));
		System.out.println("Min element :" +  math.min(a));
		System.out.println("enter random no 1:");
		int no1 = sc.nextInt();
		System.out.println("enter random no 2:");
		int no2 = sc.nextInt();
		if (no1>no2)
			{
				System.out.println(no1 + "is greater than " + no2);
			}
			else if (no2>no1)
			{
				System.out.println(no2 + "is greater than " + no1);	
		}
			else if (no1 == no2)
			{
				System.out.println(no1 + "is equal to " + no2);
			}
			else
			{
				System.out.println("Invalid numbers");
			}
		sc.close();
		
	}

}
