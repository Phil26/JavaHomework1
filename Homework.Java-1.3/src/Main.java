
public class Main {

	public static void main(String[] args)
	{
		Car car = new Car("Volvo", "XC-90", "black", 1800, 240, 5);
		System.out.println(car);                                   // apelare implicita a metodei toString()
		System.out.println(car.toString());                        // apel explicit
	
	}
	
	
}
