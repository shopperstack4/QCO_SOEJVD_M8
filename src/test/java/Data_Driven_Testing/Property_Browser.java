package Data_Driven_Testing;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Property_Browser {

	public static void main(String[] args) throws Throwable {
		//create an object for properties class
				Properties p =new Properties();
				//Create an object for physical file
				FileInputStream fis = new FileInputStream(".//src\\test\\resources\\Data.properties");
				p.load(fis);
				String urlApp = p.getProperty("url");
				String user = p.getProperty("username");
				String password = p.getProperty("password");
				String browser = p.getProperty("browser");
				WebDriver driver;
				if(browser.equals("edge")) {
					WebDriverManager.edgedriver().setup();
					
					//upcasting state ent
					driver = new EdgeDriver();
				}
				else {
					WebDriverManager.firefoxdriver().setup();
					
					//upcasting state ent
					driver = new FirefoxDriver();
				}
				//maximizing the window
				driver.manage().window().maximize();
				//implicit
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				//use of get method
				driver.get(urlApp);
				driver.findElement(By.id("email")).sendKeys(user);
				driver.findElement(By.id("pass")).sendKeys(password);
	}

}
