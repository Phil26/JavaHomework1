import java.io.Serializable;


public class Student implements Serializable
{
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String name;
  private int age;
  private double average;
	
	public Student(String name, int age, double average)
	{
		this.name = name;
		this.age = age;
		this.average = average;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public int getAge()
	{
		return this.age;
	}
	
	public double getAverage()
	{
		return this.average;
	}
	
	static void display(Student stud)
	{
		System.out.println("Name:" + stud.name);
		System.out.println("Age:" + stud.age);
		System.out.println("Average:" + stud.average);
	}
	
	@Override
	public String toString()
	{
	return "Name:" + this.name + " " + "Age:" + this.age + " " + "Average:" + this.average;
	}
	
	
	

}
