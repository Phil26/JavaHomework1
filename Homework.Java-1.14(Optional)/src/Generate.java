import java.util.Random;
import java.util.ArrayList;
import java.lang.Exception;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.ArithmeticException;

public class Generate 
{
 
	public static ArrayList<Integer> generate()
		{
		
			Random random = new Random();
			ArrayList <Integer> array = new ArrayList<Integer>();
			int x[];
			int numbers[];
			x = new int[100];
			numbers = new int[100];
			try 
			{
			for(int i = 0; i < 100; i++)
			{
			x[i] = random.nextInt(100);			
			numbers[i] =  100 / x[i];
			array.add(numbers[i]);
			}
			}
			
			catch(ArithmeticException e)
			{
				System.out.println("Arithmetic error occurred.Division by 0.");
				e.printStackTrace();
			}
			
			catch(ArrayIndexOutOfBoundsException e1)
			{
				System.out.println("Warning: the accessed index exceeded the array size.");
				e1.printStackTrace();
			}
			
			catch(Exception e2)
			{
				System.out.println("Exception occurred.");
				e2.printStackTrace();
			}
			
			return array;
		  
		}
}