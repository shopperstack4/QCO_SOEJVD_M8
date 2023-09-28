package Dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_SingleDropdown {

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
		driver.get("https://www.amazon.in/");
		WebElement dd = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		// create an object for select class
		Select s = new Select(dd);
		s.selectByIndex(3);
		Thread.sleep(3000);
		s.selectByValue("search-alias=baby");
		Thread.sleep(3000);
		s.selectByVisibleText("Car & Motorbike");
		System.out.println(s.isMultiple());
		List<WebElement> options = s.getOptions();
		System.out.println(options.size());
		for(WebElement b:options) {
			System.out.println(b.getText());
		}

	}

}
