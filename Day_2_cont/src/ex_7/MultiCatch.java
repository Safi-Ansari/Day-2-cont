package ex_7;
import java.util.*;

public class MultiCatch {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.println("Enter a number:");
			int n = sc.nextInt();
			sc.close();
			
			if(n > 0) {
				System.out.println("Positive number");
			}
			else if(n < 0){
				System.out.println("Negetive number");
			}
			else if(n == 1/0) {
				throw new ArithmeticException();
			}
			else {
				throw new IllegalArgumentException("Zero in neither positive or negetive");
			}
			
		}
		catch (ArithmeticException ae)
		{
			System.out.println("Exception: " + ae);
		}
		
		catch (IllegalArgumentException e) {
    	    System.out.println(e.getMessage());
       }
		catch (NullPointerException ae)
		{
			System.out.println("Exception: " + ae);
		}
	}
	

}
