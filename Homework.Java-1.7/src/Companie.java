import java.util.LinkedList;

public class Companie {
   String nume;
   Adresa adresaCompanie;
   LinkedList <Angajat> angajati;

   Companie()
   {
	   
   }
   
   void angajeaza(Angajat angajat)
   {
	   angajati.add(angajat);
   }
   
   void concediaza(Angajat angajat)
   {
	   angajati.remove(angajat);
   }
   
 void faliment()
 {
	 angajati.clear();
 }
	
	
}
