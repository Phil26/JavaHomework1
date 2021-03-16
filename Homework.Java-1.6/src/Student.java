import java.util.Scanner;


public class Student extends Person {

	String year;
	String licenseDomain;
	
	void changeStudentAdress()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please, specify the new adress: ");
		String newAdress = scanner.nextLine();
		System.out.println("The new adress is: " + newAdress);
		
	}
	
	
	
}
