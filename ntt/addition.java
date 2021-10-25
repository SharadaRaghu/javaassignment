package ntt;
import java.util.Scanner;
public class addition
{
	public static void main (String[] args) 
	{
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Enter no1:");
		int no1 = scanner.nextInt();
		System.out.print("Enter no2:");
		int no2 = scanner.nextInt();
		
		
		int sum = no1 + no2;
		System.out.println("Sum of " + no1 + "and" + no2 + "is" + sum);
		int sub = no1 - no2;
		System.out.println("Sub of " + no1 + "and" + no2 + "is" + sub);
		int mul = no1 * no2;
		System.out.println("Mul of " + no1 + "and" + no2 + "is" + mul);
		int div = no1 / no2;
		System.out.println("Div of " + no1 + "and" + no2 + "is" + div);
		
		scanner.close();
	}

}
