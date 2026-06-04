import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.className("blinkingText")).click();
		
		Set<String> windowId = driver.getWindowHandles();
		
		Iterator<String> ids = windowId.iterator();
		ids.next();
		String childId = ids.next();
		driver.switchTo().window(childId);
	System.out.println(driver.findElement(By.xpath("//p[@class='im-para red']")).getText());

	}

}
