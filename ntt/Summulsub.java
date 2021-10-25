package ntt;
import java.util.Scanner;
import java.util.*;

public class Summulsub {
	
	public static int add (int b[])
	{
	int sum = 0;
	for (int i=0; i<b.length; i++)
	{
		sum = sum + b[i];
	}
	return sum;
	}
	public static int multiply (int c[])
	{
		int m =1;
		for(int i =0; i<c.length; i++)
		{
			m = m * c [i];
			
		}
		return m;
	}
	public static int sub (int d[])
	{
	int sub = 0;
	for (int i=0; i<d.length; i++)
	{
		sub = sub - d[i];
	}
	return sub;
	}
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner (System.in);
		int [] a = new int [scanner.nextInt()];
		for ( int i=0; i<a.length; i++)
		{
			a[i] = scanner.nextInt();
		}
		System.out.println("addition" + " "+ add(a));
		System.out.println("multiplication" + " " + multiply(a));
		System.out.println("subtraction" + " "+ sub(a));
		scanner.close();
	}
}
