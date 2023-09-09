package week4.day1.Assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumOptions;

public class P2_Ajio 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("\n* * *  Automation Script for AJIO * * * ");
//		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options); // Launch and Maximize the browser
		driver.get("https://www.ajio.com/"); // 1. Launch the URL https://www.ajio.com/
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
// driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("//input [@class='react-autosuggest__input react-autosuggest__input--open']")).sendKeys("bags",Keys.ENTER); //2. In the search box, type as "bags" and press enter
		//driver.findElement(By.xpath("//input [@type='checkbox' and @id='Men']")).click();  // 3. To the left  of the screen under " Gender" click the "Men"
		String Item_Gender = driver.findElement(By.xpath("//label [contains(text(),'Men')]")).getText(); 
		driver.findElement(By.xpath("//label [contains(text(),'Men')]")).click();
		Thread.sleep(3000);
		
		String Item_Category = driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]")).getText(); 
		System.out.println(Item_Category);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]")).click(); //4. Under "Category" click "Fashion Bags"
		Thread.sleep(3000);
		
		String Item_Count = driver.findElement(By.xpath("//div[@class='length']")).getText(); //5. Print the count of the items Found.
		System.out.println("The total no of "+Item_Category+"found for "+Item_Gender+ "is:"+Item_Count);
		
		List <WebElement> Total_Brand_List = driver.findElements(By.xpath("//div[@class='brand']")); 
		System.out.println("The Total no of Bags brands found in this page is: "+Total_Brand_List.size());
		System.out.println("The following are the brand displaying in web page: ");
		for (int i=0; i< Total_Brand_List.size();i++) //(2) Use FOR Loop, using the SIZE() Method.
			{
				System.out.println("S.NO - "+i+" "+Total_Brand_List.get(i).getText());//6. Get the list of brand of the products displayed in the page and print the list.
			}
		
		List <WebElement> Total_Brand_Name = driver.findElements(By.xpath("//div[@class='nameCls']")); 
		System.out.println("The Total no of Bags Names found in this page is: "+Total_Brand_Name.size());
		System.out.println("The following are the Bags displaying in web page: ");
		for (int i=0; i< Total_Brand_Name.size();i++) 
			{
				System.out.println("S.NO - "+i+" "+Total_Brand_Name.get(i).getText());//7. Get the list of names of the bags and print it
			}
			
		driver.close();
		System.out.println("The browser is closed");
	}
}

/*
OUTPUT: PASS
PSEUDO CODE / STEPS: 
	1. Launch the URL https://www.ajio.com/
	2. In the search box, type as "bags" and press enter
	3. To the left  of the screen under " Gender" click the "Men"
	4. Under "Category" click "Fashion Bags"
	5. Print the count of the items Found. 
	6. Get the list of brand of the products displayed in the page and print the list.
	7. Get the list of names of the bags and print it
*/