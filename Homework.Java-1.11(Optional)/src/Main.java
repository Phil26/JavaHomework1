/*  Exceptia este tratata in corpul functiei
 
import java.util.ArithmeticExpression;
import java.util.Scanner;

public class Main {

	public static double method(int x)
	{
		int rez;
		
		try 
		{
		rez = 10/x;
		} 
		catch (ArithmeticException e)    // tratare exceptie particulara
		{
		System.out.println("Error occured.Division by 0 was attepmted.");
		rez = 0;
		e.printStackTrace();
		}
		catch (Exception e)              //tratare exceptie generala
		{
		System.out.println("An error has occured during this operation.");
		rez = -1;
		e.printStackTrace();
		}
		
		return rez;	
	}	

	public static void main(String[] args)
	{
		int x;
		System.out.println("x:" );
		Scanner scanner = new Scanner(System.in);
		x = scanner.nextInt();
		double answer = method(x);
	    System.out.println("Answer: " + answer);
	}
	
}

*/