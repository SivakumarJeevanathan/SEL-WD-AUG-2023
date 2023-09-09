package week2.day1.classroom;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSel 
{
	public static void main(String[] args) 
	{
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	//driver.get("https://www.irctc.co.in/nget/");
	System.out.println("Browserlaunched and application is accessed");
	driver.close();
	}

}
