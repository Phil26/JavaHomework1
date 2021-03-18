import java.util.Scanner;

public class Coeficienti
{

	protected float a, b;
	
	Coeficienti()
	{
		this.a = 0;
		this.b = 0;
	}
	
	Coeficienti(float a, float b)
	{
		this.a = a;
		this.b = b;
	}
	
	float getCoef1()
	{
		return this.a;
	}
	
	float getCoef2()
	{
		return this.b;
	}
	
	void setCoef(float a, float b)
	{
		this.a = a;
		this.b = b;
	}
	
	
	public void readCoef()
	{
		System.out.println("Introduceti coeficientul:");
		Scanner scanner = new Scanner(System.in);
		this.a = scanner.nextFloat();
		this.b = scanner.nextFloat();
		
	}
	
}
