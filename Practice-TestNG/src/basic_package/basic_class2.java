package basic_package;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class basic_class2 {

	@Parameters({ "URL" })
	@Test
	public void abc(String name)
	{
		System.out.println("THis is parameterizing test NG test 2");
		System.out.println(name);
	}
	
	@Test(groups= {"smoke"})
	public void bc()
	{
		System.out.println("Second method of second test");
	}
	
	@BeforeSuite
	public void bsuite()
	{
		System.out.println("I am always number 1");
	}
	
	@BeforeMethod
	public void bMehod()
	{
		System.out.println("I will execute before any method of second test");
	}
	
	@BeforeClass
	public void bClass()
	{
		System.out.println("I will execute before any methods of second test classes");

	}
	
	@Test(dataProvider="getdata")
	public void MultipleRun(String row,String column)
	{
		System.out.println(row);
		System.out.println(column);
	}
	
	
	@DataProvider
	public Object[][] getdata()
	{
		
		Object[][] a=new Object[3][2]; //3 indicates this test will run 3 times
		
		//1st set
		a[0][0]="FirstUsername";
		a[0][1]="FirstUsername";
		
		//2nd set
		a[1][0]="FirstUsername";
		a[1][1]="FirstUsername";
		
		//3rd set
		a[2][0]="FirstUsername";
		a[2][1]="FirstUsername";

		return a;
	}
	
}

