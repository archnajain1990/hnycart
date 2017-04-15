package testcases;


import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pages.LoginPage;

public class TC_001
{
	@Test
	public void testcase1()
	{
		System.setProperty("webdriver.gecko.driver","./Driver/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		//driver.get("http://www.healthandyoga.com");
		//driver.findElementById("txtSearch").sendKeys("Enema catheter");
		//driver.findElementByXPath("//img[@src='Newimages/search_button.png']").click();
		 
		driver.get("http://www.facebook.com");

		LoginPage logIn=new LoginPage(driver);

		logIn.enterUsername("archnajain89@gmail.com");
		logIn.enterPassword("gjhgjf");
		logIn.clickSignin();
		
	}
}