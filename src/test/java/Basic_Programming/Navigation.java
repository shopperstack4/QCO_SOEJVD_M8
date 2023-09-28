package Basic_Programming;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigation {

	public static void main(String[] args) throws Throwable {
		// driver management statement
		WebDriverManager.edgedriver().setup();
		// upcasting statement
		WebDriver driver = new EdgeDriver();
		// maximizing the window
		driver.manage().window().maximize();
		// use of get method
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		//Navigating from one URL to another URL
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.close();
		
		

	}

}
