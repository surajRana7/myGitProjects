package basic_package2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class basic_class4 {
	@Test(groups= {"smoke"})
	public void basic5()
	{
		System.out.println("First method of second package");
	}
	
	@AfterSuite
	public void Asuite()
	{
		System.out.println("I am always printed last");
	}
	
	
	public void AClass()
	{
		System.out.println("I will execute after all methods of class 4 is executed");
	}
	
	@Parameters({ "URL" })
	@Test
	public void Demo123(String s)
	{
		System.out.println("THis is parameterizing testNG test4");
		System.out.println(s);
	}
}
