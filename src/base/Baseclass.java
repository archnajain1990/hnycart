package base;

import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;

public class Baseclass 

{
	/*public static FirefoxDriver driver;
		
	@BeforeMethod
	public void Startbrowser()
	{
	System.setProperty("webdriver.gecko.driver","./Driver/geckodriver.exe");
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("http://www.healthandyoga.com");
	}*/
	
	 public FirefoxDriver driver;

	 public Baseclass()
	 {
		System.setProperty("webdriver.gecko.driver","./Driver/geckodriver.exe");
	    driver = new FirefoxDriver();
	    driver.get("http://www.healthandyoga.com");
	  }
	 
	  public FirefoxDriver getdriver(){
	    if (driver == null){
	      driver = new FirefoxDriver();
	      return driver;
	    }else{
	      return driver;
	    }
	  }
	
	//@AfterMethod
	//public void closeBrowser()
	//{
	//	driver.quit();
		
	//}
}
