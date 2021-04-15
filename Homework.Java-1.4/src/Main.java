
@author Filip Neagoe

public class Main {

	public static void main(String[] args)
	{
     
		//Cum inferfetele nu admit constructori, nu se poate instantia un obiect de tipul "Animal"
		//Aceeasi observatie este valabila si in cazul interfetei "Dog" care extinde interfata "Animal"
		//De asemenea, clasa abstracta "Cat" nu permite instantierea de obiecte de tipul "Cat"
		//Clasa "Shark", care nu este o clasa abstracta si implementeaza inferfata "Animal", permite crearea
		//de obiecte de tipul Shark.Aceste obiecte pot apela metodele implementate din interfata "Animal".
		
		Shark rechin = new Shark();
		rechin.weight = 265;
		rechin.move();
		rechin.eat();

		
	}
	
}
