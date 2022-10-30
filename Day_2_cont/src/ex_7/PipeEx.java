package ex_7;
import java.util.*;

public class PipeEx {
	public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        try
        {
            int n = Integer.parseInt(s.nextLine());
            if (99%n == 0)
                System.out.println(n + " is a factor of 99");
        }
        catch (NumberFormatException | ArithmeticException ex)
        {
            System.out.println("Exception :" + ex);
        }
        s.close();
    }

}
