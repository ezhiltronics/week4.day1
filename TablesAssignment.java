package week4.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TablesAssignment {

	public static void main(String[] args) {
		
		        // Opening the Browser
		
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver = new ChromeDriver();
				
				// Opening the URL
				
				driver.get("http://www.leafground.com/pages/table.html");
				driver.manage().window().maximize();
				
				 
				WebElement elementTable= driver.findElement(By.xpath("//table"));
			       
			       List<WebElement> rows = elementTable.findElements(By.tagName("tr"));
			       
			       int size = rows.size();
			       
			       System.out.println("The count of the Row is " + size);
			       
			    // Get the count of number of columns
				     
			       List<WebElement> cols =rows.get(1).findElements(By.tagName("td"));
			     	  	  
			       System.out.println("The count of the Column is " + cols.size());
			       
			    //Get the progress value of 'Learn to interact with Elements'
			       
			        System.out.println("The progress values of...,");
			   
			        System.out.println(rows.get(2).getText());
			        
			        System.out.println(rows.get(3).getText());
			        
			        System.out.println(rows.get(4).getText());
			    	  
			    //Check the vital task for the least completed progress.	 
			        
			        driver.findElement(By.xpath("(//input[@name='vital'])[5]")).click();
			    	   
			       
			       driver.close();
		}
				
	
}
