package ex_6;
import java.util.*;


public class SqRoot {
	
	 public static void main(String[] args) {
		 
	       try {
	    	   
	    	   int num;
			   double square;
		       Scanner s = new Scanner(System.in);
		       System.out.println("Enter number:");
		       num = s.nextInt();
		       s.close();
		       if (num < 0){                     
		    	   throw new IllegalArgumentException("Input cannot be negative.");
		       }
		       
		       square = Math.sqrt(num);
		       System.out.println("Square of "+num+" is: " + square);
		       System.out.println();
		       
	       }
	       
	       catch (IllegalArgumentException e) {
	    	    System.out.println(e.getMessage());
	       }
	   	}

}
