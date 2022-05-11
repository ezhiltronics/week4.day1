package week4.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class ToPrintGivenValues {

	public static void main(String[] args) {
		
		// Opening the Browser
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		// Opening the URL
		
		driver.get("https://html.com/tags/table/");
		driver.manage().window().maximize();
		
        WebElement Elementtable = driver.findElement(By.xpath("//div[@class='render']"));
         
        List<WebElement> rows = Elementtable.findElements(By.tagName("tr"));
        
        System.out.println("The Values are as follows...,");
        
        for(int i=1;i<rows.size();i++)
        {
        	List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
        	
        	System.out.println(cols.get(0).getText());
        	
        	driver.close();
        }
	}
	
}
