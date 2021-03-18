import java.util.InputMismatchException;
import java.util.Scanner;

	public class App 
	{
		
		public int readNumber() throws InputMismatchException, Exception
		{
	      	 System.out.println("Input a number: ");	
		     Scanner in = new Scanner(System.in);
		     return in.nextInt();
		}
	}

