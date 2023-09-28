package TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviders {
	@DataProvider
	public Object[][] getData(){
		Object[][] a = new Object[3][2];
		a[0][0] = "sasi";
		a[0][1] = "kala";
		
		a[1][0] = "Hi";
		a[1][1] = "Hello";
		
		a[2][0] = "Java";
		a[2][1] = "Selenium";
		
		return a;
	}
	
	@Test(dataProvider = "getData")
	public void demo(String username, String password) throws Throwable {
		// driver management statement
				WebDriverManager.edgedriver().setup();
				// upcasting statement
				WebDriver driver = new EdgeDriver();
				// maximizing the window
				driver.manage().window().maximize();
				
				//implicit wait statement
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				driver.get("https://www.facebook.com/");
				
				driver.findElement(By.id("email")).sendKeys(username);
				driver.findElement(By.id("pass")).sendKeys(password);
				Thread.sleep(2000);
				driver.close();
				
	}
}
