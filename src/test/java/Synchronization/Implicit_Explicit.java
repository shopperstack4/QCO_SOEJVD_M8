package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Implicit_Explicit {

	public static void main(String[] args) {
		// driver management statement
		WebDriverManager.edgedriver().setup();
		// upcasting statement
		WebDriver driver = new EdgeDriver();
		// maximizing the window
		driver.manage().window().maximize();
		
		//implicit wait statement
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//explicit wait statement
		WebDriverWait wait = new WebDriverWait(driver,10);
		// use of get method
		driver.get("https://www.facebook.com/");
		WebElement eleTf = driver.findElement(By.xpath("//input[@id='email']"));
		//condition
		wait.until(ExpectedConditions.visibilityOf(eleTf));
		eleTf.sendKeys("asdfghj");
		//address of forgotten password link
		WebElement link = driver.findElement(By.xpath("//a[text()='Forgotten password']"));
		
		wait.until(ExpectedConditions.elementToBeClickable(link));
		link.click();
		

	}

}
