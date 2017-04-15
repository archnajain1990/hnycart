package pages;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Actionsclass 
{

	@Test
	public void case1()
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://shop.thetestingworld.com");
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElementByXPath("//*[text()='Components']")).perform();
		act.moveToElement(driver.find("//[text()='Monitors']")).perform();
		
		
		
	}
}
