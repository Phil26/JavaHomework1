

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int number;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input the number of students:");
		number = scanner.nextInt();
		
		ArrayList<Students> students = new ArrayList<Students>();
		System.out.println("Input students's infos:");
		
		for(int i = 1; i <= number; i++)
		{
			System.out.println("Student " + i + " infos");
		    Students student = new Students();
		    students.add(student);	
		}
		
	    System.out.println("Initial list:");
		System.out.println(students);
		Sort.Sort(students);
		System.out.println("Descended ordered list(by grades):");
		System.out.println(students);
		
	}

}
