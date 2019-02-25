package basic_package;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class basic_class3 {

	@AfterMethod
	public void AMehod()
	{
		System.out.println("I will execute after any method of third test");
	}
	
	@AfterTest
	public void ExecuteLast()
	{
		System.out.println("I will execute last");
	}
	@Test(groups= {"smoke"})
	public void basic4()
	{
		System.out.println("First method of third test");
	}
	
	@Test(dependsOnMethods= {"edemo","fdemo"})
	public void demo()
	{
		System.out.println("Second method of third test(demo)");
	}
	@Test
	public void edemo()
	{
		System.out.println("Third method of third test(edemo)");
	}
	
	@Test
	public void fdemo()
	{
		System.out.println("Fourth method of third test(fdemo)");
	}
	
	@Test(enabled=false)
	public void gdemo()
	{
		System.out.println("Fifth method of third test(gdemo)");
	}
	
	
	@BeforeTest
	public void executeFirst()
	{
		System.out.println("I will execute first");
	}
	
	
}
