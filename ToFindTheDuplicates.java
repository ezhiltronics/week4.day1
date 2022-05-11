package week4.day1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToFindTheDuplicates {
	
	public static void main(String[] args) {
		
		// Opening the Browser
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		// Opening the URL
		
		driver.get("https://www.chittorgarh.com/");
		driver.manage().window().maximize();
		
		// Click the Stock Market
		
		driver.findElement(By.id("navbtn_stockmarket")).click();
		
		// Click on the NSE Bulk Deals

		driver.findElement(By.xpath("//*[@id=\"nav_stockmarket\"]/div/div/div[2]/a[2]")).click();
		
		// Getting all the Security Names
		
		WebElement elementTable= driver.findElement(By.xpath("//div[@class='table-responsive']"));
	      
		List<WebElement> rows = elementTable.findElements(By.tagName("tr"));
		Set<String> colSet = new HashSet<String>();
		List<String> colList = new ArrayList<String>();
		
		for(int i=1;i<rows.size();i++)
		{
			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			
			//printing security name column 
			
			System.out.println("Security name:"+cols.get(2).getText());
			colSet.add(cols.get(2).getText());
			colList.add(cols.get(2).getText());
			
		}
			// To check whether duplicate value is present in security Name column
		
			if(colSet.size()==colList.size())
			{
				System.out.println("Duplicate values not available in Security Name column");
			}
			else
			{
				System.out.println("Duplicate values are available in Security Name column");
			}
			
			driver.close();
	}

}
