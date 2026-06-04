import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ecommerceApp {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		String[] itemList = { "Cucumber", "Brocolli", "Beetroot" };
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.findElement(By.cssSelector(".cart-icon")).click();
		driver.findElement(By.xpath("(//div[@class='action-block']/button)[1]")).click();
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("promoBtn")).click();

		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.className("promoInfo")));

		System.out.println(driver.findElement(By.className("promoInfo")).getText());

		try {

			int cartItemCount = addItem(driver, itemList);
			System.out.println(cartItemCount);

		} catch (Exception e)

		{
			System.out.println(e);
		}

	}

	public static int addItem(WebDriver driver, String[] selectedItems) throws InterruptedException {
		int j = 0;
		for (String item : selectedItems) {
			driver.findElement(By.xpath(
					"//h4[contains(text(),'" + item + "')]/following-sibling::div[@class='product-action']//button"))
					.click();
			j++;

		}
		return j;
	}

}
