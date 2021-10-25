package com.abstraction2;

public class TestClass extends ClassD {
       void showA()
       {
    	   System.out.println("Overriden by B");
       }
       void showB() 
       {
    	   System.out.println("Overriden by C");
		
	    }
       void showC()
       {
    	   System.out.println("Overriden by D");
       }

       
       public static void main(String[] args)
       {
    	   TestClass c = new TestClass();
    	   c.showA();
    	   c.showB();
    	   c.showC();
    	   
       }
}
