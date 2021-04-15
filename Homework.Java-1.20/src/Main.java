


import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.Exception;

public class Main 
{

	public static void main(String[] args) 
	{	
	float t1 = 0;
	float t2 = 0;
	
	try
	{
	System.out.println("Introduceti termenii");
	System.out.println("Termen 1:");
	Scanner scanner = new Scanner(System.in);
	t1 = scanner.nextFloat();
	System.out.println("Termen 2:");
	t2 = scanner.nextFloat();
	System.out.println("Suma termenilor t1 = " + t1 + " si t2 = " + t2 + " este " + Sum.Sum(t1, t2) + ".");
	}
	
	catch(InputMismatchException e)
	{
		System.out.println("Atentie: Termenii introdusi nu corespund formatului!");
		System.out.println("Suma = " + null);
		e.printStackTrace();
	}
	
	catch(Exception e)
	{
		System.out.println("An error has occurred.");
		System.out.println("Suma = " + null);
		e.printStackTrace();
	}
	
	}

}
