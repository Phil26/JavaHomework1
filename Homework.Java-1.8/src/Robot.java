
public class Robot implements Computer, Mechanism 
{

	public void boot()
	{
		System.out.println("The robot is booting.");
	}
	
	public void on()
	{
		System.out.println("The robot is ON now.");
	}
	
	public void off()
	{
		System.out.println("The robot is turning OFF.Please wait...");
	}
	
	public void Move()
	{
		System.out.println("This is an implementation of 'Move' method from 'Mechanical' interface.");
	}
	
}
