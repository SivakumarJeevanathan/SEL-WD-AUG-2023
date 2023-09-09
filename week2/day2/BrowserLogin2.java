package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLogin2 
{

	public static void main(String[] args) 
	{
		//Setup the path and launch the browser
		ChromeDriver driver =new ChromeDriver(); 

		//Load the url
		driver.get("http://leaftaps.com/opentaps/control/logout");

		//maximize the window
		driver.manage().window().maximize();

		//Username is identified by element ID and Enter keys action is performed.
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");

		//Password is identified by element ID and Enter keys action is performed.
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Login button is identified by element CLASS and CLICK action is performed.
		driver.findElement(By.xpath("//div[@id='label']//a[1]")).click();
		
		// Get the title of the page
		String Title = driver.getTitle();
		System.out.println(Title);
		
		System.out.println("Browserlaunched and Operation performed");
		driver.close();
	}

}

