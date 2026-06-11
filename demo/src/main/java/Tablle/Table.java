package Tablle;

import java.nio.channels.WritableByteChannel;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize(); 
		 driver.get("https://testautomationpractice.blogspot.com/");
		 
		 
	int rows=	 driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		 System.out.println("  "+ rows);


	}

}
