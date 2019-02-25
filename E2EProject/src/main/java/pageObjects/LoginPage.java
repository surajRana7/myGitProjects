package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage 
{
	WebDriver driver;
	By username=By.xpath("//input[@id='user_email']");
	By password=By.xpath("//input[@id='user_password']");
	By Log_in=By.xpath("//input[@value='Log In']");
	
	public LoginPage(WebDriver driver) 
	{
		this.driver=driver;
	}
	

	public WebElement getUsername()
	{
		return driver.findElement(username);
	}
	
	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
	
	public WebElement Login()
	{
		return driver.findElement(Log_in);
	}
}
