package Pom_Practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import POM.Facebook_Login_Page;
import io.github.bonigarcia.wdm.WebDriverManager;

public class facebook {

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
				driver.get("https://facebook.com/");
				//Creating an object for POM class
				Facebook_Login_Page fblogin=new Facebook_Login_Page(driver);
				fblogin.emailTextField("sarojini");
				fblogin.passwordTextField("asdfghjkl");
				fblogin.loginButton();

	}

}
