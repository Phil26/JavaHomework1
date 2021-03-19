import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Classroom extends Student 
{
	
	static int sortAge(ArrayList<Student> students)
	{
		for(int i = 0; i < students.size(); i++)
		{
			
			
			for(int j = i + 1; j < students.size(); j++)
			{
			
				if(students.get(j).age > students.get(i).age)
				{
					
					
					int aux = students.get(j).age;
					students.get(j).age = students.get(i).age;
					students.get(i).age = aux;
						
					
					String nume = students.get(j).name;
					students.get(j).name = students.get(0).name;
					students.get(0).name = nume;	
					
					float medie = students.get(j).average;
					students.get(j).average = students.get(0).average;
					students.get(0).average = medie;	
					
			
				}
			}
		}
		 
	return students.get(0).age;
	}
		
}
