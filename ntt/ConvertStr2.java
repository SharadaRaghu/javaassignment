package ntt;

import java.util.Scanner;

public class ConvertStr2 {
	public static void main (String []args)
	{
		Scanner scanner = new Scanner (System.in);
		System.out.println("enter first string");
		String str1 = scanner.next();
		System.out.println("enter second string");
		String str2 = scanner.next();
		System.out.println("Str to float is : " + Float.parseFloat(str1)/Float.parseFloat(str2) );
		scanner.close();
	}

}
