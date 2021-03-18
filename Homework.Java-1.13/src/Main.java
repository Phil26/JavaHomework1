import java.util.InputMismatchException;
import java.lang.Math;

public class Main 
{
		public static void main(String[] args)
		{
			App app1 = new App();
			int nr ;
			int sum = 0;
			
			try 
			{
				do
				{
				nr = app1.readNumber();
				}
				while((int)nr != nr);
					
			sum += nr;
			System.out.println("Suma:" + sum);	
			}		
			
		catch(InputMismatchException e)
			{
			System.out.println("Input mismatch detected.");
			try 
			{
				try 
				{
					nr = app1.readNumber();
				} 
				catch (Exception e1) {
			    e1.printStackTrace();
				}
			
			}
			catch (Exception e1) 
			{
				e1.printStackTrace();
			}
			}
			
			catch(Exception e)
			{
				System.out.println("Error detected.");
				try 
				{
					nr = app1.readNumber();
				} 
				catch (Exception e1) 
				{
					
					e1.printStackTrace();
				
				}
			
			}
			
		}
}	


