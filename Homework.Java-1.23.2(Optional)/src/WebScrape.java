import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class WebScrape 
{

	public static void main(String[] args)
	{
		final String url = "https://www.ucv.ro/";	
		try 
		{
	    final Document document = Jsoup.connect(url).get();
		Elements aux = document.select("div.o_stire");	
	 
	    for(Element title:aux)
	    {
			System.out.println(title.getElementsByTag("a").first().text());
			return;
	    }
		
		}
		
		catch(IOException e)
		{
			System.out.println("IOException occurred.");
			e.printStackTrace();
		}
	}

}
