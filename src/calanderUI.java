import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class calanderUI {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@value='MAA'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(@class,'ui-state-active')]")).click();
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		if(driver.findElement(By.className("picker-second")).getAttribute("style").contains("opacity: 1"))
		{
			System.out.println("Its enabled");
			Assert.assertTrue(true);
		}
	}

}
