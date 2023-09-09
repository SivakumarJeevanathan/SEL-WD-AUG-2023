package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown 
{

	public static void main(String[] args) 
	{
		//Setup the path and launch the browser
		ChromeDriver driver =new ChromeDriver(); 

		//Load the url
		driver.get("https://www.leafground.com/select.xhtml");

		//maximize the window
		driver.manage().window().maximize();

		//Username is identified by element ID and Enter keys action is performed.
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");

	     // Step:1 Locate the dropdown web element
		 WebElement drop1 = driver.findElement(By.className("ui-selectonemenu"));// ctrl+2+l
	        
		 // Step:2 Instantiate Select class
	        Select tools = new Select(drop1);
	     
	     // Call select class method to pick the option from dropdown
	        //tools.selectByIndex(2);
	        //tools.selectByVisibleText("Puppeteer");
	        tools.selectByValue("ui-selectonemenu-label");
	}

}

