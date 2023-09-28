package WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Getter_GetSize {

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
		driver.get("https://www.facebook.com/");
		//email textfield
		WebElement ele = driver.findElement(By.id("email"));
		Dimension dimensions = ele.getSize();
		int h = dimensions.getHeight();
		int w = dimensions.getWidth();
		System.out.println(h);
		System.out.println(w);
	}

}
