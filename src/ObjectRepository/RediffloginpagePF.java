package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffloginpagePF {

	WebDriver driver;
	public RediffloginpagePF(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	/*
	By username=By.xpath("//input[@id='login1']");
	By password=By.xpath("//input[@id='password']");
	By login=By.xpath("//input[@type='submit']");
	By home=By.cssSelector(".f12");
	*/
	
	@FindBy(xpath="//input[@id='login1']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement login;
	
	@FindBy(css=".f12")
	WebElement home;
	/*
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
	
	*/
	
	public WebElement Emailid()
	{
		return username;
	}
	
	public WebElement Password()
	{
		return password;
	}
	
	public WebElement Login()
	{
		return login;
	}
	
	public WebElement Home()
	{
		return home;
	}
}
