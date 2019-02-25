package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage 
{
	WebDriver driver;
	
	By login_link=By.cssSelector("a[href*='sign_in']");
	By validate_title=By.xpath("//h2[contains(text(),'Featured Courses')]");
	By navigation=By.xpath("//ul[@class='nav navbar-nav navbar-right']");
	By no_thnx=By.xpath("//button[contains(text(),'NO THANKS')]");
	
	public LandingPage(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	public WebElement NoThnx()
	{
		WebDriverWait w =new WebDriverWait(driver, 50);
		w.until(ExpectedConditions.visibilityOfElementLocated(no_thnx));
		return driver.findElement(no_thnx);
	}

	public WebElement getLogin()
	{
		return driver.findElement(login_link);
	}
	
	public WebElement titleCheck()
	{
		return driver.findElement(validate_title);
	}
	
	public WebElement NavigationBarCheck()
	{
		return driver.findElement(navigation);
	}
}
