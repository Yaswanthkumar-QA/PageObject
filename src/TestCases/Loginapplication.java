package TestCases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepository.Rediffhomepage;
import ObjectRepository.RediffhomepagePF;
import ObjectRepository.Rediffloginpage;
import ObjectRepository.RediffloginpagePF;

public class Loginapplication {

	@Test
	public void Login()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\work\\WebDriver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		/*
		Rediffloginpage rl=new Rediffloginpage(driver);
		rl.Emailid().sendKeys("hello");
		rl.Password().sendKeys("12345");
		rl.Login().click();
		rl.Home().click();
		*/
		
		RediffloginpagePF rpf=new RediffloginpagePF(driver);
		rpf.Emailid().sendKeys("hello");
		rpf.Password().sendKeys("12345");
		rpf.Login().click();
		rpf.Home().click();
		/*
		Rediffhomepage rh=new Rediffhomepage(driver);
		rh.Search().sendKeys("honor");
		rh.LatestTab().click();
		*/
		RediffhomepagePF rhpf=new RediffhomepagePF(driver);
		rhpf.Search().sendKeys("honor");
		rhpf.LatestTab().click();
		
	}
}
