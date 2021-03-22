
public class A2 
{
   int x;
   int y;
   int z;
	
	public A2() 
	{
	System.out.println("A new instance of A2 class is generated.");
	}

	int getZ()
	{
		return this.z;
	}
	
	void displayXYZ()
	{
		System.out.println("x: " + this.x);
		System.out.println("y: " + this.y);
		System.out.println("z: " + this.z);
	}
	
	void setXYZ(int x, int y, int z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
}
