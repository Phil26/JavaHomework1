

import java.util.ArrayList;
import java.util.Scanner;


public class Main 
{
public static void main(String[] args)
{
	int number;
	int max_age;
	ArrayList<Student> students = new ArrayList<Student>();
   	System.out.println("Number of students: ");
   	Scanner scanner = new Scanner(System.in);
   	number = scanner.nextInt();
 
   	
   	for(int it = 0; it < number; it++)
   	{
   		Student student = new Student();
   		students.add(student);
   	}
 
   	scanner.close();
   	
   	System.out.println("Display the list:");
   	System.out.println(students);
    max_age = Classroom.sortAge(students);
    System.out.println("Max age is " + max_age + ".");
    System.out.println("The oldest student is " + students.get(0).name + ". He is " + max_age + " years old." ); 
   	System.out.println("Display the ordered list:");
   	System.out.println(students);
   

}
}
