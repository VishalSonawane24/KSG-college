package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Course {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.ksgcollege.com/");
		
		//Clicking on the'Course'link to open it and should able to see different courses.
		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/ul/li/a")).click();
		
		//After clicking on Course link,user should able to see UG course
		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/ul/li/ul/li[1]/a")).click();
		
		//After clicking on Course link,user should able to see PG course
		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/ul/li/ul/li[2]/a")).click();
				

	}

}
