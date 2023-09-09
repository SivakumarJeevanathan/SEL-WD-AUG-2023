package week4.day1;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3_DD_Amazon 
{
	public static void main(String[] args) 
	{
		/*
		Hints: Look what is common locator for all price info of every phone. 
		*/
        		System.out.println("* * * Script to automate Dropdown * * *");
        		
        		ChromeDriver Driver = new ChromeDriver(); // Step 1 - Launch and Maximize the browser
		        Driver.manage().window().maximize();
		        Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		        
		        Driver.get("https://amazon.in"); // Step 2 - Go to  https://amazon.in
		        
		        //Driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phones");
		        //Driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		       
		        Driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone",Keys.ENTER); // Step 3 - In search box Type "iphones" and press enter button .Hint: id: twotabsearchtextbox
		        
		        // STEP 4 - Print price of every phone. Hint -> class: a-price-whole//span[@class='a-price-whole']
		        List<WebElement> Item_Price_list = Driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		        List<WebElement> Item_Name_list = Driver.findElements(By.xpath("//span [@class='a-size-medium a-color-base a-text-normal']"));
		        System.out.println("Value of price displayed (trying to print directly from WEB PAGE): " + "\n" +Item_Price_list);
		        System.out.println("The Name of Item displayed (trying to print directly from WEB PAGE): " + "\n" +Item_Name_list);
		        
		        System.out.println("Total no of phone Price display is: "+Item_Price_list.size());
		        System.out.println("Total no of phone Name display is: "+Item_Name_list.size());
		        
		        for (int i = 2; i <Item_Price_list.size(); i++)
		        {
		        	// System.out.print("The Product name is: " +Item_Name_list.get(i).getText());
		        	// System.out.println(" and the price value is: " +Item_Price_list.get(i).getText());
		        	System.out.println("The Product name is: " +Item_Name_list.get(i).getText()+ " and the price value is: " +Item_Price_list.get(i).getText());
		        }
		        Driver.close();
	}
}
