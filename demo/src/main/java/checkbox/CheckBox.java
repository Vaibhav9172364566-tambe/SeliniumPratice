package checkbox;

import java.sql.Driver;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		
		WebDriver drvier =new ChromeDriver();
		drvier.get("https://testautomationpractice.blogspot.com/");
		
		drvier.manage().window().maximize();
		
		// drvier.findElement(By.xpath("//input[@id='sunday']")).click();
		
		List<WebElement> checkbox= drvier.findElements(By.xpath("//input[@class='form-check-input']"));
		
		for(WebElement select : checkbox){
			
			select.click();
		}
		
	}
}
