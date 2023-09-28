package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Snapdeal_Mouseover {

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
		driver.get("https://www.snapdeal.com/");
		//address of signin
		WebElement signIn = driver.findElement(By.xpath("//span[text()='Sign In']"));
		//Actions class object
		Actions a = new Actions(driver);
		a.moveToElement(signIn).perform();
		//address if login
		driver.findElement(By.xpath("//a[text()='login']")).click();

	}

}
