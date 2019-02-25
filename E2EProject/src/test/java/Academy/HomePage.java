package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class HomePage extends base
{
	private static Logger log4=LogManager.getLogger(base.class.getName());

	@BeforeMethod
	public void OpenURL() throws IOException
	{
		driver=initialiseDriver();
		log4.info("Opened url for Homepage test case");
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
	}
	
	
	
	@Test(dataProvider="getData")
	public void Home(String username,String password,String text) throws IOException
	{
		
		LandingPage lp=new LandingPage(driver);
		lp.NoThnx().click();
		lp.getLogin().click();
		LoginPage log=new LoginPage(driver);
		log.getUsername().sendKeys(username);
		log.getPassword().sendKeys(password);
		System.out.println(text);
		log.Login().click();
		log4.info("Checked main method for Home Page test case");

	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[2][3];
		data[0][0]="abc@xyz.com";
		data[0][1]="12345";
		data[0][2]="1st login";
		
		data[1][0]="abcdefghi@xyz.com";
		data[1][1]="98765";
		data[1][2]="2nd login";

		return data;
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		log4.info("closing browser for home page test case");
		driver.close();
		driver=null;
	}
	

}
