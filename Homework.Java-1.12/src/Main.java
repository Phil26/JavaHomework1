


import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Main {


	public static void write()
	{
		try {
		FileWriter file = new FileWriter("fisier.txt");
		file.write("10");
		file.close();
		System.out.println("Succesfully wrote to the file.");
		}
		
		catch(IOException e)
		{
			System.out.println("Input file error occured.");
			e.printStackTrace();
		}
			
	}
	
	 static int read() throws FileNotFoundException
	{
		int x;
		File file2 = new File ("fisier.txt");
		Scanner scanner = new Scanner(file2);
		
		return scanner.nextInt();
   }
		
	public static void main(String[] args)
	{
		int number;
		write();
		try
		{
		number = read();
		int answer = 2 * number;
		System.out.println("2 * " + number + " = " + answer);	
		}
		catch(FileNotFoundException e)
		{
			System.out.println("The file does not exist.");
			number = 1;
			e.printStackTrace();
		}
		
	}
	
	
	
	
}
