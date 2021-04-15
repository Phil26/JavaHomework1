


import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;


public class Main {

	public static void main(String[] args)
	{
		Thread thread1 = new Thread(() -> {
			try 
			{
				FileWriter writer1 = new FileWriter("file1.txt");
				Random random_num = new Random();
				int num1 = (int)random_num.nextInt(1000);
				System.out.println(num1);
				writer1.write(Integer.toString(num1));
				writer1.close();
			
			}
			catch(IOException e)
			{
				System.out.println("IOException occurred.");
				e.printStackTrace();
			}
			
		});
			thread1.start();
			
			Thread thread2 = new Thread(() -> {
				try 
				{
					FileWriter writer2 = new FileWriter("file2.txt");
					Random random_num2 = new Random();
					int num2 = (int)random_num2.nextInt(1000);
					System.out.println(num2);
					writer2.write(Integer.toString(num2));
					writer2.close();
			
				}
				catch(IOException e)
				{
					System.out.println("IOException occurred.");
					e.printStackTrace();
				}
				
			});
				thread2.start();
			
				Thread thread3 = new Thread(() -> {
					try 
					{
						FileWriter writer3 = new FileWriter("file3.txt");
						Random random_num3 = new Random();
						int num3 = (int)random_num3.nextInt(1000);
						System.out.println(num3);
						writer3.write(Integer.toString(num3));
						writer3.close();
					}
					catch(IOException e)
					{
						System.out.println("IOException occurred.");
						e.printStackTrace();
					}
					
				});
					thread3.start();
					
			System.out.println("End");
}
}
