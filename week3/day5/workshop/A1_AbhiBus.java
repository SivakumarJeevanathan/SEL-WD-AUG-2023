package week3.day5.workshop;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A1_AbhiBus 
{
	public static void main(String[] args) 
	{
		System.out.println("* * * WELCOME TO ABHIBUS WEB PAGE Automation * * * ");
	
		ChromeDriver Driver = new ChromeDriver();
		System.out.println("STEP 1: PASS - Browser opened in chrome.");
// 1. maximize the window and initiate implicity wait
		Driver.manage().window().maximize();
		System.out.println("STEP 1.1: PASS - Browser Maximized");
				
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		System.out.println("STEP 1.2: PASS - Implicit Wait is triggered");
		
// 2. Load https://www.abhibus.com/		
		Driver.get("https://www.abhibus.com/");
		System.out.println("STEP 2: PASS - Browser opened in chrome and ABHIBUS URL is launched.");
				
//3. Click on Bus
		Driver.findElement(By.xpath("//a[@id='pills-home-tab']")).click();
		System.out.println("STEP 3: PASS - Bus Option is clicked.");
				
//4. Type "Chennai" in the FROM text box --> USE 'setTimeout(function(){debugger;}, 5000)'
		Driver.findElement(By.xpath("(//input[contains(@class,'form-control border-0')])[1]")).sendKeys("Chennai");
		//Driver.findElement(By.xpath("//input[@id='source' and @type='text']").sendKeys("Chennai");
		System.out.println("STEP 4: PASS - Control moved to FROM TextBox and text CHENNAI is typed inside the TextBox.");
				
		
//5. Click the first option from the pop up box
		//Driver.findElement(By.xpath("//li[@class='ui-menu-item' and text()='Chennai']")).click();
		//Driver.findElement(By.cssSelector("//li[@class='ui-menu-item' and text()='Chennai']")).click();
		Driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		System.out.println("STEP 5: PASS - Chennai option is choosen in FROM TextBox");

// 6. Type "Bangalore" in the TO text box
		Driver.findElement(By.xpath("//input[@id='destination' and @type='text']")).sendKeys("Bangalore");
		System.out.println("STEP 6: PASS - Control moved to GOING TO TextBox and text BANGALORE is typed inside the TextBox.");
		
// 7. Click the first option from the pop up box
		Driver.findElement(By.xpath("//li[contains(text(),'Bangalore')]")).click();
		System.out.println("STEP 7: PASS - Bangalore option is entered and choosen in GOING TO TextBox");
		
//8. Select tomorrow s date in the Date field
		Driver.findElement(By.xpath("//INPUT[@id='datepicker1']")).click();
		Driver.findElement(By.xpath("//td[contains(@class,'ui-datepicker-days-cell-over ')]//a[1]")).click();
		System.out.println("STEP 8: PASS - Today date option is choosen in Date field");
		
//9. Click Search Buses
		Driver.findElement(By.xpath("//a[contains(@class,'btn btn-main')]")).click();
		System.out.println("STEP 9: PASS - Search button is clicked");
		
//10. Print the name of the first resulting bus (use .getText())
		String First_resulting_Bus = Driver.findElement(By.xpath("(//h2[@class='TravelAgntNm ng-binding'])[1]")).getText();
		System.out.println("STEP 10: PASS - the name of first resulting bus is: "+First_resulting_Bus);
		
//11. Choose SLEEPER in the left menu from Bus Type
		Driver.findElement(By.xpath("//input[@name='Bustypes' and @title='SLEEPER']")).click();
		System.out.println("STEP 11: PASS - Sleeper option is clicked");
		
// 12. Print the first resulting bus seat count(Example:35 Seats Available)(use .getText())
		String first_resulting_bus_seat_count = Driver.findElement(By.xpath("(//p [contains(@class,'noseats')])[1]")).getText();
		System.out.println("STEP 12: PASS - The no of seat available in " +First_resulting_Bus+ " travel is: "+first_resulting_bus_seat_count);

//13. Click SelectSeat
		Driver.findElement(By.xpath("(//span[text()='Select Seat'])[1]")).click();
		System.out.println("STEP 13: PASS - Select seat button is clicked");
		
//14. Choose any one Available seat
		Driver.findElement(By.xpath("(//li[contains(@class,'sleeper available')]//a[@class='tooltip tooltipstered'])[10]")).click();
		System.out.println("STEP 14: PASS - Lower vacant seat is slected");
		
//15. Print Seats Selected ,Total Fare
		String Selected_Seat_No = Driver.findElement(By.xpath("//span[@id='seatnos']")).getText();
		System.out.println("STEP 15.1: PASS - The Seat no "+Selected_Seat_No+ " is selected");

		String Total_Fare = Driver.findElement(By.xpath("//span[@id='ticketfare']")).getText();
		System.out.println("STEP 15.2: PASS - The Total fare of selected seat is: "+Total_Fare);
		
//16. Select Boarding Point  and Dropping Point (Select class)
		WebElement Boarding_Point = Driver.findElement(By.xpath("//select[@id='boardingpoint_id']"));
		Select Options_Boarding_Point = new Select(Boarding_Point);
		//Options_Boarding_Point.selectByValue("491^Sathyabamba University^10:12 PM^University Main Gate^University Main Gate,University Main Gate^");
		Options_Boarding_Point.selectByIndex(3);
		System.out.println("STEP 16.1: PASS - Boarding point is selected");
		//System.out.println("STEP 16.1: PASS - Boarding point "+Options_Boarding_Point+ " is selected");
		
		WebElement Dropping_Point = Driver.findElement(By.xpath("//select[@id='droppingpoint_id']"));
		Select Options_Dropping_Point = new Select(Dropping_Point);
		Options_Dropping_Point.selectByIndex(3);
		// Options_Dropping_Point.selectByVisibleText("Electronic City Toll Gate-05:19"); --> NEED TO BE VERIFIED		
		System.out.println("STEP 16.2: PASS - Dropping point "+Options_Dropping_Point+ " is selected");
		
//17. Get the Title of the page(use .getTitle())
		String Web_Page_title = Driver.getTitle();
		System.out.println("STEP 17: PASS - The tittle of web page is:" +Web_Page_title);
		
//18. Close the browser (Do not log out)
		Driver.close();
		System.out.println("STEP 18: PASS - Browser Closed");
		
	}

}

