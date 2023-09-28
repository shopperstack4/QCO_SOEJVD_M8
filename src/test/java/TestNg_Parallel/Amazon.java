package TestNg_Parallel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
	@Test
	public void amz() {
		// driver management statement
				WebDriverManager.edgedriver().setup();
				// upcasting statement
				WebDriver driver = new EdgeDriver();
				// maximizing the window
				driver.manage().window().maximize();
				//implicit wait statement
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				// use of get method
				driver.get("https://www.amazon.in/");
		
	}

}
