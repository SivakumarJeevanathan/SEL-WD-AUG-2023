package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadDD 
{
	public static void main(String[] args) 
	{
		// ChromeOptions op = new ChromeOptions();

		//op.setBinary("C:\\Users\\dell\\Downloads\\chrome-win64 (1)");

		//ChromeDriver driver = new ChromeDriver(op);
		// Setup the path and launch the browser

	
	// 1. Launch http://leaftaps.com/opentaps
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/logout");
		System.out.println("Pass: Browser launched");

	// maximize the window
		driver.manage().window().maximize();
		System.out.println("Pass: Browser Maximised");
		
	// FindElement and Enter username as demoSalesManager
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		System.out.println("Pass: UserName entered");
		
	// FindElement and Enter password as crmsfa
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		System.out.println("Pass: Password entered");

	// FindElement and Click on Login
		driver.findElement(By.className("decorativeSubmit")).click();
		System.out.println("Pass: Login Button Clicked");
	
	// Get Title of the page and print it
		String title = driver.getTitle();
		System.out.println("The Title of the Web page is: "+ title);
	
	// Click on CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		System.out.println("Pass: Link CRM/SFA clicked");
		
	// Click on Leads
		driver.findElement(By.linkText("Leads")).click();
		System.out.println("Pass: Leads Tab clicked");
	
	// Click on Create lead
		driver.findElement(By.linkText("Create Lead")).click();
		System.out.println("Pass: Create Lead clicked");
	
	// Enter the mandatory fields
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		System.out.println("Pass: Company Name entered");

	// Enter the mandatory fields
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sivakumar");
		System.out.println("Pass: User First Name entered");
	
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Jeevanathan");
		System.out.println("Pass: User Last Name entered");
	
	// Dropdown action - Select Employee in source dropdown using index
		WebElement Source =  driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select Source_items = new Select(Source);
		Source_items.selectByIndex(4);
		System.out.println("Pass: Option Employee from dropdown is choosen");
		
	// Dropdown action - Select Automobile in MarketCampaign using visibleText
			WebElement Marketing_Campaign =  driver.findElement(By.id("createLeadForm_marketingCampaignId"));
			Select MC_items = new Select(Marketing_Campaign);
			MC_items.selectByVisibleText("Automobile");
			System.out.println("Pass: Option Automobile from dropdown is choosen");
		
	// Dropdown action - Select Corporation in Ownership using value
			WebElement Ownership =  driver.findElement(By.id("createLeadForm_ownershipEnumId"));
			Select Own_items = new Select(Ownership);
			Own_items.selectByValue("OWN_CCORP");
			System.out.println("Pass: Option Corporation from dropdown is choosen");

	// Click CreateLead
		driver.findElement(By.name("submitButton")).click();
		System.out.println("Pass: Submit button is clicked");
			
	// Verify the text and print it
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println("Thw company name is: "+text);
		
	// Close the browser 
		driver.close();
		System.out.println("Pass: Browser Closed");
	}
}
