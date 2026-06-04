import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.net.URI;
import java.net.URISyntaxException;

public class brokenLink {

	public static void main(String[] args) throws MalformedURLException, IOException, URISyntaxException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/#");
		List<WebElement> links = driver.findElements(By.xpath("//table[@class='gf-t']//a"));
		
		for(WebElement link : links)
		{
			
			String url = link.getAttribute("href");
			HttpURLConnection conn = (HttpURLConnection) (new URI(url).toURL().openConnection());
			conn.setRequestMethod("HEAD");
			conn.connect();
			int responseCode = conn.getResponseCode();
			System.out.println(responseCode);
			if(responseCode == 404)
			{
				System.out.println(url);
			}
		}

		

	}

}
