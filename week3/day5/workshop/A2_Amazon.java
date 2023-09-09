package week3.day5.workshop;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A2_Amazon 
{
	public static void main(String[] args) throws InterruptedException 
		{
		System.out.println("* * * WELCOME TO AMAZON WEB PAGE Automation * * * ");
		
// 1. Launch Chrome browser, maximize the window and initiate implicity wait
		ChromeDriver Driver = new ChromeDriver();
		System.out.println("STEP 1.1: PASS - Browser opened in chrome.");
		
		Driver.manage().window().maximize();
		System.out.println("STEP 1.2: PASS - Browser Maximized");
		
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		System.out.println("STEP 1.3: PASS - Implicit Wait is triggered");

// 2. Load https://www.amazon.in/	
		Driver.get("https://www.amazon.in/");
		System.out.println("STEP 2: PASS - Browser opened in chrome and AMAZON URL is launched.");

// 03) Type "Bags" in the Search box
		Driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bags");
		System.out.println("STEP 3: PASS - Bags text is entered in the SEARCH BOX.");

// 04) Choose the item in the result (bags for boys)
		Driver.findElement(By.xpath("//span[text()=' for boys']")).click();
		System.out.println("STEP 4: PASS - The bags for Boys option from the search result is clicked");
		//Driver.findElement(By.xpath("(//div[text()='bags for boy'])[1]")).click();
		//Driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		// Thread.sleep(2000);
		// Driver.findElement(By.xpath("//span[text()='for boys']")).click();
		// Driver.findElement(By.xpath("//span[contains(text(),'bags for boys')]")).click();
		

// 05) Print the total number of results (like 50000)  --> 1-48 of over 50,000 results for "bags for boys"
		String Total_No_Results = Driver.findElement(By.xpath("//div [@class='a-section a-spacing-small a-spacing-top-small']")).getText();
		System.out.println("STEP 5: PASS - The total no fo results for search is: "+Total_No_Results);
		
// 06) Select the first 2 brands in the left menu (like American Tourister, Generic)
//		String First_item_Brand = Driver.findElement(By.xpath("(//div[@id='brandsRefinements']//a)[1]")).getText();
//		Driver.findElement(By.xpath("(//div[@id='brandsRefinements']//a)[1]")).click();
//		System.out.println("STEP 4.1: PASS - First item under the Brand "+First_item_Brand+" is selected");
		
//		String Second_item_Brand = Driver.findElement(By.xpath("(//div[@id='brandsRefinements']//a)[2]")).getText();
//		Driver.findElement(By.xpath("(//div[@id='brandsRefinements']//a)[2]")).click();
//		System.out.println("STEP 4.2: PASS - Second  item under the Brand "+Second_item_Brand+" is selected");
		
		
//		String First_item_Brand = Driver.findElement(By.xpath("(//span [text()='Brand']//following:: span)[1]")).getText();
//		Driver.findElement(By.xpath("(//span [text()='Brand']//following:: span)[1]")).click();
//		System.out.println("STEP 4.1: PASS - First item under the Brand "+First_item_Brand+" is selected");
//		
//		String Second_item_Brand = Driver.findElement(By.xpath("(//span [text()='Brand']//following:: span)[2]")).getText();
//		Driver.findElement(By.xpath("(//div[@id='brandsRefinements']//a)[2]")).click();
//		System.out.println("STEP 4.2: PASS - Second  item under the Brand "+Second_item_Brand+" is selected");
		
//		driver.findElement(By.xpath("(//span[text()='Brand']//following::span)[1]")).click();
//		driver.findElement(By.xpath("(//span[text()='Brand']//following::span)[2]")).click();
		
		String First_item_Brand = Driver.findElement(By.xpath("(//div[@id='brandsRefinements']//a)[1]")).getText();
		Driver.findElement(By.xpath("(//div[@id='brandsRefinements']//i)[1]")).click();
		//Driver.findElement(By.xpath("(//div[@id='brandsRefinements']//input[@type='checkbox'])[1]")).click();
		System.out.println("STEP 6.1: PASS - First item under the Brand "+First_item_Brand+" is selected");
		
		String Second_item_Brand = Driver.findElement(By.xpath("(//div[@id='brandsRefinements']//a)[3]")).getText();
		Driver.findElement(By.xpath("(//div[@id='brandsRefinements']//i)[2]")).click();
		System.out.println("STEP 6.2: PASS - Second  item under the Brand "+Second_item_Brand+" is selected");
		
// 07) Choose New Arrivals (Sort)
//		Driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
//		Driver.findElement(By.xpath("//a[contains(text(),'Newest Arrivals')]")).click();	//span[@class='a-dropdown-container']
//		System.out.println("STEP 7: PASS - Items are sorted as per NEW ARRIVAL option");
		
		WebElement Sort = Driver.findElement(By.xpath("//select[@id='s-result-sort-select']"));
		Select Options_Sort = new Select(Sort);
		Options_Sort.selectByIndex(4);
		//Options_Sort.selectByValue("Newest Arrivals");
		System.out.println("STEP 7: PASS - Items are sorted as per NEW ARRIVAL option");
		
// 08) Print the first resulting bag info (name, discounted price)
		String first_result_bag  = Driver.findElement(By.xpath("(//span[contains(@class,'a-size-base-plus')])[2]")).getText();
		System.out.println("STEP 8.1: PASS - The first resulting item name is: "+first_result_bag);
		//div[@class='a-section a-spacing-small puis-padding-left-micro puis-padding-right-micro'][1]
		//(//span[contains(@class,'a-size-base-plus a-color-base')])[2]
		//a[contains(@class,'a-link-normal s-underline-text')]//span
		String first_result_Cost  = Driver.findElement(By.xpath("(//span[@class='a-price'])[1]")).getText();
		System.out.println("STEP 8.2: PASS - The first resulting item Cost is: "+first_result_Cost);

// 09) Get the page title and close the browser(driver.close())
		String Web_Page_title = Driver.getTitle();
		System.out.println("STEP 9.1: PASS - The tittle of web page is:" +Web_Page_title);

		Driver.close();
		System.out.println("STEP 9.2: PASS - Browser Closed");
		}

}
