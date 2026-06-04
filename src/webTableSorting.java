import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webTableSorting {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		String[] itemList = { "Cucumber", "Brocolli", "Beetroot" };
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		try {

			int cartItemCount = addItem(driver, itemList);
			System.out.println(cartItemCount);

		} catch (Exception e)

		{
			System.out.println(e);
		}

		driver.findElement(By.cssSelector(".cart-icon")).click();
		driver.findElement(By.xpath("(//div[@class='action-block']/button)[1]")).click();
		List<WebElement> items = driver.findElements(By.xpath("//table[@id='productCartTables']/tbody/tr/td[2]/p"));
		ArrayList<String> veggies = new ArrayList<String>();

		for (WebElement item : items) {
			veggies.add((item.getText()).split("-")[0].trim());
		}

	
		
		veggies.stream().sorted().forEach(s->System.out.println(s));
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
