import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLCheck {

	public static void main(String[] args) {
      
		ChromeOptions chrome = new ChromeOptions();
		chrome.setAcceptInsecureCerts(true);
		WebDriver driver = new ChromeDriver(chrome);
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
		
	}

}
