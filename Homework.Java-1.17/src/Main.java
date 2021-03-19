import java.util.LinkedList;
import java.util.Scanner;
import java.util.Random;

/**
 * 
 * This app purpose is to sort an array of integers
 * ! These doc comments are used for experimental purposes !
 * 
 * @author Filip
 * @version 1.0
 * @since 3/19/2021
 */

public class Main {

	/**
	 * Main function
	 *  
	 * @param String[] args, unused
	 * @return null, void 
	 */
	
	public static void main(String[] args) 
	{
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		Random random = new Random();
		System.out.println("Input the list size: ");
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		
		/**
		 * Adding random generated numbers to the list using a random object from Random
		 */
		
		for(int i = 0; i < size; i++)
		{
			numbers.add(random.nextInt(1000));
		}
		
		scanner.close();
		
		System.out.println("Lista initiala: ");
		/**
		 * Display the initial
		 */
		
		Display.Display(numbers);
	    Sort.ascendingSort(numbers);
	    /**
	     * Display the ascending sort elements
	     */
	    
	    Display.Display(numbers);
	    Sort.descendingSort(numbers);
	    /**
	     * Display the elements in descending order
	     */
	    
	    Display.Display(numbers);
		    
	}

}
