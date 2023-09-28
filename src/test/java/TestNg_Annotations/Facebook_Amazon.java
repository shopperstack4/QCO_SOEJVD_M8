package TestNg_Annotations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook_Amazon {
	WebDriver driver;
	@Test
	public void amazon() {
		driver.get("https://www.amazon.in/");
	}
	@Test
	public void facebook() {
		driver.get("https://www.facebook.com/");
	}
	@BeforeMethod
	public void basic_steps() {
		// driver management statement
				WebDriverManager.edgedriver().setup();
				// upcasting statement
				driver = new EdgeDriver();
				// maximizing the window
				driver.manage().window().maximize();
				
				//implicit wait statement
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	@AfterMethod
	public void closing() throws Throwable {
		Thread.sleep(3000);
		driver.close();
	}

}
