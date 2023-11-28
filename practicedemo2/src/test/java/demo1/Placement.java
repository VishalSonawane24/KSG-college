package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Placement {

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.ksgcollege.com/");
		
	//1.Ensure that the placement details like'Placement Cell,Placement Office,Companies,Career'Sections are visible and open after clicking on them.
        //1.1.Click on the'Placement'link(section)
		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[6]/a")).click();
		//1.2.Click on the Placement Cell to see details
	    driver.findElement(By.cssSelector("#navbarSupportedContent > ul > li:nth-child(7) > ul > li:nth-child(1) > a")).click();
	    //1.3.Click on the Placement office to see details in it.
	    driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[6]/ul/li[2]/a")).click();
	    //1.4.Click on the Companies to see details in it.
	    driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[6]/ul/li[4]/a")).click();
	    //1.5.Click on the Career to see details
	    driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[6]/ul/li[5]/a")).click();
	
	}

}
