package maven;

import com.google.gson.internal.GsonBuildConfig;

public class Lab2 
{
	
	public static void main(String[] args) 
	{
	    GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();
		A a1 = new A(4);
		
		String json = gson.toJson(a1);
		System.out.println("a1 to JSON: " + json);
		json = "{\"x\":22}";
		A a2 = gson.fromJson(json, A.class);
		
		System.out.println(a2.getX());
		
	}

}











