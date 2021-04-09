package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffhomepagePF {

	WebDriver driver;
	public RediffhomepagePF(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="srchword")
	WebElement search;
	
	@FindBy(xpath="//div[@id='tabtable']/div[2]")
	WebElement latesttab;
	
	public WebElement Search()
	{
		return search;
	}
	
	public WebElement LatestTab()
	{
		return latesttab;
	}
	/*
	By search=By.cssSelector(".homesrchbox");
	By latesttab=By.xpath("//div[@id='tabtable']/div[2]");
	*/
	
	/*
	public WebElement Search()
	{
		return driver.findElement(search);
	}
	
	public WebElement LatestTab()
	{
		return driver.findElement(latesttab);
	}
	*/
	
}
