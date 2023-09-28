package Frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Snapdeal {

	public static void main(String[] args) throws Throwable {
		// driver management statement
		WebDriverManager.edgedriver().setup();
		// upcasting statement
		WebDriver driver = new EdgeDriver();
		// maximizing the window
		driver.manage().window().maximize();
		
		//implicit wait statement
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
		// use of get method
		driver.get("https://www.snapdeal.com/");
		//address of signin
		WebElement signIn = driver.findElement(By.xpath("//span[text()='Sign In']"));
		//Actions class object
		Actions a = new Actions(driver);
		a.moveToElement(signIn).perform();
		// address of Register
		driver.findElement(By.xpath("(//span[text()='Register'])[1]")).click();
		//switching control to frame
		driver.switchTo().frame("loginIframe");
		//address of mobile text field
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number/ Email']")).sendKeys("1234567890");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-delete-sign fnt-22']")).click();
		//shifting control from frame to normal web page
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//input[@placeholder='Search products & brands']")).sendKeys("asdfgh");
		
	}

}
