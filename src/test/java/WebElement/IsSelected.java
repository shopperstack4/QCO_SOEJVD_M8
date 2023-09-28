package WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsSelected {

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
		//address of create an account
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		//address of female text field
		WebElement radiobtn = driver.findElement(By.xpath("//input[@value='1']"));
		radiobtn.click();
		if(radiobtn.isSelected()) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}

	}

}
