package TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertions {
	WebDriver driver;
	@Test
	public void Facebook() {
		// driver management statement
				WebDriverManager.edgedriver().setup();
				// upcasting statement
				WebDriver driver = new EdgeDriver();
				// maximizing the window
				driver.manage().window().maximize();
				//implicit statement
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				// use of get method
				driver.get("https://www.facebook.com/");
				String title = driver.getTitle();
				//Hard Assert
				//Assert.assertEquals(title, "asdfgh");//false now
				//soft assert
				SoftAssert s = new SoftAssert();
				s.assertEquals(title, "asdfgh");//false
				System.out.println(title);
	}
	@Test
	public void closePurpose() {
		driver.close();
	}
}
