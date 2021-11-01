package com.test2;

import java.util.Scanner;

public class EnjoyRide {
	public static void main (String[] args)
	{
		int choice;
	
		System.out.println("Welcome to VillageFair");
		boolean loop = true;
   	    while (loop) 
   	    {
		 Scanner sc =new Scanner (System.in);
   	    System.out.println("Enter your choice from 1-4");
   	        System.out.println("1) Alibaba");
            System.out.println("2) Alpine slide"); 
            System.out.println("3) Bumper Cars");
            System.out.println("4) Baloon race");
   	 
   	  choice = sc.nextInt();
	 
	 switch (choice)
	 {
	 case 1 : 
		 Scanner scanner =new Scanner (System.in);
		 int adults;
		 System.out.println("Enter no of adults:" );
		 adults = scanner.nextInt();
		 int children;
		 System.out.println("Enter no of children:" );
		 children = scanner.nextInt();
		 int hours;
		 System.out.println("Enter no of hours:");
		 hours = scanner.nextInt();
		 int totalAdult = 50;
		 int totalChild = 40;
		 int one = adults*totalAdult;
		 int two = children*totalChild;
		 int total= one + two;
		 int sum = total * hours;
		 System.out.println("Adults ride fare:"+totalAdult+ "$");
		 System.out.println("Children ride fare:" +totalChild+ "$");
		 System.out.println("Total hours of ride:" +hours);
		 System.out.println("Total money collected:" +sum + "$");
		 break;
		
	 case 2:
		 Scanner scanner1 =new Scanner (System.in);
		 int adults1;
		 System.out.println("Enter no of adults" );
		 adults1 = scanner1.nextInt();
		 int children1 = 0;
		 System.out.println("Enter no of children:" );
		 children1 = scanner1.nextInt();
		 int hours1;
		 System.out.println("Enter no of hours:");
		 hours1 = scanner1.nextInt();
		 int totalAdult1 = 60;
		 int totalChild1 = 30;
		 int one1 = adults1*totalAdult1;
		 int two1 = children1*totalChild1;
		 int total1= one1 + two1;
		 int sum1 = total1 * hours1;
		 System.out.println("Adults ride fare:"+totalAdult1+ "$");
		 System.out.println("Children ride fare:" +totalChild1+ "$");
		 System.out.println("Total hours of ride:" +hours1);
		 System.out.println("Total money collected:" +sum1+ "$");
		 break;
	
	 case 3:
		 Scanner scanner2 =new Scanner (System.in);
		 int adults2;
		 System.out.println("Enter no of adults:" );
		 adults2 = scanner2.nextInt();
		 int children2;
		 System.out.println("Enter no of children:" );
		 children2 = scanner2.nextInt();
		 int hours2;
		 System.out.println("Enter no of hours:");
		 hours2 = scanner2.nextInt();
		 int totalAdult2 = 45;
		 int totalChild2 = 25;
		 int one2 = adults2*totalAdult2;
		 int two2 = children2*totalChild2;
		 int total2= one2 + two2;
		 int sum2 = total2 * hours2;
		 System.out.println("Adults ride fare:"+totalAdult2+ "$");
		 System.out.println("Children ride fare:" +totalChild2+ "$");
		 System.out.println("Total hours of ride:" +hours2);
		 System.out.println("Total money collected:" +sum2+ "$");
		 break;
		
	 case 4:
		 Scanner scanner3 =new Scanner (System.in);
		 int adults3;
		 System.out.println("Enter no of adults:" );
		 adults3 = scanner3.nextInt();
		 int children3;
		 System.out.println("Enter no of children:" );
		 children3 = scanner3.nextInt();
		 int hours3;
		 System.out.println("Enter no of hours:");
		 hours3 = scanner3.nextInt();
		 int totalAdult3 = 50;
		 int totalChild3 = 40;
		 int one3 = adults3*totalAdult3;
		 int two3 = children3*totalChild3;
		 int total3= one3 + two3;
		 int sum3 = total3 * hours3;
		 System.out.println("Adults ride fare:"+totalAdult3+ "$");
		 System.out.println("Children ride fare:" +totalChild3+ "$");
		 System.out.println("Total hours of ride:" +hours3);
		 System.out.println("Total money collected:" +sum3+ "$");
		 break;
		 
	 case 5:
		 Scanner scanner4 =new Scanner (System.in);
		 int adults4;
		 System.out.println("Enter no of adults:" );
		 adults4 = scanner4.nextInt();
		 int children4;
		 System.out.println("Enter no of children:" );
		 children4 = scanner4.nextInt();
		 int hours4;
		 System.out.println("Enter no of hours");
		 hours4 = scanner4.nextInt();
		 int totalAdult4 = 70;
		 int totalChild4 = 60;
		 int one4 = adults4*totalAdult4;
		 int two4 = children4*totalChild4;
		 int total4= one4 + two4;
		 int sum4= total4 * hours4;
		 System.out.println("Adults ride fare:"+totalAdult4+ "$");
		 System.out.println("Children ride fare:" +totalChild4+ "$");
		 System.out.println("Total hours of ride:" +hours4);
		 System.out.println("Total money collected:" +sum4+ "$");
		 break;
		 
		 default:
			    System.out.println("Enter your choice from 1-4");
	   	        System.out.println("1) Alibaba");
	            System.out.println("2) Alpine slide"); 
	            System.out.println("3) Bumper Cars");
	            System.out.println("4) Baloon race");
			  System.out.println("The choice is" +choice);
	 }
	 }
	 loop =false;
	 }
	}








