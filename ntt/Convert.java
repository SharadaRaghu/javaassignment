package ntt;
import java.util.Scanner;

public class Convert {
	public static void main (String [] args)
	{
		Scanner scanner2 = new Scanner (System.in);
		System.out.println("enter first as integer");
		String str1 = scanner2.next();
		System.out.println("enter second as integer");
		String str2 = scanner2.next();
		System.out.println("Str to Int is :" + (Integer.parseInt(str1)+Integer.parseInt(str2)));
		
	}
	
	

}
