package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facilities {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.ksgcollege.com/");
		
	  //Clicking on'Facilities'link Check the Facilities open after clicking on that 
		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")).click();

	  //Check the transportation images like bus is showing after clicking on facilities
		driver.findElement(By.xpath("//*[@id=\"page-banner\"]/div/div/div/div/h2[1]")).click();
		
	  //Verify that facilities section showing all the facilities i.e.Sports,Laboratories,Library,Hostel
	  //1.User should able to open Sports section
	   driver.findElement(By.id("overview-tab")).click();
	
	  //2.User should able to open Laboratories section
	   driver.findElement(By.id("curriculum-tab")).click();
	   
	  //3.User should able to open Library section
	   driver.findElement(By.id("instructor-tab")).click();
	   
	  //4.User should able to open Hostel section
	   driver.findElement(By.id("reviews-tab")).click();
		
	}

}
