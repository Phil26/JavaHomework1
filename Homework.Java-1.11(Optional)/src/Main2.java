
@author Filip Neagoe

// Exceptia este aruncata

import java.util.ArithmeticException;
import java.util.Scanner;

public class Main2 
{

	public static double method(int x) throws ArithmeticException 
	{
		int rez;
		
		rez = 10/x;
	
		return rez;	
	}	

	public static void main(String[] args)
	{
		int x;
		System.out.println("x:" );
		Scanner scanner = new Scanner(System.in);
		x = scanner.nextInt();
		try 
		{
		double answer = method(x);
		System.out.println("Answer: " + answer);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic error detected.");
			e.printStackTrace();
		}
		catch(Exception e)
		{
			System.out.println("Error occured.");
			e.printStackTrace();
		}
		
	}
	
}

