import java.util.Scanner;

public class C extends B 
{

	private float y;
	
	public C()
	{
		
	}
	
	public C(float val)
	{
		this.y = val;
	}
	
	
	
    public void readY()
    {
    	System.out.println("Read y: ");
    	try {
    	Scanner scanner = new Scanner(System.in);
    	this.y = scanner.nextFloat();
    	}
    	catch(Exception e)
    	{
    		System.out.println(" ");
    	}
    	
    }
    
    public void readX()
    {
    	
    	System.out.println("Read x: ");
    	try {
    	Scanner scanner = new Scanner(System.in);
    	this.x = scanner.nextInt();
    	}
    	catch(Exception e)
    	{
    		System.out.println(" ");
    	}
    	
    }

public void displayXYS()
{
	System.out.println("x:" + x);
	System.out.println("y:" + y);
	System.out.println("s:" + s);
	
}

}
