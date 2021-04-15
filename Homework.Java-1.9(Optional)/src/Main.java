@author Filip Neagoe

import java.util.LinkedList;

public class Main {

	public static void main(String[] args)
	{
		Cerc c1 = new Cerc();
		Cerc c2 = new Cerc();
	    Cerc c3 = new Cerc();
		Cerc c4 = new Cerc();
		Cerc c5 = new Cerc();
		
		LinkedList<Cerc> circles = new LinkedList<Cerc>();
		
		circles.add(c1);
		circles.add(c2);
		circles.add(c3);
		circles.add(c4);
		circles.add(c5);
		
		for(Cerc c : circles)
		{
			c.getArea();
		}
	}
	
}
