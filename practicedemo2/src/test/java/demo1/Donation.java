package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Donation {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.ksgcollege.com/");
		
		//1.Clicking on 'DONATION' link/button
        driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[11]/a")).click();
        
      
        
		
		
	}

}
