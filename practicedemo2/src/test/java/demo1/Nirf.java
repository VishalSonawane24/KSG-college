package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nirf {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	   driver.get("https://www.ksgcollege.com/");
	   
	   //1.User should able to click on NIRF section/link.
	   driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[8]/a")).click();     
		 
	   
	   //1.1. We have to Verify that NIRF section is open after clicking on it and showing all the important  information about 'NIRF'
	   driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[8]/ul/li/a")).click();     
	 
	  //1.2. Now we have to Verify that the 'Download' button is showing and form is ready to download after clicking on it.
	   driver.findElement(By.className("main-btn")).click();
	
	
	}

}
