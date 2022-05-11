package week4.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CountOfRowsAndColumns {
	
	public static void main(String[] args) {
		
		        // Opening the Browser
		
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver = new ChromeDriver();
				
				// Opening the URL
				
				driver.get("https://html.com/tags/table/");
				driver.manage().window().maximize();
				
				// Getting the Count of the Rows
				
				WebElement elementTable= driver.findElement(By.xpath("//div[@class='related-pages']"));
			       
		        List<WebElement> rows =elementTable.findElements(By.tagName("tr"));
		      
		        int rowssize= rows.size();
		      
		        System.out.println("The size of the Row is " + rowssize);
		    
		      
	           // Getting the Count of the Columns
		     
		       List<WebElement> columns=rows.get(1).findElements(By.tagName("td"));
		     	  	  
		       System.out.println("The size of the Column is " + columns.size());
		       
		       driver.close();
	}

}
