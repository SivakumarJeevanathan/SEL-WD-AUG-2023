package week2.day5.assignments;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class A4_DeleteLead 
{
	public static void main(String[] args) 
	{
// * 1	Launch the browser - *http://leaftaps.com/opentaps/control/main
		ChromeDriver Driver = new ChromeDriver();
		Driver.get("http://leaftaps.com/opentaps/control/main");
		System.out.println("Pass: Browser launched");

// 2. maximize the window and initiate implicity wait
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		System.out.println("Pass: Browser Maximized");
		System.out.println("Pass: Implicit Wait triggered");

// * 3. Enter the username and password
		Driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		System.out.println("Pass: UserName entered");
		Driver.findElement(By.id("password")).sendKeys("crmsfa");
		System.out.println("Pass: Password entered");
					
// * 4. Click Login
		Driver.findElement(By.className("decorativeSubmit")).click();
		System.out.println("Pass: Login Button Clicked");
					
// * 5. Click crm/sfa link
		Driver.findElement(By.linkText("CRM/SFA")).click();
		System.out.println("Pass: Link CRM/SFA clicked");

// * 6	Click Leads link
		Driver.findElement(By.linkText("Leads")).click();
		System.out.println("Pass: Leads Tab clicked");
					
// * 7	Click Find leads
		Driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		System.out.println("Pass: Find Leads link clicked");

//	8	Click on Phone
		Driver.findElement(By.xpath("//span[text()='Phone']")).click();
		System.out.println("Pass: Phone tab is clicked");
		
//	9	Enter phone number
		Driver.findElement(By.xpath("//input[@type='text' and @name='phoneNumber']")).sendKeys("918807873870");
		System.out.println("Pass: Phone no entered");
		
//		10	Click find leads button
		Driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		System.out.println("Pass: Find lead button is clicked");
		
//		11	Capture lead ID of First Resulting lead
		String Lead_ID = Driver.findElement(By.xpath("(//a[contains(text(),13083)])[1]")).getText();
		System.out.println("Pass: The lead ID" +Lead_ID+ "is captured");
		
//		12	Click First Resulting lead
		Driver.findElement(By.xpath("(//a[contains(text(),13083)])[1]")).click();
		System.out.println("Pass: First result is clickedis clicked");

//		13	Click Delete
		Driver.findElement(By.xpath("//a [@class='subMenuButtonDangerous']")).click();
		System.out.println("PASS: Delete button is clicked");
		
//		14	Click Find leads
		//Driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		Driver.findElement(By.xpath("(//ul[@class='shortcuts']//a)[3]")).click();
		System.out.println("Pass: Find lead button is clicked");
		
//		15	Enter captured lead ID
		Driver.findElement(By.xpath("(//span[text()='Advanced']/following::input)[1]")).sendKeys(Lead_ID);
		System.out.println("Pass: Captured Lead Id is entered");
		
//		16	Click find leads button
		Driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		System.out.println("Pass: Find Lead button is clicked");
		
//		17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		String No_Lead_Comp = Driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		if (No_Lead_Comp.equals("No records to display"))
		{
			System.out.println("PASS: Message No records to display in the Lead List is verified");
		}
		
//		18	Close the browser (Do not log out)
		Driver.close();
		System.out.println("Pass: Browser Closed");
		}
}
