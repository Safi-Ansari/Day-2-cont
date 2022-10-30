package ex_7;
import java.io.FileOutputStream;

public class TryWithResourse {
	
	public static void main(String args[]){   
		
		try(FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Safwathullah\\eclipse-workspace\\Day_2_cont")){
			
			String msg = "Welcome to Java!";   
			byte byteArray[] = msg.getBytes(); //converting string into byte array     
			fileOutputStream.write(byteArray);  
			System.out.println("Message written to file successfuly!"); 
			
			}
		
		catch(Exception exception){  
       System.out.println(exception);  
       }      
	}
	

}
