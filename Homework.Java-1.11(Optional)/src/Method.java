
public class Method {

	public static double method(int x)
	{
		int rez;
		try 
		{
		rez = 10/x;
		} 
		catch (ArithmeticException e) 
		{
		System.out.println("Impartire prin 0. b=0");
		rez = 0;
		e.printStackTrace();
		}
		catch (Exception e) 
		{
		rez = -1;
		System.out.println("Eroare generala");
		e.printStackTrace();
		}
		
		return rez;
		
	}	
		
	}

