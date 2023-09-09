package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLogin 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		System.out.println("Browserlaunched and application is accessed");
		driver.close();
	}

}

//