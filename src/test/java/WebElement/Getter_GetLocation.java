package WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Getter_GetLocation {

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
		//System.out.println(ele.getLocation());
		Point coOrdinates = ele.getLocation();
		int x =coOrdinates.getX();
		int y =coOrdinates.getY();
		
		System.out.println(x);
		System.out.println(y);

	}

}
