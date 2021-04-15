
@author Filip Neagoe

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class Main {

	public static void main(String[] args) 
	{
	GsonBuilder builder = new GsonBuilder();
	Gson gson = builder.create();
	A1 a1 = new A1(1, 2, 3);
	String json = gson.toJson(a1);
	System.out.println("A1 to Json:" + json);
	
	A2 a2 = gson.fromJson(json, A2.class);
	System.out.println(a2.getZ());
	a2.displayXYZ();
	
	}

}
