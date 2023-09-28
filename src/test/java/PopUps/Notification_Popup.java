package PopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Notification_Popup {

	public static void main(String[] args) {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saoji\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\"");
		
		// upcasting statement
		WebDriver driver = new ChromeDriver(option);
		// maximizing the window
		driver.manage().window().maximize();
		
		//implicit wait statement
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		// use of get method
		driver.get("https://www.quikr.com/bangalore");

	}

}
