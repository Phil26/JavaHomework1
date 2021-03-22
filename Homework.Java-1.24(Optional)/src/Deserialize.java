import java.util.LinkedList;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialize 
{

	@SuppressWarnings("unchecked")
	public static void main(String[] args)
	{
		LinkedList<Student> students = null;
		try 
		{	
	         FileInputStream fileIn = new FileInputStream("students.ser");
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         students = (LinkedList<Student>)in.readObject();
	         in.close();
	         fileIn.close();	         
	    }
		
     		catch (IOException e)
		    {
     			System.out.println("IOException occurred.");
	            e.printStackTrace();
	            return;
	        }  
		
		   catch (ClassNotFoundException c) 
		   {
	            System.out.println("'Student' class not found.");
	            c.printStackTrace();
	            return;
	       }
		
		System.out.println("Display the students list");
		System.out.println(students);
		
	}

}
