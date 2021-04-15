


public class Main {
	
	public static void main(String[] args)
	{
		Car car = new Car();
		car.startEngine();
		car.start();
		car.accelerate();
		car.stop();
		car.stopEngine();
		
		MyCuteCar cuteCar = new MyCuteCar();
		//cuteCar.distance = 15;   //inaccesibil; atributul "distance" are indicatorul de acces 'private'
		cuteCar.speed = 100;
		cuteCar.startEngine();
		
		/* Din testele realizate se observa faptul ca atat in subclasa MyCuteCar cat si in clasa Main
		  (care apartine aceluiasi pachet), atributele si metodele cu indicatorul de acces 'private' in 
		  clasa de baza nu sunt accesibile;
		  Elementele de tip 'protected' si mai ales 'public' sunt accesibile.
		 */
			
	}
	

}
