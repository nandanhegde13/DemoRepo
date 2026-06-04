import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		        WebDriver driver = new ChromeDriver();
				driver.get("https://rahulshettyacademy.com/locatorspractice/");
		        driver.findElement(By.id("inputUsername")).sendKeys("hegdenandan013@gmail.com");
		        driver.findElement(By.name("inputPassword")).sendKeys("test");
		        driver.findElement(By.className("signInBtn")).click();
		        driver.findElement(By.className("signInBtn")).click();	
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());	
		        driver.findElement(By.linkText("Forgot your password?")).click();
		        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Nandan Hegde");
		        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("hegdenandan013@gmail.com");
		        driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("4565432");
		        driver.findElement(By.xpath("//input[@type='text'][3]")).clear();
		        driver.findElement(By.cssSelector("input[type='text']:nth-child(4)")).sendKeys("9980865436");
		        Thread.sleep(1000);
		        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		        System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		        driver.findElement(By.className("go-to-login-btn")).click();
		        Thread.sleep(1000);
		        driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("hegdenandan");
		        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		        driver.findElement(By.xpath("//label[contains(@for,'chk')]")).click();
                driver.findElement(By.className("submit")).click();


		        
	}

}
