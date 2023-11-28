package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Service {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver();
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://www.ksgcollege.com/");
        
        //1.Verify 'SERVICE' section is open after clicking on it.
        driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[7]/a")).click();
        
        //2.Now we have to check that all sub-section of SERVICE are open after clickinhg on it.
         
        //2.1.Clicking on 'Scholorship' section/link.
            driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[7]/ul/li[1]/a")).click();
           
            //2.2.Clicking on 'Prof.Subbiah Yoga Centre'
            driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[7]/ul/li[2]/a")).click();
	      
            //2.3.Clicking on 'Group Insurance'
            driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[7]/ul/li[3]/a")).click();
	       
            //2.4.Clicking on 'Research Programme'
            driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[7]/ul/li[4]/a")).click();
	        
            //2.5.Clicking on 'UOW'
            driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[7]/ul/li[5]/a")).click();
	
	}; 

}
