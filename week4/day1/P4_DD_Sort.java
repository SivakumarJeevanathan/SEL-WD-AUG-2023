package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4_DD_Sort 
{
	public static void main(String[] args) 
	{
		/*
		Hints: Look what is common locator for all price info of every phone. 
		*/
		System.out.println("* * * Automation Script to sort the options * * *");
        ChromeDriver driver = new ChromeDriver(); // 1. Go to  https://amazon.in
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://amazon.in");
		//Driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phones");
		//Driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phones",Keys.ENTER); // 2. Type phones -> id: twotabsearchtextbox
		
/*
		System.out.println("* * * Automation Script_1 to sort the web elements * * *");
 		List<String> sortPrice=new ArrayList<String>(); //--> Connect to Line 38
		List<WebElement> price = driver.findElements(By.xpath("//span[@class='a-price-whole']")); //locate multiple element		
		System.out.println("The Total no of web elements found in this page is: "+price.size()); //print list size Trying to print the web element directly 
		for (int i = 0; i <price.size() ; i++) 
		{
			String Text = price.get(i).getText();//" 10,999" here we get all the elements as a String
			sortPrice.add(Text); //--> Connect to Line 30
		}
		System.out.println("The list values before sorting: "+sortPrice); //print the list before sorting
		Collections.sort(sortPrice); //Arrange the list using sorting 
		System.out.println("The list values after sorting: "+sortPrice); //print the sorted list
*/

/*
		System.out.println("* * * Automation Script_2 to sort the web elements * * *");
		
		List<String> Price_list_Sorted = new ArrayList<String>(); // Store the values of DD in ArrayList
		List<WebElement> Price_list = driver.findElements(By.xpath("//span[@class='a-price-whole']")); // 3. Print price of every phone -> class: a-price-whole//span[@class='a-price-whole']
		for (int i = 0; i<Price_list.size(); i++) 
		{
			System.out.println("The list of Prices available in the web page is: "+Price_list.get(i).getText());
			String Price_List_Text = Price_list.get(i).getText();
			Price_list_Sorted.add(Price_List_Text); // Element added into array
		}
		
		System.out.println("The list values before sorting: "+Price_list_Sorted);
		Collections.sort(Price_list_Sorted); // Use Collection sort to get the lowest price
		System.out.println("The list values after sorting: "+Price_list_Sorted);
*/

		System.out.println("* * * Automation Script_3 to sort the web elements * * *");

		List<Integer> Price_list_Sorted = new ArrayList<Integer>();
		List<WebElement> Price_list = driver.findElements(By.xpath("//span[@class='a-price-whole']")); //locate multiple element
		System.out.println("The Total no of web elements found in this page is: "+Price_list.size()); //print list size Trying to print the web element directly 
		for (int i = 0; i <Price_list.size() ; i++) 
		{
			System.out.println("The list of Prices available in the web page is: "+Price_list.get(i).getText());
			String Price_List_Text = Price_list.get(i).getText(); //" 10,999" here we get all the elements as a String
			String ReplaceAll = Price_List_Text.replaceAll("[^0-9]","");// Replace the " 10,999" as "10999", by empty using REGEX
			int parseInt = Integer.parseInt(ReplaceAll); //Convert the string value into integer using 'Integer - wrapper class and parseInt() Method'
			Price_list_Sorted.add(parseInt); // Element added into array	
		}
		
		System.out.println("The list values before sorting: "+Price_list_Sorted);
		Collections.sort(Price_list_Sorted); // Use Collection sort to get the lowest price
		System.out.println("The list values after sorting: "+Price_list_Sorted);
		
		System.out.println("Lowest Price:"+Price_list_Sorted.get(0)); //print lowest value,0 index return lowest result

		driver.close();
	}
}

/*
NOTES:Failed

STEPS:
(1) Locate the web elements (Multiple) and assign it to 'LIST <Webelement>'
(2) Use FOR Loop, using the SIZE() Method.
(3) ListName.get().getText() --> here the GET Method return type is WEB ELEMENT then the GETTEXT() will convert it to STRING.
(4) Sort the values using Collections.sort() Method but here the SORT() cant sort the web element as (SORT will accept only LIST (STRING or INT) not possible for web element)
(5) Hence we need to create a new list which can store the web element. 
(6) Assign a local variable to the web element (STEP 3) to a STRING and then add() those values into new list (STEP 5).
(7) Convert the string value into integer using 'Integer - wrapper calss and parseInt() Method'
(8) Add the element into array using add()
(9) Sort the values using Collections.sort()

SYNTAX:
LIST<WRAPPERCLASS> LIST_NAME = new ArrayList<WRAPPERCLASS>();  -->  List<Integer> Price_list_Sorted = new ArrayList<Integer>();
*/