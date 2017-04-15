package testcases;
import java.io.IOException;

import org.testng.annotations.Test;
import base.Baseclass;
import pages.FindSearch;


public class TC_002 extends Baseclass
{

	@Test	
	public void test1() throws IOException
		{
	
			FindSearch fr=new FindSearch();
			fr.clickGo("enema");
			//System.out.println("Text entered in search box");
			fr.screenShot();
			fr.findSearchFromDropDown("Enema");
		}
}



/*package testcases;

import java.io.IOException;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pages.FindSearch;

public class TC_002 
{
	@Test
		public void testcase1() throws InterruptedException, IOException
		{
			System.setProperty("webdriver.gecko.driver","./Driver/geckodriver.exe");
			FirefoxDriver driver=new FirefoxDriver();
			driver.get("http://www.healthandyoga.com");
			FindSearch fr=new FindSearch(driver);
			fr.clickGo("Neti pot");
			fr.screenShot();
		}
}*/

