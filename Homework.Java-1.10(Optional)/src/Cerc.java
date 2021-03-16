import java.util.Scanner;

public class Cerc implements Shape2D, Shape3D 
{

	double raza;
	final double PI = 3.14;
	
	System.out.println("Dimensiunea razei: ");
	Scanner scanner = new Scanner(System.in);
	raza = scanner.nextDouble();

	
	public void getPerimetru()
    {
	    System.out.println("Perimetrul cercului este " + 2 * PI * raza + ".");	
    }
    
    public void getAria()
    {
	    System.out.println("Aria patratului este " + PI * raza * raza + ".");	
    }
    
    public void getVolume()
    {
    	System.out.println("cercul este o forma geometrica 2D.Nu are volum.");
    }
	
	
	
	
}
