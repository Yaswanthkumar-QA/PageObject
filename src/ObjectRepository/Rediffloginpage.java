package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Rediffloginpage {

	WebDriver driver;
	public Rediffloginpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By username=By.xpath("//input[@id='login1']");
	By password=By.xpath("//input[@id='password']");
	By login=By.xpath("//input[@type='submit']");
	By home=By.cssSelector(".f12");
	
	public WebElement Emailid()
	{
		return driver.findElement(username);
	}
	
	public WebElement Password()
	{
		return driver.findElement(password);
	}
	
	public WebElement Login()
	{
		return driver.findElement(login);
	}
	
	public WebElement Home()
	{
		return driver.findElement(home);
	}
	
	
}
