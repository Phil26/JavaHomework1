
public class Threads extends Thread 
{
	private int number;
	
	public Threads(int number) 
	{
	super();
	this.number = number;
	}
	
	@Override
	public void run() 
	{
	System.out.println("number 3: " + this.number);
	super.run();
	}
	}
