import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesforceTesting {

	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://menandan-dev-ed.lightning.force.com/lightning/page/home");
		driver.findElement(By.id("username")).sendKeys("hegdenandan013@playful-goat-bec30e.com");
		driver.findElement(By.id("password")).sendKeys("Jaishreeram@123456");
		driver.findElement(By.id("Login")).click();
        driver.manage().window().maximize();
        Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)(driver);
		js.executeScript("window.scrollBy(0,700)");
//		driver.findElement(By.xpath("//a[text()='Remind Me Later']")).click();
		
	}
}
