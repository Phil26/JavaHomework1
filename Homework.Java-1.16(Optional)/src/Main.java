
public class Main {

	public static void main(String[] args)
	{
	
	double answer1, answer2;
	
	Equation eq = new Equation(2, 3, 1);
	try
	{
	eq.checkCoef();
	}
	catch(CustomExp e)
	{
		System.out.println("Custom Exception was throwed.");
		e.printStackTrace();
	}
	eq.solve();
		
	}

}
