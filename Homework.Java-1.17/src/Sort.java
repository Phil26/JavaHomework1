import java.util.Collections;
import java.util.LinkedList;
import java.lang.Exception;

/**
 * Sort class responding for sorting methods applied to the list using implemented method sort() from Collections class
 *
 */
public class Sort extends List 
{
	/**
	 * Ascending sort	
	 * @param LinkedList<Integer> nums - integer linked list
	 */
	
	static void ascendingSort(LinkedList<Integer> nums)
	{
		System.out.println("Lista de numere intregi va fi sortata in ordine crescatoare.");
		Collections.sort(nums);	
	}

	/**
	 * Descending sort
	 * @param LinkedList<Integer> nums - integer linked list 
	 * */
	
    static void descendingSort(LinkedList<Integer> nums)
     {
	     System.out.println("Lista de numere intregi va fi sortata in ordine descrescatoare.");
	     Collections.sort(nums, Collections.reverseOrder());
     }

    
}