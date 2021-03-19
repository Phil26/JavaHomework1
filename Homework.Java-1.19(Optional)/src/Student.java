import java.util.Scanner;


public class Student {

	public String name;
	public float average;
	public int age;
	
	Student() 
	{
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input the datas.");
        System.out.println("Name:");
        this.name = scanner.nextLine();
        System.out.println("Average:");
        this.average = scanner.nextFloat();
        System.out.println("Age:");
        this.age = scanner.nextInt();
		
	}
	
	public String toString()
	{
		
		return "Name:" + this.name + "; " + "Average:" + this.average + "; " + "Age:" + this.age;
		
	}

}
