package week2.day5.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A5_CreateAccount 
{
	public static void main(String[] args) 
	{
// * 1	Launch the browser - *http://leaftaps.com/opentaps/control/main
				ChromeDriver Driver = new ChromeDriver();
				Driver.get("http://leaftaps.com/opentaps/control/main");
				System.out.println("Pass: Browser launched");

// maximize the window and initiate implicity wait
				Driver.manage().window().maximize();
				Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				System.out.println("Pass: Browser Maximized");
				System.out.println("Pass: Implicit Wait triggered");

// * 2. Enter the Username and password
				Driver.findElement(By.id("username")).sendKeys("demosalesmanager");
				System.out.println("Pass: UserName entered");
				Driver.findElement(By.id("password")).sendKeys("crmsfa");
				System.out.println("Pass: Password entered");
							
// * 3. Click Login
				Driver.findElement(By.className("decorativeSubmit")).click();
				System.out.println("Pass: Login Button Clicked");
							
// * 4. Click CRM/SFA link
				Driver.findElement(By.linkText("CRM/SFA")).click();
				System.out.println("Pass: Link CRM/SFA clicked");
	
// 5. Click on Accounts Button
				Driver.findElement(By.xpath("(//ul [@class='shortcuts']//a)[2]")).click();
				// Driver.findElement(By.xpath("//button[@class='x-btn-text' and text()='Create Account']")).click(); --> not working
				System.out.println("PASS: Account button is clicked");
				
// 6. Click on Create Account
//????	
  
// 7. Enter AccountName Field Using Xpath Locator value as Debit Limited Account
				Driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account - Siva");
				System.out.println("PASS: Value enterd in Account Name");
				
// 8. Enter DEscriptiion as "Selenium Automation Tester"
				Driver.findElement(By.xpath("//textarea [@name='description' and @class='inputBox']")).sendKeys("Selenium Automation Tester");
				System.out.println("PASS: Value enterd in Description");
				
// 9. Enter LocalName Field Using Xpath Locator
				Driver.findElement(By.id("groupNameLocal")).sendKeys("Test_Local_Name");
				System.out.println("PASS: Value enterd in Local Name");
				
// 10. Enter SiteName Field Using Xpath Locator
				Driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("Test_Site_Name");
				System.out.println("PASS: Value enterd in Site Name");

// 11. Enter value for AnnualRevenue Field using Xpath Locator but class as Attribute
				Driver.findElement(By.xpath("//input[@class='inputBox' and @id='annualRevenue']")).sendKeys("10000000");
				System.out.println("PASS: Value enterd in Annual revenue");
				
// 12. Select Industry as ComputerSoftware
				WebElement Industry = Driver.findElement(By.xpath("//select[@name='industryEnumId']"));
				Select Options_Industry = new Select(Industry);
				Options_Industry.selectByValue("IND_SOFTWARE");
				System.out.println("PASS: Industry is Choosen");
				
// 13. Select OwnerShip as S-Corporation using SelectByVisibletext
				WebElement OwnerShip = Driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
				Select Options_OwnerShip = new Select(OwnerShip);
				Options_OwnerShip.selectByVisibleText("S-Corporation");
				System.out.println("PASS: OwnerShip is Choosen");
				
// 14. Select Source as Employee using SelectByValue
				WebElement Source = Driver.findElement(By.xpath("//select[@id='dataSourceId']"));
				Select Options_Source = new Select(Source);
				Options_Source.selectByValue("LEAD_EMPLOYEE");
				System.out.println("PASS: Source is Choosen");
				
// 15. Select Marketing Campaign as eCommerce Site Internal Campaign using SelectbyIndex
				WebElement Marketing_Campaign = Driver.findElement(By.xpath("//select[@id='marketingCampaignId']"));
				Select Options_Marketing_Campaign = new Select(Marketing_Campaign);
				Options_Marketing_Campaign.selectByIndex(5);
				System.out.println("PASS: Marketing Campaign is Choosen");
				
// 16. Select State/Province as Texas using SelectByValue 
				WebElement State = Driver.findElement(By.xpath("//select[@id='generalStateProvinceGeoId']"));
				Select Options_State = new Select(State);
				Options_State.selectByValue("TX");
				System.out.println("PASS: State is Choosen");
				
// 17. Click on Create Account using Xpath Locator
				Driver.findElement(By.xpath("//input[@type='submit']")).click();
				System.out.println("PASS: A new account is created");	

// 18	Close the browser (Do not log out)
				Driver.close();
				System.out.println("Pass: Browser Closed");
	}
}
