import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver = new ChromeDriver();
		    String name="Nandan";
			driver.get("https://rahulshettyacademy.com/locatorspractice/");
			driver.findElement(By.linkText("Forgot your password?")).click();
			Thread.sleep(1000);
			driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
			String password = getPassword(driver);
	        driver.findElement(By.id("inputUsername")).sendKeys(name);
	        driver.findElement(By.name("inputPassword")).sendKeys(password);
	        driver.findElement(By.className("go-to-login-btn")).click();
	        Thread.sleep(1000);
	        driver.findElement(By.className("signInBtn")).click();
	        Thread.sleep(1000);
	        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
	        Assert.assertEquals(driver.findElement(By.xpath("//div[@class='login-container']/h2")).getText(), "Hello "+name+",");
	        driver.findElement(By.xpath("//button[text()='Log Out']")).click();

	}
	
	
	public static String getPassword(WebDriver driver){ 
		 String[] rawText = driver.findElement(By.cssSelector("form p")).getText().split("'");
		 String password = rawText[1];
		 return password;
	}

}
