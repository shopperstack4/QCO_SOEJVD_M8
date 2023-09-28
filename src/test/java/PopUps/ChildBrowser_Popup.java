package PopUps;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChildBrowser_Popup {

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
		driver.get("https://skillrary.com/");
		String parent = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();
		driver.findElement(By.xpath("(//a[text()=' SkillRary Essay'])[2]")).click();
		Set<String> child = driver.getWindowHandles();
		for(String b:child) {
			driver.switchTo().window(b);
		}
		driver.findElement(By.id("mytext")).sendKeys("Sarojini");
		Thread.sleep(3000);
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//a[text()='CATEGORIES']")).click();
		Thread.sleep(3000);
		//driver.close();
		driver.quit();

	}

}
