package Locators;
//Fetch all the link web element name in a console

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Interview_Question {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		//Opening edge browser
		WebDriver driver = new EdgeDriver();
		//maximizing the browser
		driver.manage().window().maximize();
		//opens the browser
		driver.get("https://www.facebook.com/");
		 List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		 
		 for(WebElement b : allLinks) {
			 System.out.println(b.getText());
		 }
			 
	}

}
