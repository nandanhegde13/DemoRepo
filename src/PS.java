import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PS {
	
	@Test
	public void doThis()
	{
		System.out.println("Do this method");
	}

	@BeforeMethod
	public void test2()
	{
		System.out.println("Before every method");
	}
	
}
