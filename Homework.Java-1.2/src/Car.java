
public class Car {

     	    private double distance = 10;                     // distanta parcursa de masina(10 km)
	        private double t1 = 0;           
/*atribute*/private double t2 = 500.12;         
	        protected double delta_t = t2 - t1;               //timpul mediu de deplasare
	        protected double speed = distance / delta_t;      //viteza de deplasare raportata la distanta si timp
	        protected double acceleration = speed / delta_t;  //acceleratia raportata la viteza si timp
	      
	
	Car()                                                     //constructor implicit
	{
		
	}
	
	
	protected void start()
	{
		System.out.println("Masina se pune in miscare la momentul t1 = " + t1 + " sec.");	
	}
	
	protected void stop()
	{
		System.out.println("Masina se opreste din miscare la momentul t2 = " + t2 + " sec.");
	}
	protected void accelerate()
	{
 	    System.out.println("Acceleratia masinii este de " + acceleration +" m/sec");
	}
	
	public double getSpeed()
	{
		return speed;
	}
	
	public void setSpeed(double value)
	{
		this.speed = value;
	}
	protected void startEngine()
	{
		System.out.println("Motorul functioneaza la 900 rotatii pe minut.Consum 0.4l/h");
	}
	protected void stopEngine()
	{
		System.out.println("Motorul functioneaza la 0 rotatii pe minut.Consum 0.0l/h");
	}

	/*  atributele si metodele de tip "private" sunt accesibile doar in clasa "Car"
	    atributele si metodele de tip "protected" sunt accesibile atat in superclasa "Car", cat si in subclasa
	 "MyCuteCar" si in pachetul din care acestea fac parte
	    atributele si metodele de tip "public" sunt accesibile pentru toate clasele
	*/
	
	
}
