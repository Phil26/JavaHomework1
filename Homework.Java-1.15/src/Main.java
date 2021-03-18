
public class Main {

	public static void main(String[] args)
	{
	
	double answer;
	
	Equation eq = new Equation(1, 2);
	try
	{
	eq.checkCoef();
	}
	catch(CustomExp e)
	{
		System.out.println("Custom Exception was throwed.");
		e.printStackTrace();
	}
	answer = eq.solve();
	Solution solution = new Solution();
	solution.display(answer);
		
	}

}
