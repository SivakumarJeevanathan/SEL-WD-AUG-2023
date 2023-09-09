package week2.day5.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class A2_CreateLead 
{
	public static void main(String[] args) 
	{

	// * 1. Launch URL "http://leaftaps.com/opentaps/control/login"
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/logout");
		System.out.println("Pass: Browser launched");

	// maximize the window
		driver.manage().window().maximize();
		System.out.println("Pass: Browser Maximised");
		
// * 2. Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		System.out.println("Pass: UserName entered");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		System.out.println("Pass: Password entered");

// * 3. Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
		System.out.println("Pass: Login Button Clicked");

// * 4. Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
		System.out.println("Pass: Link CRM/SFA clicked");

// * 5. Click on Leads Button
		driver.findElement(By.linkText("Leads")).click();
		System.out.println("Pass: Leads Tab clicked");

// * 6. Click on create Lead Button
		driver.findElement(By.linkText("Create Lead")).click();
		System.out.println("Pass: Create Lead clicked");
		
// * 7. Enter CompanyName using id Locator
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		System.out.println("Pass: Company Name entered");
		
// * 8. Enter FirstName using id Locator
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sivakumar");
		System.out.println("Pass: User First Name entered");
	
// * 9. Enter LastName using id Locator
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Jeevanathan");
		System.out.println("Pass: User Last Name entered");
		
// * 10. Enter your mail-id
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Siva21.techracer@gmail.com");
		System.out.println("Pass: User Email details entered");
		
// * 11.phone number
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("+918807873870");
		System.out.println("Pass: User Mobile number entered");
		
// * 12. Click on create Lead Button Using name Locator
		driver.findElement(By.xpath("//input[@class='smallSubmit' and @name='submitButton']")).click();
		System.out.println("Pass: Click button is clicked");

// Close the browser 
		driver.close();
		System.out.println("Pass: Browser Closed");
	}
}
