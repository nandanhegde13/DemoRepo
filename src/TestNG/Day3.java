package TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day3 {

	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before every method");
	}

	
	@AfterTest
	public void postrequisite()
	{
		System.out.println("I will execute after test");
	}
	
	@Test 
	public static void func1()
	{
		System.out.println("Car loan1");
	}

	@Test 
	public static void func2()
	{
		System.out.println("Car loan2");
	}
	
	@Test 
	public static void func3()
	{
		System.out.println("Car loan3");
	}
}
