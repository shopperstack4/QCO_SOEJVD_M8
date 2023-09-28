package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XPath_Methods {

	public static void main(String[] args) {
		// driver management statement
				WebDriverManager.edgedriver().setup();
				// upcasting statement
				WebDriver driver = new EdgeDriver();
				// maximizing the window
				driver.manage().window().maximize();
				// use of get method
				driver.get("https://www.facebook.com/");
				//address of email text field by xpath attribute
				driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Sarojini");
				//address of password text field by xpath contans attribute
				driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("Sarojini@01");
				//address of forgotten password by xpath text
				//driver.findElement(By.xpath("//a[text()='Forgotten password?']')).click();
				//address of forgotten password by xpath contains text
				driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]")).click();
				

	}

}
