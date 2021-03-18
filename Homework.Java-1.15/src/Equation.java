import java.lang.Exception;
import java.lang.ArithmeticException;


public class Equation extends Coeficienti
{
    float coef1, coef2;
	double x;
	double inf = Double.POSITIVE_INFINITY;
	
	Equation()
	{
	//	System.out.println("Ecuatia are forma: 0 * x + 0 = 0");
	}
	
	Equation(float n1, float n2)
	{
		
	this.coef1 = n1;
	this.coef2 = n2;
		
	System.out.println("Ecuatia are forma:" + this.coef1 + " * x " + "+ " +  this.coef2 +  " = 0");
	}
	
	void checkCoef() throws CustomExp
	{
		if(this.coef1 == 0)
		{
			throw new CustomExp("Atentie.Coeficientul lui x este nul.");
		}
		else
		{
			System.out.println("Coeficientul lui x este diferit de 0.Continua...");
		}
		
	}
	
	
	double solve()
	{	
	
		try {
		
		if(this.coef1 == 0)
		{
			System.out.println("Ecuatia nu are solutie.");
			x = inf - inf;        //am dorit sa exprim valoarea de eroare a lui x in acest caz(=> NaN)
		}
		
		else
		{
		x = -coef2 / coef1;	
		}
		
	}
		
	catch(ArithmeticException e)
		{
		System.out.println("Arithmetic exception occurred.Division by 0 detected.");
		e.printStackTrace();
		}
		
		return x;
	}
	
	
	
}
