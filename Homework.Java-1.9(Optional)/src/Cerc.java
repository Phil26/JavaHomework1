import java.util.Scanner;

public class Cerc implements Shape
{

	int raza;
	final double PI = 3.14;
	double area;
	
	public void getArea()
	{
		System.out.println("Introdu raza: ");
		Scanner scanner = new Scanner(System.in);
		raza = scanner.nextInt();		
		area = PI * raza * raza;
		System.out.println("The area of the circle is: " + area);
	}
	
}
