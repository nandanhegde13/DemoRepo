package TestNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {

	@Test
	public void demo1()
	{
		System.out.println("Day2");
	}
	
	@BeforeTest
	public void prerequisite(){
		System.out.println("I am executing first");
	}
}
