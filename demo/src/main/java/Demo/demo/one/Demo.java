package Demo.demo.one;




import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class Demo {
 
	 public static void main(String[] args) {
		
		 
		    System.out.println("Hello World!");

	        WebDriver driver = new FirefoxDriver();
			driver.get("https://www.flipkart.com/");
	        driver.manage().window().maximize();
//	        using classname
	        driver.findElement(By.className("Pke_EE")).sendKeys("Mobile");
	    //    driver.findElement(By.linkText("Minutes")).click();
	        

	      

	        System.out.println("Login successful, page title: " + driver.getTitle());
		 
		 
	}
		
		
		
		
	

		    

	


		
		
		
		
		

	}


