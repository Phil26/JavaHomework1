@author Filip Neagoe

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

public class Serialize 
{

	public static void main(String[] args)
	{
		LinkedList<Student> students = new LinkedList<Student>();
		Student stud1 = new Student("Andrei", 18, 9);
		Student stud2 = new Student("Alin", 19, 8.7);
		Student stud3 = new Student("Cosmin", 17, 8);
		Student stud4 = new Student("Alex", 21, 9.5);
		Student stud5 = new Student("George", 22, 9.9);
		
		students.add(stud1);
		students.add(stud2);
		students.add(stud3);
		students.add(stud4);
		students.add(stud5);
		
		try {
			
			FileOutputStream fileOut = new FileOutputStream("students.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(students);
			out.close();
			fileOut.close();
			
			System.out.println("Serializing process is done.");
		}
		
		catch(IOException e)
		{
			System.out.println("Serialization has failed.Try again.");
			e.printStackTrace();
		}
		
		}

	}

	
