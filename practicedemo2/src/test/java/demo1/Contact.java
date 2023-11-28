package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Contact {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	   driver.get("https://www.ksgcollege.com/");
	   
		//1.Verify that all the contact details are showing or not after clicking on 'CONTACT'
         driver.findElement(By.xpath(" //*[@id=\"navbarSupportedContent\"]/ul/li[9]/a")).click();
	    
         //1.2.Verify that all the fields are available for contact and user can able to fill it and contact.
	       
           //1.2.1.User should able to fill his name in'Your Name'.
           driver.findElement(By.name("name")).sendKeys("Vishal Sonawane");
           
          //1.2.2.User should able to fill his Email in'Email'.
           driver.findElement(By.name("email")).sendKeys("vishalsonawane2411@gmail.com");
	
         //1.2.2.User should able to fill his Email in'Email'.
           driver.findElement(By.name("email")).sendKeys("vishalsonawane2411@gmail.com");
	 
         //1.2.3.User should able to fill his subjects  in'Subject'section
           driver.findElement(By.name("subject")).sendKeys("For Contact");
	
         //1.2.3.User should able to fill his phone number in'Phone'section
           driver.findElement(By.name("phone")).sendKeys("7410184232");
           
         //1.2.3.User should able to write his message in'Message'section
           driver.findElement(By.name("message")).sendKeys("");
	
       //2.Verify that the address is on the page is correct or not.
	       driver.findElement(By.linkText("Address")).click();
	
	  //3.Verify that the address which is provided on location is correct or not.
	       driver.findElement(By.linkText("Location")).click();
	 
	 
	}

}
