package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Css_Method {

	public static void main(String[] args) throws Throwable {
		// driver management statement
		WebDriverManager.edgedriver().setup();
		// upcasting statement
		WebDriver driver = new EdgeDriver();
		// maximizing the window
		driver.manage().window().maximize();
		// use of get method
		driver.get("https://www.facebook.com/");
		//address of email textfield
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("Sarojini");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Sarojini@01");
		Thread.sleep(4000);
		//address of forgotten password link
		//driver.findElement(By.linkText("Forgotten password?")).click();
		driver.findElement(By.partialLinkText("Forgotten")).click();
		

	}

}
