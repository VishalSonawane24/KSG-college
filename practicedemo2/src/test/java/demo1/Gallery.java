package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Gallery {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		
		driver.get("https://www.ksgcollege.com/");
		
		//Click on'Gallery' to Check that the gallery page displays images related to the college
        driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[3]/a")).click();
		
        //Click on any image to view it in full size
		driver.findElement(By.xpath("//*[@id=\"teachers-page\"]/div/div/div[1]/div/div/a/img")).click();
	}

}
