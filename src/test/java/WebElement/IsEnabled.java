package WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsEnabled {

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
				driver.get("https://www.facebook.com/");
				//address of email textfield
				driver.findElement(By.id("email")).sendKeys("asdfghjkl");
				driver.findElement(By.name("pass")).sendKeys("asdfghjkl");
				Thread.sleep(3000);
				WebElement btn = driver.findElement(By.xpath("//button[@name='login']"));
				if(btn.isEnabled()) {
					System.out.println("Entered to if block");
					btn.click();
				}else {
					System.out.println("Entered to else block");
				}
				

	}

}
