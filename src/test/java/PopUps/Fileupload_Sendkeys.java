package PopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fileupload_Sendkeys {

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
				driver.get("https://www.foundit.in/");
				driver.findElement(By.xpath("//div[contains(text(),'Upload Resume')]")).click();
				driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\saoji\\Downloads\\Locators (1).pdf");

	}

}
