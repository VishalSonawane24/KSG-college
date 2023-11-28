package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OnlinePayment {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.ksgcollege.com/");
		
		//1.We have to Verify that there is the clear link/button is present to access the payment page.
        driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[10]/a")).click();
		//1.Verify the 'Pay' button available for payment and after clicking on that,User should able to see page of transaction or payment method.
        driver.findElement(By.id("btnsubmit")).click();
		
		
		
		
		
		
		
		
	}

}
