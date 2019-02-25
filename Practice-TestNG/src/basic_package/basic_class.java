package basic_package;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class basic_class {

	
	@Test
	public void basic()
	{
		System.out.println("First method of first test");
		
	}
	
	@Test(groups= {"smoke"})
	public void basic2()
	{
		System.out.println("Second method of first test");
	}
	
	@Parameters({"URL2","key"})
	@Test
	public void demo(String name2,String value)
	{
		System.out.println("THis is parameterizing test NG test 1");
		System.out.println(name2);
		System.out.println(value);
	}
	
	
	
	
	
	
	
}
