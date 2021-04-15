import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.io.FileWriter;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		
	try 
	{
		
	GsonBuilder builder = new GsonBuilder();
	Gson gson = builder.create();
	ArrayList<Students> students = new ArrayList<Students>();
	
	Students student1 = new Students("Alin", 20, "math");
	Students student2 = new Students("Maria", 18, "biology");
	Students student3 = new Students("Ionel", 22, "chemistry");
	Students student4 = new Students("George", 19, "antropology");
	Students student5 = new Students("Marius", 23, "physics");
	
	students.add(student1);
	students.add(student2);
	students.add(student3);
	students.add(student4);
	students.add(student5);

	Class classroom = new Class(students);
	File myfile = new File("json.txt");
	if(myfile.createNewFile())
	{
		System.out.println("File " + myfile.getName() + " created.");
	}
	else
	{
		System.out.println("File already exist.");
	}
	
	FileWriter writer = new FileWriter("json.txt");
	
	String json = gson.toJson(classroom);
	//System.out.println("Classroom to json -> " + json);
	writer.write(json);
	writer.close();
	
    Scanner scanner = new Scanner(myfile);
    String json2 = " ";
    
    while(scanner.hasNextLine())
	{
	json2 = scanner.nextLine();
	}
	
    scanner.close();
    
	Class classroom2 = gson.fromJson(json2, Class.class);
	classroom2.displayStudents();
	
	   }
	
	catch(IOException e)
	{
		System.out.println("IOException occurred.");
		e.printStackTrace();
	}
			
	}

}
