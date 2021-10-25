package ntt;
import java.util.Scanner;

public class switchcase {
	         public static void main (String[] args)
	         {
	        	 int choice;
	        	 boolean loop = true;
	        	 while (loop)
	        	 {
	        	 Scanner sc =new Scanner (System.in);
	        	 System.out.println("Enter your choice");
	        	 System.out.println("1) Add 2 no’s"
	                    + "2) Find average of 2 numbers"
	        	 		+ "3) Check even/odd"
	        	 		+ "4) Check positive or negative number"
	        	 		+ "5) check prime no or not "
	        	 		+ "6) Quit- use exit(0)"
	        	 		);
	        	 choice = sc.nextInt();
	        	 
	        	 switch (choice)
	        	 {
	        	 case 1 :
	     			Scanner scanner = new Scanner (System.in);
	     			System.out.print("Enter no1:");
	     			int no1 = scanner.nextInt();
	     			System.out.print("Enter no2:");
	     			int no2 = scanner.nextInt();
	     			int sum = no1 + no2;
	     			System.out.println("Sum of " + no1 + "and" + no2 + "is" + sum);
	     			break;
	     			
	     		case 2 :
	     			Scanner scanner1 = new Scanner (System.in);
	     			System.out.print("Enter no1:");
	     			int num1 = scanner1.nextInt();
	     			System.out.print("Enter no2:");
	     			int num2 = scanner1.nextInt();
	     			float total = num1 + num2;
	     			float average = total / 2 ;
	     			System.out.println("Avg of " + num1 + "and" + num2 + "is" + average);
	     			break;
	     			
	     		case 3:
	     			Scanner scanner2 = new Scanner (System.in);
	     			System.out.print("Enter no1:");
	     			int numb1 = scanner2.nextInt();
	     			if (numb1 % 2 == 0)
	     			{
	     				System.out.println("It's even");
	     			}
	     				else
	     				{
	     					System.out.println("It's Odd");
	     				}
	     			break;
	     			
	     		case 4:
	     			Scanner scanner3 = new Scanner (System.in);
	     			System.out.print("Enter no1:");
	     			int numb2 = scanner3.nextInt();
	     			if (numb2 > 0)
	     			{
	     				System.out.println("It's positive");
	     			}
	     			else
	     			{
	     				System.out.println("It's negative");
	     			}
	     			break;
	     			
	     		case 5 :
	     			int temp;
	     			boolean prime = true;
	     			Scanner scanner4 = new Scanner (System.in);
	     			System.out.print("Enter no1:");
	     			int numb3 = scanner4.nextInt();
	     			for (int i = 2; i <= numb3; i++)
	     			{
	     				temp = numb3%i;
	     				if (temp ==0)
	     				{
	     					prime = false;
	     					break;
	     				}
	     				if (prime)
	     					System.out.println(numb3 + "is prime");
	     				else
	     					System.out.println(numb3 + "is not prime");
	     			}
	     			break;
	     			
	     		case 6 :
	    			
	    			System.out.println("You exited");
	    			System.exit(0);
	    		default : System.out.println("Enter from choice 1-6");
		    		System.out.println("\"1) Add 2 no’s"
        	 		+ "				+ \"2) Find average of 2 numbers"
        	 		+ "				+ \"3) Check even/odd"
        	 		+ "				+ \"4) Check positive or negative number"
        	 		+ "				+ \"5) check prime no or not "
        	 		+ "				+ \"6) Quit- use exit(0)"
        	 		+ "				");
        	 }
         System.out.println("The choice is" +choice);
         //break;//
	         }
	        	 loop =false;
	         }
	         }
	        	 


	


