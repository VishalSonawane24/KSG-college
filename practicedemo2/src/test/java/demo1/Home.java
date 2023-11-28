package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Home {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.ksgcollege.com/");
		
		//1.Clicking on the homepage(Loading of Homepage),After clicking on homepage,user should able to see and open the 'Online Admission Open-2023' and
		driver.findElement(By.linkText("Home")).click();
		
		//2.Clicking on 'Online Admission Open-2023'form should open the Admission Form-2023
		driver.findElement(By.xpath("//*[@id=\"category-part\"]/div/div/div/div[1]/div[2]/center/a")).click();
		
	}

}
