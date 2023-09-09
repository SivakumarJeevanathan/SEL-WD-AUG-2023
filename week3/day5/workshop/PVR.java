package week3.day5.workshop;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumOptions;

public class PVR 
{
	public static void main(String[] args) 
	{

		System.out.println("* * * WELCOME TO AMAZON WEB PAGE Automation * * * ");
//Code to handle browser notification
		WebDriverManager.chromedriver().setup();
		ChromiumOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver Driver = new ChromeDriver(options);
		Driver.get("");
		
//(01) Launch Chrome browser, maximize the window and initiate implicity wait
		// ChromeDriver Driver = new ChromeDriver();
		System.out.println("STEP 1.1: PASS - Browser opened in chrome.");
				
		Driver.manage().window().maximize();
		System.out.println("STEP 1.2: PASS - Browser Maximized");
				
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		System.out.println("STEP 1.3: PASS - Implicit Wait is triggered");

//(02) Launch the Url  https://www.pvrcinemas.com/
		Driver.get("https://www.pvrcinemas.com/");
		System.out.println("STEP 2: PASS - Browser opened in chrome and AMAZON URL is launched.");


		
//(03) Click  on Movie Library
		
//(04) Select the City -->chennai
//(05) Select the Genre-->Animation
//(06) Select the Language-->english
//(07) Click on Apply
//(08) Click on first resulting animation movie
//(09) Click proceed to book
//(10) Enter  all  the fields  cinema , Name, date, Prefered show time, no of seats, food and beverages,Email and Mobile
//(11) Click on copy to self 
//(12) Click on  Send Request
//(13) Click cancel 
//(14) Close the OTP dialog
//(15) Verify the title of the page


		
	}
}
