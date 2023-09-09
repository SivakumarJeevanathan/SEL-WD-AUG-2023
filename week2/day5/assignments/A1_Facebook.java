package week2.day5.assignments;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A1_Facebook 
{
	public static void main(String[] args) 
		{
		// Step 2: Launch the chrome browser
			ChromeDriver Driver = new ChromeDriver();
			System.out.println("Pass: Browser launched");
		
		// Step 3: Load the URL https://en-gb.facebook.com/
			Driver.get("https://en-gb.facebook.com/");
			System.out.println("Pass: URL Loaded");
			
		// Step 4: Maximize the window
			Driver.manage().window().maximize();
			System.out.println("Pass: Browser Maximised");
		
		// Step 5: Add implicit wait
			// Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); -- Deprecated
			Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			System.out.println("Pass: Implicit Wait triggered");
			
		// Step 6: Click on Create New Account button
			Driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
			System.out.println("Pass: Creat new acount button clicked");
		
		// Step 7: Enter the first name
			Driver.findElement(By.xpath("//input[@data-type='text' and @name='firstname']")).sendKeys("Varnika");
			//Driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Varnika");
			System.out.println("Pass: Firstname entered");
		
		// Step 8: Enter the last name
			Driver.findElement(By.xpath("//input[@data-type='text' and @name='lastname']")).sendKeys("Sivakumar");
			System.out.println("Pass: Last Name entered");
			
		// Step 9: Enter the mobile number
			Driver.findElement(By.xpath("//input[contains(@name,'reg_email__')]")).sendKeys("8807873870");
			System.out.println("Pass: Mobile Number entered");
			
		// Step 10: Enter the password
			Driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("VARNIKA1407");
			System.out.println("Pass: Password entered");
			
		// Step 11: Handle all the three drop downs
			WebElement BIRTHDAY = Driver.findElement(By.xpath("//select [@id='day']"));// ctrl+2+
			Select Choose_BIRTHDAY = new Select(BIRTHDAY);
			Choose_BIRTHDAY.selectByValue("14");
			System.out.println("Pass: Birthday Selected");

			WebElement BIRTHMONTH = Driver.findElement(By.xpath("//select [@title='Month' and @name='birthday_month']"));
			Select Choose_BIRTHMONTH = new Select(BIRTHMONTH);
			Choose_BIRTHMONTH.selectByIndex(6);
			System.out.println("Pass: Birthmonth selected");
			
			WebElement BIRTHYEAR = Driver.findElement(By.xpath("//select [@id='year']"));
			Select Choose_BIRTHYEAR = new Select(BIRTHYEAR);
			Choose_BIRTHYEAR.selectByValue("2023");
			System.out.println("Pass: Birth year selected");
			
		// Step 12: Select the radio button "Female"
			//Driver.findElement(By.xpath("//input[@type='radio' and @name='sex'][1]")).click();
			Driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
			System.out.println("Pass: Gender as FEMALE checked");
			
			Driver.close();
			System.out.println("Pass: Browser Closed");
		}
}
