package ntt;
import java.util.Scanner;

public class Addarray {
	public static int add (int r[], int q[])
	{
		int sum3 =0, sum1=0, sum2=0;
		for (int i =0; i<r.length; i++)
		{
			sum2 = sum2 + r[i];
		}
		for (int i =0; i<q.length; i++)
		{
			sum1 = sum1 + q[i];
		}
		sum3 = sum2 + sum1;
		return sum3;
	}
	public static void main (String args[])
	{
		Scanner scanner2 = new Scanner (System.in);	
		System.out.println("Enter size + elements of 1st array :");
		int [] a = new int [scanner2.nextInt()];
		for ( int i=0; i<a.length; i++)
		{
			a[i] = scanner2.nextInt();
		}
		System.out.println("Enter size + elements of 2nd array :");
		int [] b = new int [scanner2.nextInt()];
		for (int i=0; i<b.length; i++)
		{
			b[i] = scanner2.nextInt();
		}
		System.out.println("Addition" + " " + add(a,b));
		scanner2.close();
	}
}
