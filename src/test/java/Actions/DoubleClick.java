package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClick {

	public static void main(String[] args) {
		// driver management statement
				WebDriverManager.edgedriver().setup();
				// upcasting statement
				WebDriver driver = new EdgeDriver();
				// maximizing the window
				driver.manage().window().maximize();
				
				//implicit wait statement
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
				// use of get method
				driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
				//address of + icon
				WebElement plus = driver.findElement(By.id("add"));
				Actions a = new Actions(driver);
				a.doubleClick(plus).perform();

				// address of add to cart
				driver.findElement(By.xpath("(//button[text()=' Add to Cart'])")).click();
				driver.close();

	}

}
