
public class Car {

	private String brand;
	private String model;
	private String color;
	private float mass;
	private int power;
	private int seats;
	
	
	Car(String brand, String model, String color, float mass, int power, int seats)
	{
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.mass = mass;
		this.power = power;
	    this.seats = seats;
	}
	
	@Override                 // indicatorul "Override" specifica faptul ca metoda toString() este suprascrisa 
	public String toString()
	{
		return "Brand:" + brand + "  " + "Model:" + model + "  " + "Color:" + 
	            color  + "  " +  "Mass:" + mass + "  " +  "Power:" + power + "  " + "Seats:" + seats;
		
	}
}

// Suprascrierea metodei toString() se realizeaza si in absenta indicatorului @Override  