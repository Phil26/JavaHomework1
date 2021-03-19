import java.util.LinkedList;
import java.util.Random;

/**
 * First try to implement this app using a particular class for generate a list
 * Unfortunately, some issues occurred during this process 
 */

public class List {

	//version 2 of the app using a "List" contructor for generating the Integer list;
	List()
	{
		
	}
	
	List(int value)
	{
		
	System.out.println("Se creaza o lista cu " + value + " elemente numere intregi.");	
	LinkedList<Integer> numbers = new LinkedList<Integer>();
	Random random = new Random();
	for(int i = 0; i < value; i++)
	{
		numbers.add(random.nextInt(1000));
	}
	
	}
}
