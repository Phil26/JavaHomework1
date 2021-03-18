import java.lang.Exception;
import java.lang.Math;


	public class Equation extends Coeficienti
	{
	    float coef1, coef2, coef3;
		double x1, x2;
		double inf = Double.POSITIVE_INFINITY;
		
		Equation()
		{
		//	System.out.println("Ecuatia are forma: 0 * x + 0 = 0");
		}
		
		Equation(float n1, float n2, float n3)
		{
			
		this.coef1 = n1;
		this.coef2 = n2;
		this.coef3 = n3;
			
		System.out.println("Ecuatia are forma:" + this.coef1 + " * x ^ 2 " + "+ " +  this.coef2 +  " * x +" + this.coef3  + "= 0");
		}
		
		void checkCoef() throws CustomExp
		{
			if(this.coef1 == 0 && this.coef2 == 0)
			{
				throw new CustomExp("Atentie.Coeficientii lui x ^ 2, respectiv x sunt nuli.");

				
			}
			else
			{
				System.out.println("Toti coeficientii sunt nenuli.Continua...");
			}
			
		}
		
		
		 void solve()
		{	
		
			try {
			
			if(coef1 == 0)
			{
				System.out.println("Ecuatia se reduce la o ecuatie de gradul 1.");
				x1 = -coef3 / coef2;
			}
			
			else
			{
			System.out.println("Se va calcula delta: ");
			double delta = (coef2 * coef2) - 4 * coef1 * coef3;
			
			if(delta > 0)
			{
				System.out.println("Ecuatia are doua solutii distincte: ");
				x1 = (-coef2 + Math.sqrt(delta)) / 2 * coef1;
				x2 = (-coef2 - Math.sqrt(delta)) / 2 * coef1;
			}
			
			else if(delta == 0)
			{
				System.out.println("Solutiile ecuatiei sunt egale.");
				x1 = -coef2 / 2 * coef1;
				x2 = x1;
			}
			
			else {
				System.out.println("Delta < 0 -> solutii irationale.");
				System.out.println("x1 = (" + -coef2 + " + i * " + Math.sqrt(delta) + ")" + "/ " + 2 * coef1);
			    System.out.println("x1 = (" + -coef2 + " - i * " + Math.sqrt(delta) + ")" + "/ " + 2 * coef1);
			}
			
			
			}
			
		}	
			
		catch(ArithmeticException e)
			{
			System.out.println("Arithmetic exception occurred.Division by 0 detected.");
			e.printStackTrace();
			}
			
			System.out.println("x1 = " + x1);
			System.out.println("x2 = " + x2);
		}
		
		
		
	}



