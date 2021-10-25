package ntt;
import java.util.Scanner;

public class elseifcondition
{
	public static void main(String[] args)
	{
		
		Scanner scanner = new Scanner (System.in);
		System.out.print("Enter 1st subject : ");
		int sub1 = scanner.nextInt();
		System.out.print("Enter 2nd subject : ");
		int sub2 = scanner.nextInt();
		System.out.print("Enter 3rd subject : ");
		int sub3 = scanner.nextInt();
		scanner.close();
		double perc = (sub1+sub2+sub3) / 3.0;
		System.out.println("Percentage is :" + perc);
		
		if (perc>90 && perc<100)
		{
			System.out.println("grade A+");
		}
		else if (perc>80 && perc<90)
		{
			System.out.println("grade A");
		}
		else if (perc>70 && perc<80)
		{
			System.out.println("grade B+");
		}
		else if (perc>60 && perc<70)
		{
			System.out.println("grade B");
		
		}
		else if (perc>50 && perc<60)
		{
			System.out.println("grade C");
		
		}
		else if (perc>40 && perc<50)
		{
			System.out.println("grade D");
		
		}
		 else if (perc>0 && perc<40)
		{
			System.out.println("fail");
		
		}
		else if (perc<0 || perc>100)
		{
			System.out.println("Invalid marks");
		
		}
	}

}

