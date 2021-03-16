import java.util.Scanner;

public class segmentDeDreapta implements Shape {

	float lenght;
	
	public void getPerimetru()
	{
		System.out.println("Segmentul de dreapta nu are perimetru.");
	}
	
	void displayLenght()
	{
		System.out.println("Lenght: ");
		Scanner scanner = new Scanner(System.in);
		lenght = scanner.nextFloat();
		
		System.out.println("Segment's lenght is " + lenght + ".");
	}
	
}
