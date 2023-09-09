package week4.day1;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P2_GetDropdownvalues  
{
    public static void main(String[] args) throws InterruptedException 
    {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.leafground.com/select.xhtml");
        
// Step:1 Locate the dropdown web element using common tag (web element)
        List<WebElement> DD_Automation_tool = driver.findElements(By.xpath("//select [@class='ui-selectonemenu']"));// ctrl+2+l
        System.out.println("The Total number of options on web page is: "+DD_Automation_tool.size());
        System.out.println("The options avialbel in the Which is your favorite UI Automation tool? dropdown button are: ");
        for (int i = 0; i <=DD_Automation_tool.size(); i++) 
        {
            System.out.println(DD_Automation_tool.get(i).getText());
        }
        driver.close();
    }
}
