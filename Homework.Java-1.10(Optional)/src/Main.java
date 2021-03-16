
public class Main {

	public static void main(String[] args)
	{
		segmentDeDreapta segment = new segmentDeDreapta();
		segment.displayLenght();
		
		Cerc cerc = new Cerc();
		cerc.getPerimetru();
		cerc.getAria();
		
		Patrat patrat = new Patrat();
		patrat.getPerimetru();
		patrat.getAria();
		
		Sfera sfera = new Sfera();
		sfera.getPerimetru();
		sfera.getAria();
		sfera.getVolume();
		
		Cub cub = new Cub();
		cub.getPerimetru();
		cub.getAria();
		cub.getVolume();
		
	}
}
