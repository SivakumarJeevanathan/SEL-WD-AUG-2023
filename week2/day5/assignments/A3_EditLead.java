package week2.day5.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class A3_EditLead 
{
	public static void main(String[] args) throws InterruptedException 
	{
// * 1	Launch the browser - *http://leaftaps.com/opentaps/control/main
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/control/logout");
			System.out.println("Pass: Browser launched");

// 2. maximize the window and initiate implicity wait
			driver.manage().window().maximize();
			System.out.println("Pass: Browser Maximised");	
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			System.out.println("Pass: Implicit Wait triggered");
			
// * 3. Enter the username and password
			driver.findElement(By.id("username")).sendKeys("demosalesmanager");
			System.out.println("Pass: UserName entered");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			System.out.println("Pass: Password entered");
			
// * 4. Click Login
			driver.findElement(By.className("decorativeSubmit")).click();
			System.out.println("Pass: Login Button Clicked");
			
// * 5. Click crm/sfa link
			driver.findElement(By.linkText("CRM/SFA")).click();
			System.out.println("Pass: Link CRM/SFA clicked");

// * 6	Click Leads link
			driver.findElement(By.linkText("Leads")).click();
			System.out.println("Pass: Leads Tab clicked");
			
// * 7	Click Find leads
			driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
			System.out.println("Pass: Find Leads link clicked");
			
// * 8	Enter first name
			driver.findElement(By.xpath("//input[@type='text' and @id='ext-gen248']")).sendKeys("Sivakumar");
			System.out.println("Pass: User FirstName is entered in Find leads Textbox");
			
// * 9	Click Find leads button
			driver.findElement(By.xpath("//button[@class='x-btn-text' and @type='button' and @id='ext-gen334']")).click();
			System.out.println("Pass: Find Leads click button is clicked");
			Thread.sleep(2000);
			
// * 10 Click on first resulting lead
			//String Previous_Company_Name = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-companyName'])[1]")).getText();
			//String Previous_Company_Name = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-companyName'])[1]")).getText();
			//driver.findElement(By.xpath("//a[@id='ext-gen923']")).click();
			//driver.findElement(By.linkText("12841")).click();
			driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]")).click();
			System.out.println("Pass: First result is clickedis clicked");
			
			String Previous_Company_Name = driver.findElement(By.xpath("//span[contains(text(),'12841')]")).getText();
			System.out.println("Company name copied as:"+Previous_Company_Name);
			
// * 11 Verify title of the page
			String Page_Title = driver.getTitle();
			String Actual_Tile = "View Lead | opentaps CRM";
			if (Page_Title == Actual_Tile)
				{
					System.out.println("Pass: Page Name"+Page_Title+"is verifed");
				}
			else
				{
				System.out.println("Fail: Page Name"+Page_Title+" verification is failed");
				}
			
			// if(Actual_Tile.equals(expectedTitle))	{	System.out.println("Passed. Title is verified:" +Actual_Tile);	}
			// else { System.out.println("Failed. Title is not matched:");	}
			
// * 12 Click Edit
			driver.findElement(By.xpath("//a[@class='subMenuButton'][3]")).click();
			System.out.println("Pass: Edit button is clicked");

// * 13 Change the company name
			driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
			driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("TCS");
			System.out.println("Pass: Company Name is renamed");
			
// * 14 Click Update
			driver.findElement(By.xpath("//input [@type='submit' and @value='Update']")).click();
			System.out.println("Pass: Update button clicked");
			
// * 15 Confirm the changed name appears
			//String Updated_Company_Name = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-companyName'])[1]")).getText();
			String Updated_Company_Name = driver.findElement(By.xpath("//span[contains(text(),'12841')]")).getText();
			if (Updated_Company_Name.equals(Previous_Company_Name))
				{
					System.out.println("FAIL: Company Name not updated");
				}
			else
				{
				System.out.println("The Company name is updated as:" +Updated_Company_Name+"from "+Previous_Company_Name);
				}
			
// * 16 Close the browser (Do not log out)	
			driver.close();
			System.out.println("Pass: Browser Closed");
	}

}
