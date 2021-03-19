import java.util.ArrayList;
import java.util.Collections;

public class Sort extends Students {
	
	public static void Sort(ArrayList<Students> students) 
	{
		//System.out.println("Ascending sorting by grades");
		for(int i = 0; i < students.size(); i++)
		{
			for(int j = 0; j < students.size(); j++)
			{
				if(students.get(i).grade >= students.get(j).grade)
				{
					float aux = students.get(i).grade;
					students.get(i).grade = students.get(j).grade;
					students.get(j).grade = aux;	
					
					String nume = students.get(i).name;
					students.get(i).name = students.get(j).name;
					students.get(j).name = nume;	
				}
			}
		}
	}

}
