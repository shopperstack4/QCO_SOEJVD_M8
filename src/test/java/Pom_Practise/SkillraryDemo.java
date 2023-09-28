package Pom_Practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import POM.SkillraryDemoLoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SkillraryDemo {

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
				driver.get("https://demoapp.skillrary.com/");
				//Object creation
				SkillraryDemoLoginPage sd = new SkillraryDemoLoginPage(driver);
				Actions a = new Actions(driver);
				a.moveToElement(sd.getCourseEle()).perform();
				
				sd.pythonElement();
	}

}
