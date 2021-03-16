import java.util.Scanner;

public class Sfera implements Shape2D, Shape3D
{
	double raza;
    final double PI = 3.14;
	
    System.out.println("Dimensiunea razei: ");
	Scanner scanner = new Scanner(System.in);
	raza = scanner.nextDouble();
	
	public void getPerimetru()
	{
		System.out.println("Perimetrul nu exista in acest caz.");
	}
	
    public void getAria()
    {	
	    System.out.println("Aria sferei este " + 4 * PI * raza * raza + ".");	
    }
    
    public void getVolume()
    {
		System.out.println("Volumul sferei cu raza r=" + raza + "este :" + (4 / 3) * PI * raza * raza * raza + ".");
    }

}
