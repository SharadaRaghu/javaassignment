package ntt;

import java.util.Scanner;

public class ConvertStr1 {
	public static void main (String [] args)
	{
		Scanner scanner1 = new Scanner (System.in);
		System.out.println("enter first as double");
		String str1 = scanner1.next();
		System.out.println("enter second as double");
		String str2 = scanner1.next();
		System.out.println("Str to Double is :" + (Double.parseDouble(str1) - Double.parseDouble(str2)));
	}

}
