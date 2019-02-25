package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class validateTitle extends base
{
	private static Logger log4=LogManager.getLogger(base.class.getName());

	@BeforeMethod
	public void OpenURL() throws IOException
	{
		driver=initialiseDriver();
		log4.info("Opening url for ValidateTitle test case");
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();

	}
	
	@Test
	public void Title() throws IOException
	{
		LandingPage lp=new LandingPage(driver);
		String actual=lp.titleCheck().getText();
		Assert.assertEquals(actual, "FEATURED 123COURSES");
		log4.info("Checked main method for Title Page test case");

	}

	@AfterMethod
	public void closeBrowser()
	{
		log4.info("Closing browser for Validate title test page");
		driver.close();
		driver=null;
	}
}
