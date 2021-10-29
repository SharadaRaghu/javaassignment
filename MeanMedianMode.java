package com.default1;
import java.util.ArrayList;
import java.util.List;



public class MMM {
	
	public static int sumOfArray(Integer[] a, int n)
    {
        if (n == 0)
            return a[n];
        else
            return a[n] + sumOfArray(a, n - 1);
    }
	 
	
	public static void main (String [] args)
	{
		// 1. sum
		
		 List<Integer> al = new ArrayList<Integer>();
		    al.add(1);
	        al.add(2);
	        al.add(3);
	        al.add(4);
	        al.add(5);
	     
	      		
	     System.out.print("Elements in List are : " +al );
	     
	     System.out.println();
	    
	     Integer a[] = new Integer[al.size()];
	     al.toArray(a);// toarray method to convert arraylist to array
	     
	     for (Integer obj : a) 
	     {
	  	  System.out.println(obj + " ");
	     }
	     
	     int sum = sumOfArray(a, a.length - 1); // store sum in a var
	     System.out.println("Sum of elements  : " + sum);
	     
	     
	     //2. Mean
	     
	     ArrayList<Integer> summ = new ArrayList<Integer>();
	      summ.add(10);
	      summ.add(15);
	      summ.add(20);
	      summ.add(25);
	      summ.add(30);
	      int total =0;
	      float mean;
	      for (int i=0; i<summ.size(); i++)
	      {
	    	  total += summ.get(i);
	      }
	    	  mean = total / summ.size();
	    	  System.out.println("Mean of elements  : " +mean);
	      
	      
	      
	      //3.Median
	    	  
	  List <Integer> list = new ArrayList<Integer>();
	  list.add(1);
	  list.add(2);
	  list.add(3);
	  list.add(4);
	  list.add(5);
	  list.add(6);
	  for (int i =0; i<=list.size(); i++)
	  {
		 //System.out.println(list);
	  }
	  int mid = list.size()/2;
	  Integer middle = list.get(mid);
	  System.out.println("Median of the elements : "+middle);
	     
	      
	      
	      
	}

}
