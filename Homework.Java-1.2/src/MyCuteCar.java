
public class MyCuteCar extends Car {

/*atribute*/   private int enginePower;      //puterea dezvoltata de motorul aditional
/*proprii*/	   private float tankCapacity;   //capacitatea rezervorului de combustibil pentru motor
	
	MyCuteCar()                              //contructor implicit
	{
		
	}
	
	private void stopEngine()                // suprascrierea metodei din clasa de baza
	{
		System.out.println("Motorul de racheta va fi decuplat");
	}
	
	
	private void startRocketEngine()
	{
		
	    this.startEngine();                  //apelarea metodei din clasa se baza	
	    System.out.println("Se initiaza alimentarea cu kerosen.Motorul va fi gata de start in cateva secunde...");
                                             //metoda este 'private' deoarece este strict utilizata in cadrul acestei subclase	
	
	}
	
	private void stopRocketEngine()
	{
		this.stopEngine();
	}
	
	
	
}
