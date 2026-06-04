package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class day4 {
	
	@Test(enabled=false)
	public static void mymethod3()
	{
		System.out.println("Testing Dependent method3");
	}
	
    
	@Test(dataProvider="getData")
	public static void mymethod1(String userName,String password)
	{
		System.out.println("Testing Dependent method1");
		System.out.println("UserName"+userName);
		System.out.println("Password"+password);
		
	}
	
	@Test(dependsOnMethods={"mymethod1"})
	public static void mymethod2()
	{
		System.out.println("Testing Dependent method2");
	}
	
	@Parameters({"url","Name"})
	@Test
	public static void mymethod4(String url,String Name)
	{
		System.out.println("Testing Dependent method4");
		System.out.println(url);
		System.out.println(Name);
	}
	
	
	
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[3][2];
		
		data[0][0] ="First UserName";
		data[0][1] ="Pass1";
		
		data[1][0] ="Second UserName";
		data[1][1] ="Pass2";
		
		data[2][0] ="Third UserName";
		data[2][1] ="Pass3";
		
		return data;
		
		
		
	}
	
	
	
	
}
