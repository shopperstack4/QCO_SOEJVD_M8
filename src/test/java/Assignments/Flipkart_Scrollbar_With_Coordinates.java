package Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart_Scrollbar_With_Coordinates {

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
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		//address of career
		WebElement faq = driver.findElement(By.xpath("//a[text()='FAQ']"));
	    Point coOrdinates = faq.getLocation();
	    int x = coOrdinates.getX();
	    int y = coOrdinates.getY();
		//downcasting
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
		Thread.sleep(3000);
		//career.click();
		js.executeScript("arguments[0].click();", faq);

	}

}
