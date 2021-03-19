import java.util.Scanner;

public class Students {

	public String name;
	public float grade;
	
	Students()	
	{
		System.out.println("Name: ");
		Scanner scanner = new Scanner(System.in);
		this.name = scanner.nextLine();
		
		System.out.println("Grade:");
		this.grade = scanner.nextFloat();
			
	}
	
	float getGrade()
	{
		return this.grade;
	}
	
	 void display()
	{
		System.out.println("Name: " + this.name);
		System.out.println("Grade: " + this.grade);
		
	}

	 @Override
		public String toString()
		{
			return String.format("Name:" + name + " & " + "Grade:" + grade);
			
		}
	 
}
