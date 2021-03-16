import java.util.Scanner;

public class B extends A
{

protected String s;
	
public B()
{
 
}

public B(String str)
{
	this.s = str;
}

public void readS()
{
	
	System.out.println("Read s: ");
	Scanner scanner = new Scanner(System.in);
	this.s = scanner.nextLine();
	
}

}
