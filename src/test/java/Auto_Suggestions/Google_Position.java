package Auto_Suggestions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google_Position {

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
		driver.get("https://www.google.com/");
		//address of search text field
		driver.findElement(By.xpath("//textarea[@type='search']")).sendKeys("computer");
		Thread.sleep(3000);
		
		WebElement value = driver.findElement(By.xpath("(//li[@data-view-type='1'])[4]"));
		System.out.println(value.getText());
		Thread.sleep(3000);
		driver.close();
	}

}
