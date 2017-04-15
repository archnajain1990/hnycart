package pages;

import java.util.ResourceBundle;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage 

{
	ResourceBundle rb;
	FirefoxDriver driver;
	
	public LoginPage(FirefoxDriver driver)
	
	{
		this.driver=driver;
		rb=ResourceBundle.getBundle("Element");	
	}

	public void enterUsername(String uname)
	{
		//driver.findElementById("email").sendKeys(uname);
		driver.findElementById(rb.getString("login_username_id")).sendKeys(uname);
	}
	
	public void enterPassword(String upass)
	{
		//driver.findElementById("pass").sendKeys(upass);
		driver.findElementByXPath(rb.getString("login_pass_Xpath")).sendKeys(upass);
	}
	
	public void clickSignin()
	{
		driver.findElementById("u_0_q").click();
	}
}
