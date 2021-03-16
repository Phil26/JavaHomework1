import java.util.Scanner;

public class Patrat implements Shape2D, Shape3D
{
    
	float latura;
	
	System.out.println("Dimensiunea unei laturi: ");
	Scanner scanner = new Scanner(System.in);
	latura = scanner.nextFloat();
	
    public void getPerimetru()
    {
	    System.out.println("Perimetrul patratului este " + 4 * latura + ".");	
    }
    
    public void getAria()
    {
	    System.out.println("Aria patratului este " + latura * latura + ".");	
    }
    
    public void getVolume()
    {
    	System.out.println("Patratul este o forma geometrica 2D.Nu are volum.");
    }
	
	
}

