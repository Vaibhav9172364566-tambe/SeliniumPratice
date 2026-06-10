package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();
		 
	//	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 
		 driver.get("https://testautomationpractice.blogspot.com/");
		 driver.manage().window().maximize();
		 
		 WebElement select=driver.findElement(By.xpath("//select[@id='country']"));
		 
		 Select dropdrown=new Select(select);
		 dropdrown.selectByValue("japan");
		 dropdrown.selectByValue("india");

		 

	}

}
