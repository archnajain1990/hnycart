package pages;

import java.io.File;
import java.io.IOException;
import java.util.ResourceBundle;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.interactions.Actions;

import base.Baseclass;



public class FindSearch extends Baseclass
{

	//FirefoxDriver driver=new FirefoxDriver();
	ResourceBundle rb;
	File f1,f2;
	
	//Parameterized constructor
	public FindSearch()
	{
		//this.driver=driver;
		rb=ResourceBundle.getBundle("Element");
		f1=getdriver().getScreenshotAs(OutputType.FILE);
	}
	
	//For locating the link on search page
	public void findSearchFromDropDown(String textname)
	{
		//String element1;
		//String element1= getdriver().findElement(By.partialLinkText(textname));
		Actions a1= new Actions(driver);
		//a1.keyDown();
		
		
		
	}
	
	//For enter text on search box and click 
	public void clickGo(String searchtext)
	{
		//System.out.println("inside  click Go method");
		getdriver().findElementById(rb.getString("search_textbox")).sendKeys(searchtext);
		//System.out.println("entered element in search box");
		getdriver().findElementByXPath(rb.getString("search_image_Xpath")).click();	
	}
	
	//for Capture screenshot of pages
	public void screenShot() throws IOException
	{
		f1=getdriver().getScreenshotAs(OutputType.FILE);
		f2=new File("./Screenshots/1.png");
		FileUtils.copyFile(f1, f2);
		
	}
}



/*package pages;

import java.io.File;
import java.io.IOException;
import java.util.ResourceBundle;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindSearch 
{

	FirefoxDriver driver;
	ResourceBundle rb;
	File f1,f2;
	
	public FindSearch(FirefoxDriver driver)
	{
		this.driver=driver;
		rb=ResourceBundle.getBundle("Element");
		f1=driver.getScreenshotAs(OutputType.FILE);
	}
	
	public void clickGo(String searchtextname)
	{
		driver.findElementById(rb.getString("search_textbox")).sendKeys(searchtextname);
		driver.findElementByXPath(rb.getString("search_image_Xpath")).click();	
	}
	
	public void screenShot() throws IOException
	{
		f1=driver.getScreenshotAs(OutputType.FILE);
		f2=new File("./Screenshots/1.png");
		FileUtils.copyFile(f1, f2);
		
	}
}*/
