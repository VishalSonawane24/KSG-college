package demo1;

import java.io.FileOutputStream;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;


public class loginpage1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	   driver.get("https://www.ksgcollege.com/");

//There are five main weblocators which we can use identify web elements
	//first we inspect username and password of staff login page
	   
	//1.Staff login(Username)
	   
	  //Using ID weblocators
	   
	 driver.findElement(By.id("exampleInputUsername")).sendKeys("vishalsonawane");//or we can use different weblocators for locate username 
	 driver.findElement(By.xpath("//*[@id=\"exampleInputUsername\"]")).sendKeys("vishalsonawane");
	
	 //2.Staff login(password)
	 
	 driver.findElement(By.id("exampleInputPassword")).sendKeys("vish@2411");
	 driver.findElement(By.xpath("//*[@id=\"exampleInputPassword\"]")).sendKeys("vish@2411") ; 
	
	 //3.for checkbox(Remember me),I am using CssSelector and xPath weblocators
	 
	 driver.findElement(By.cssSelector("#wrapper > div > div > div:nth-child(2) > div > div > form > div:nth-child(2) > div > div")).click();
	 driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div/div/div[2]/div/div/form/div[2]/div/div")).click() ; 
	
	 //4.for sign in button we can use Classname weblocator
	 driver.findElement(By.className("btn btn-danger shadow-danger btn-block waves-effect waves-light")).click();
	 
	 //5.for button( SIGN IN WITH FACEBOOK),We use xpath.
	 driver.findElement( By.xpath("//*[@id=\"wrapper\"]/div/div/div[2]/div/div/form/div[4]/button[1]")).click();
	 
	 //6.for button(SIGN IN WITH TWITTER),We use xpath
	 driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div/div/div[2]/div/div/form/div[4]/button[2]")).click();
	 
	 //7.for image (I have not written this test case in the manual,but for my knowledge i write it here.)
	
	  driver.findElement(By.cssSelector("#wrapper > div > div > div:nth-child(2) > div > div > div:nth-child(1) > img"));

	//8.Student login
	 
	 driver.findElement(By.cssSelector("#header-part > div:nth-child(1) > div > div > div:nth-child(2) > div > div.login-register > ul > li:nth-child(2) > a")).click();
	 
	} 
	
	

}
