package TestNG;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import static org.openqa.selenium.support.locators.RelativeLocator.*;

import org.openqa.selenium.By;

public class relativeLoc {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement NamedBox = driver.findElement(By.className("//input[@name='name']"));
		driver.findElement(with(By.tagName("label")).above(NamedBox));
	}

}
