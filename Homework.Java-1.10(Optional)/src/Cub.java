import java.util.Scanner;

public class Cub implements Shape2D, Shape3D {

	double latura;
    final double PI = 3.14;
	
    System.out.println("Dimensiunea unei laturi: ");
	Scanner scanner = new Scanner(System.in);
	latura = scanner.nextDouble();
	
    public void getPerimetru()
    {	
	    System.out.println("Perimetrul cubului este " + 12 * latura + ".");	
    }
    
    public void getAria()
    {
	    System.out.println("Aria cubului este " + 4 * latura * latura + ".");	
    }
    
    public void getVolume()
    { 	
		System.out.println("Volumul cubului este:" + latura * latura * latura + ".");
    }
	
	
	
	
	
}
