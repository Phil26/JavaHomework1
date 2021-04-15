
@author Filip Neagoe

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.lang.InterruptedException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;

public class Main 
{

	public static void main(String[] args) throws IOException, InterruptedException
	{
		var url = "http://api.openweathermap.org/data/2.5/air_pollution?lat=44.318378&lon=23.796400&appid=1593c20fe1be2f0058d97f6daf07f49d";
		var request = HttpRequest.newBuilder().GET().uri(URI.create(url)).build();
		var client = HttpClient.newBuilder().build();
		var response = client.send(request, HttpResponse.BodyHandlers.ofString());
		
		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();
		String up = response.body().toUpperCase();
	    String json = gson.toJson(up);
	    
	    FileWriter file = new FileWriter("weather.txt");
	    file.write(json);
	    file.close();
	    
	}
	
}
