import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class scroll {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/#");
		
		JavascriptExecutor js = (JavascriptExecutor)(driver);
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		int sum=0;
		
		List<WebElement> numbers = driver.findElements(By.xpath("//table[@id='product']//td[4]"));
		for(WebElement number:numbers)
		{
			int n = Integer.parseInt(number.getText());
			sum=sum+n;
		}
		
		System.out.println(sum);
	}

}
