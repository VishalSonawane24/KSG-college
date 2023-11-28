package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class College {

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.ksgcollege.com/");
		
		//Click on 'College' and user should able to open this link
		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[2]/a")).click();
		
		//1.Click on'About College'link and link should be open after clicking on it\
		//driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[2]/ul/li[1]/a")).click();
		
		//2.Click on 'Achievement'link and it should be open and all achievement is showing or not
		//driver.findElement(By.linkText("Achievements")).click();
		
		//3.Click on'Events'link to see upcoming events
	    driver.findElement(By.cssSelector("#navbarSupportedContent > ul > li:nth-child(2) > ul > li:nth-child(7) > a")).click();
	
	    //4.Click on'College Committee' and user should be able to see all committee members like chairman,managing trustee,secretary,principal
	    driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[2]/ul/li[5]/a")).click();

	}
}
