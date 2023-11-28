package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alumni {

	public static void main(String[] args) 
	{
		
		WebDriverManager.chromedriver();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ksgcollege.com/");
		
		driver.manage().window().maximize();
	
		//1.Alumni (Clicking on 'Alumni' section) and after clicking on the alumni link,user able to see alumni registration link.
		
	    driver.findElement(By.xpath("//*[@id=\"header-part\"]/div[1]/div/div/div[2]/div/div[2]/ul/li[3]/a")).click();
	 
	   //After clicking on Alumni Registration,User should be able to open the registration form
	    
	    driver.findElement(By.linkText("ALUMNI REGISTRATION")).click();
	}

}
