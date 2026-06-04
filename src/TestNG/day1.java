package TestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day1 {
	
	//Test Git hub actions
	
	@BeforeClass
	
	public void beforeClassMethod()
	{
		System.out.println("Before Class");
	}
	
	@Test
	public void demo()
	{
		System.out.println("TestNG");
	}
	
	
	@Test(groups= {"Smoke"})
	public void demo1()
	{
		System.out.println("TestNG1");
	}
	
	@Test(groups= {"Smoke"})
	public void demo2()
	{
		System.out.println("TestNG2");
	}
	
	@Test(groups= {"Smoke"})
	public void demo3()
	{
		System.out.println("TestNG3");
	}
	
	@BeforeSuite
	 public void beforeSuiteMethod()
	 {
		System.out.println("I am running before all test cases");
		
	 }
	
	@AfterSuite
	 public void afterSuiteMethod()
	 {
		System.out.println("I am running after all test cases");
		
	 }
}
