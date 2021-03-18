import java.util.Scanner;

public class Coeficienti 
{
	
		protected float a, b, c;
		
		Coeficienti()
		{
			this.a = 0;
			this.b = 0;
			this.c = 0;
		}
		
		Coeficienti(float a, float b, float c)
		{
			this.a = a;
			this.b = b;
			this.c = c;
		}
		
		float getCoef1()
		{
			return this.a;
		}
		
		float getCoef2()
		{
			return this.b;
		}
		
		float getCoef3()
		{
			return this.c;
		}
			
		
		void setCoef(float a, float b, float c)
		{
			this.a = a;
			this.b = b;
			this.c = c;
		}
		
		
		public void readCoef()
		{
			System.out.println("Introduceti coeficientul:");
			Scanner scanner = new Scanner(System.in);
			this.a = scanner.nextFloat();
			this.b = scanner.nextFloat();
			this.c = scanner.nextFloat();
			
		}
		
	}
		
		
		
		
	
