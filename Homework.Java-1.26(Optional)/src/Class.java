import java.util.ArrayList;

public class Class extends Students 
{
	
    ArrayList<Students> students = new ArrayList<Students>();
    
	Class(ArrayList<Students>students)
	{
		this.students = students;
		System.out.println("The class was created.");
	}
	
	
	void displayStudents()
	{
		System.out.println("Class has the following students: ");
		for(int i = 0; i < students.size(); i++)
		{
			System.out.println(students.get(i));
		}
			
	}

}
