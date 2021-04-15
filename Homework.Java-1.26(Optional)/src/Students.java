

public class Students 
{

	private String name;
	private int age;
	private String degree;
	
	Students()
	{
		
	}
	
	Students(String name, int age, String degree)
	{
		this.name = name;
		this.age = age;
		this.degree = degree;
	}
	
	public void display()
	{
		System.out.println("Name:" + this.name);
		System.out.println("Age:" + this.age);
		System.out.println("Degree:" + this.degree);
	}
	
	String getName()
	{
		return this.name;
	}
	
	int getAge()
	{
		return this.age;
	}
	
	String getDegree()
	{
		return this.degree;
	}
	
	@Override
	public String toString()
	{
		return "Name:" + this.name + "  " + "Age:" + this.age + "  " + "Degree:" + this.degree;
	}

}
