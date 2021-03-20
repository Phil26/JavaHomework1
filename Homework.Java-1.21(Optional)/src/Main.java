
public class Main {

	public static void main(String[] args)
	{
	
	double answer1, answer2;
	
	try
	{
	Equation eq = new Equation();
	eq.readCoef();
	eq.checkCoef();
	eq.solve();
	}
	catch(CustomExp e)
	{
		System.out.println("Custom Exception was throwed.");
		e.printStackTrace();
	}
	
	}

}
