/*
package week4.day1;
 
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4_CR_Amazon 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https:www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bags",Keys.ENTER); //search box pass input phone
		
		List<Integer> sortPrice = new ArrayList<Integer>(); //store the String of element change into List of Integer
		
		List<WebElement> price = driver.findElements(By.xpath("span[@class='a-price-whole']")); //locate multiple element
		
		System.out.println(price.size()); //print list size
		
		for (int i = 0; i <price.size() ; i++) 
			{
				String text = price.get(i).getText(); // " 10,999" get all element from list as a String
				Thread.sleep(2000);
				String replaceAll = text.replaceAll("[^0-9]+",""); //10999 replace the , by empty
			System.out.println(replaceAll);
			
			convert string into integer
			int parseInt = Integer.parseInt(replaceAll);
			add the converted data to new list
			sortPrice.add(parseInt);element add into list
		}
		
		Arrange the list 
		Collections.sort(sortPrice);
		print the list
		System.out.println(sortPrice);
		print lowest value,0 index return lowest result
		System.out.println("Lowest Price:"+sortPrice.get(0));
		remove duplicate
		
		create set convert list into set
		Set<Integer> duplicate =new LinkedHashSet<Integer>(sortPrice);
		
		print the set
		System.out.println(duplicate);
		System.out.println("Size of Set"+ duplicate.size());
	}

}

*/

/* 
package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4_CR_Amazon 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https:www.amazon.in/");

		 Search for bags
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bags", Keys.ENTER);

		 Get the prices of all the bags
		List<WebElement> prices = driver.findElements(By.xpath("span[@class='a-price-whole']"));

		 Convert the prices to integers
		List<Integer> pricesInIntegers = new ArrayList<Integer>();
		for (WebElement price : prices) {
			String text = price.getText();
			String replaceAll = text.replaceAll("[^0-9]", "");
			pricesInIntegers.add(Integer.parseInt(replaceAll));
		}

		 Sort the prices in ascending order
		Collections.sort(pricesInIntegers);

		 Print the lowest price
		System.out.println("Lowest price: " + pricesInIntegers.get(0));

		 Remove duplicates
		Set<Integer> uniquePrices = new LinkedHashSet<Integer>(pricesInIntegers);

		 Print the unique prices
		System.out.println("Unique prices: " + uniquePrices);
		System.out.println("Size of unique prices: " + uniquePrices.size());

		driver.close();
	}

}

*/

package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4_CR_Amazon 
{
	public static void main(String[] args) 
		{
			ChromeDriver driver = new ChromeDriver();
			driver.get("https:www.amazon.in/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones", Keys.ENTER);
	
			List<WebElement> price = driver.findElements(By.xpath("span[@class='a-price-whole']"));
	       // after convert string into Integer need to change the List Generic type
			List<Integer> sortPrice = new ArrayList<Integer>();

			for (int i = 0; i < price.size(); i++) 
				{
					String text = price.get(i).getText();
					// replace the , by empty
					String replaceAll = text.replaceAll("[^0-9]", "");
					// convert string into integer
					int parseInt = Integer.parseInt(replaceAll);
					// add the converted data to new list
					sortPrice.add(parseInt);
				}
		
		System.out.println(sortPrice.size());
		// Arrange the list 
		Collections.sort(sortPrice);
		// print the list
		System.out.println(sortPrice);
		// print lowest value,0 index return lowest result
		System.out.println(sortPrice.get(0));
		//set to remove duplicate convert list into set
		// set size
	}

}


/*
NOTES:

Failed

*/