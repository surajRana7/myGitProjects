package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;


public class base 
{
	public static WebDriver driver;
	public Properties prop;
	public WebDriver initialiseDriver() throws IOException
	{
		prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\Suraj.Rana\\Desktop\\E2EProject\\src\\main\\java\\resources\\browser2.properties");
		prop.load(fis);
		
		if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chrome\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(prop.getProperty("browser").equalsIgnoreCase("firefox"))
		{
			//System.setProperty("webdriver.firefox.driver", "D:\\Softwares_Installed\\Selenium\\geckodriver-v0.20.1-win64\\geckodriver.exe");
			//driver=new FirefoxDriver();
		}
		else
		{
			//InternetExplorer
		}
		
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		return driver;

	}
	public void getScreenShots(String name) throws IOException
	{	
		SimpleDateFormat sd=new SimpleDateFormat("MM/dd/yyyy HH.mm.ss"); // // Create object of SimpleDateFormat class and decide the format
		Date d=new Date(); // //get current date time with Date()
		String s1=sd.format(d); //// Now format the date
		TakesScreenshot a=(TakesScreenshot)driver;
		File src=a.getScreenshotAs(OutputType.FILE);
		//File dest=new File("C:\\Users\\Sach\\Desktop\\Screenshots\\"+name+"case failed at"+s1+"time.png");
		File dest=new File("C:\\Users\\Suraj.Rana\\Desktop\\Screenshots\\"+name+"Screenshot.png");
		FileHandler.copy(src, dest);
		//FileUtils.copyFile(src, dest);
		
	}
	
	
	
	
	
	
	
}
