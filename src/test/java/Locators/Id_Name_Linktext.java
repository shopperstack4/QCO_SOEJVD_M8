package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Id_Name_Linktext {

	public static void main(String[] args) {
		// driver management statement
				WebDriverManager.edgedriver().setup();
				// upcasting statement
				WebDriver driver = new EdgeDriver();
				// maximizing the window
				driver.manage().window().maximize();
				// use of get method
				driver.get("https://www.facebook.com/");
				// address of email textfield
				driver.findElement(By.id("email")).sendKeys("asdfghj");
				//address of password textfield
				driver.findElement(By.name("pass")).sendKeys("asdfghjkl");
				//address of login button
				driver.findElement(By.name("login")).click();

	}

}
