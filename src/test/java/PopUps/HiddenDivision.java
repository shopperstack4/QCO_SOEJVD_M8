package PopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HiddenDivision {

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
				driver.get("https://www.redbus.in/");
				driver.findElement(By.xpath("//span[text()='Date']")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//div[text()='Sep']/../../..//span[text()='21']")).click();

	}

}
