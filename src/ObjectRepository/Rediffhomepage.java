package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Rediffhomepage {

	WebDriver driver;
	public Rediffhomepage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	By search=By.cssSelector(".homesrchbox");
	By latesttab=By.xpath("//div[@id='tabtable']/div[2]");
	
	
	
	public WebElement Search()
	{
		return driver.findElement(search);
	}
	
	public WebElement LatestTab()
	{
		return driver.findElement(latesttab);
	}
}
